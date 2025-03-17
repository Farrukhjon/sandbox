const {MongoClient} = require('mongodb');
const {MongoMemoryReplSet} = require('mongodb-memory-server');
const User = require('../src/models/user');

jest.setTimeout(10000); // increase timeout for async ops

describe('MongoDB Change Stream with mongodb-memory-server', () => {
    let mongod;
    let client;
    let db;
    let usersCollection;

    beforeAll(async () => {
        mongod = await MongoMemoryReplSet.create({replSet: {storageEngine: 'wiredTiger'}});
        await mongod.waitUntilRunning();
        // Connect using MongoClient
        client = await MongoClient.connect(mongod.getUri(), {
            useNewUrlParser: true,
            useUnifiedTopology: true,
        });
        db = client.db('testdb');
        usersCollection = db.collection('users');
    });

    afterAll(async () => {
        if (client) await client.close();
        if (mongod) await mongod.stop();
    });

    test('should detect insert event via change stream in a collection', async () => {
        const changes = [];

        const changeStream = usersCollection.watch([], {fullDocument: 'updateLookup'});

        changeStream.on('change', (change) => {
            changes.push(change);
        });

        // Give some time to ensure change stream is attached
        await new Promise((resolve) => setTimeout(resolve, 100));

        // Insert a document
        const doc = {name: 'Alice', email: 'alice@example.com'};
        await usersCollection.insertOne(doc);

        // Allow time for change stream event to be emitted
        await new Promise((resolve) => setTimeout(resolve, 200));

        // Assertions
        expect(changes.length).toBe(1);
        expect(changes[0].operationType).toBe('insert');
        expect(changes[0].fullDocument.name).toBe('Alice');
        expect(changes[0].fullDocument.email).toBe('alice@example.com');

        // Clean up
        await changeStream.close();
    });

    test('should detect insert on any collection in the db', async () => {
        const changes = [];

        const dbChangeStream = db.watch([], {fullDocument: 'updateLookup'});

        dbChangeStream.on('change', (change) => {
            changes.push(change);
        });

        // Allow listener to attach
        await new Promise((resolve) => setTimeout(resolve, 100));

        // Insert into "users" collection
        const users = db.collection('users');
        await users.insertOne({name: 'Alice', email: 'alice@example.com'});

        // Insert into "orders" collection
        const orders = db.collection('orders');
        await orders.insertOne({orderId: 123, item: 'Book'});

        // Allow change stream to catch events
        await new Promise((resolve) => setTimeout(resolve, 300));

        expect(changes.length).toBe(2);

        const userInsert = changes.find((ch) => ch.ns.coll === 'users');
        const orderInsert = changes.find((ch) => ch.ns.coll === 'orders');

        expect(userInsert.operationType).toBe('insert');
        expect(userInsert.fullDocument.name).toBe('Alice');

        expect(orderInsert.operationType).toBe('insert');
        expect(orderInsert.fullDocument.item).toBe('Book');

        await dbChangeStream.close();
    });

    test('should detect changes using async while iteration', async () => {
        const changes = [];

        const changeStream = db.watch([], {fullDocument: 'updateLookup'});

        // Start async change listener
        const changeReader = (async () => {
            while (changes.length < 2) {
                const change = await changeStream.next(); // waits for next change
                changes.push(change);
            }
        })();

        // Allow listener to initialize
        await new Promise((r) => setTimeout(r, 100));

        const users = db.collection('users');
        const orders = db.collection('orders');

        // Trigger changes
        await users.insertOne({name: 'Alice'});
        await orders.insertOne({orderId: 123});

        // Wait until 2 events are collected
        await changeReader;

        // Assertions
        expect(changes.length).toBe(2);

        const userInsert = changes.find(c => c.ns.coll === 'users');
        const orderInsert = changes.find(c => c.ns.coll === 'orders');

        expect(userInsert.operationType).toBe('insert');
        expect(userInsert.fullDocument.name).toBe('Alice');

        expect(orderInsert.operationType).toBe('insert');
        expect(orderInsert.fullDocument.orderId).toBe(123);

        await changeStream.close();
    });

    test('should capture all CRUD operations (Insert, Update, Replace, Delete)', async () => {
        const changes = [];
        const changeStream = db.watch([], {fullDocument: 'updateLookup'});

        // Async change reader - capture 4 events (one for each CRUD)
        const changeReader = (async () => {
            while (changes.length < 4) {
                const change = await changeStream.next();
                changes.push(change);
            }
        })();

        // Give some time to attach change stream
        await new Promise((r) => setTimeout(r, 100));

        const users = db.collection('users');

        // INSERT
        const insertResult = await users.insertOne({name: 'Alice', email: 'alice@example.com'});

        // UPDATE (partial update)
        await users.updateOne(
            {_id: insertResult.insertedId},
            {$set: {email: 'alice_updated@example.com'}}
        );

        // REPLACE (full doc replacement)
        await users.replaceOne(
            {_id: insertResult.insertedId},
            {name: 'Alice Replaced', email: 'alice_replaced@example.com'}
        );

        // DELETE
        await users.deleteOne({_id: insertResult.insertedId});

        // Wait for all change events to be collected
        await changeReader;

        // Assertions 🧠
        expect(changes.length).toBe(4);

        const insertEvent = changes.find(c => c.operationType === 'insert');
        const updateEvent = changes.find(c => c.operationType === 'update');
        const replaceEvent = changes.find(c => c.operationType === 'replace');
        const deleteEvent = changes.find(c => c.operationType === 'delete');

        // INSERT
        expect(insertEvent.fullDocument.name).toBe('Alice');
        expect(insertEvent.fullDocument.email).toBe('alice@example.com');

        // UPDATE
        expect(updateEvent.updateDescription.updatedFields).toHaveProperty('email', 'alice_updated@example.com');

        // REPLACE
        expect(replaceEvent.fullDocument.name).toBe('Alice Replaced');

        // DELETE
        expect(deleteEvent.documentKey._id.toString()).toBe(insertResult.insertedId.toString());

        await changeStream.close();
    });

    test('should listen only for selected collections and CRUD operations', async () => {
        const changes = [];

        // Simulating registered listeners
        const collectionListeners = new Map();
        collectionListeners.set('users', true);
        collectionListeners.set('orders', true);

        const changeStream = db.watch(
            [
                {
                    $match: {
                        'ns.coll': {$in: Array.from(collectionListeners.keys())},
                        operationType: {$in: ['insert', 'update', 'replace', 'delete']},
                    },
                },
            ],
            {fullDocument: 'updateLookup'}
        );

        const reader = (async () => {
            while (changes.length < 2) {
                const change = await changeStream.next();
                changes.push(change);
            }
        })();

        // Trigger INSERT into "users" → should be captured
        const users = db.collection('users');
        await users.insertOne({name: 'Alice'});

        // Trigger INSERT into "orders" → should be captured
        const orders = db.collection('orders');
        await orders.insertOne({orderId: 123});

        // Trigger INSERT into "logs" → should be IGNORED
        const logs = db.collection('logs');
        await logs.insertOne({event: 'ignored'});

        // Wait until reader catches first 2 changes
        await reader;

        // Assert only users/orders changes are captured
        expect(changes.length).toBe(2);

        const collectionsSeen = changes.map((ch) => ch.ns.coll);
        expect(collectionsSeen).toContain('users');
        expect(collectionsSeen).toContain('orders');
        expect(collectionsSeen).not.toContain('logs');

        await changeStream.close();
    });


    test('should read all changes and stop when no more appear', async () => {
        const waitForNextChange = async (changeStream, timeoutMs = 1000) => {
            return Promise.race([
                changeStream.next(),
                new Promise((_, reject) =>
                    setTimeout(() => reject(new Error('No more change events within timeout')), timeoutMs)
                ),
            ]);
        };

        const changes = [];
        const changeStream = db.watch([], {
            fullDocument: 'updateLookup',
        });

        const reader = (async () => {
            while (true) {
                try {
                    const change = await waitForNextChange(changeStream);
                    changes.push(change);
                } catch (err) {
                    if (err.message.includes('No more change events')) {
                        break; // done
                    } else {
                        throw err;
                    }
                }
            }
        })();

        const users = db.collection('users');
        await users.insertOne({name: 'Alice'});
        await users.insertOne({name: 'Bob'});
        await new Promise((r) => setTimeout(r, 100));

        await reader;

        expect(changes.length).toBe(2);
        expect(changes[0].fullDocument.name).toBe('Alice');
        expect(changes[1].fullDocument.name).toBe('Bob');

        await changeStream.close();
    });


});
