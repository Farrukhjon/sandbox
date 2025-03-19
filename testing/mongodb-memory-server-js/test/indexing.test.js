const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');

describe('Validation that index exists', () => {
    let replSet;
    let client;
    let db;
    const DB_NAME = 'test-db';
    const COLLECTION_NAME = 'tumblingCollection';

    beforeAll(async () => {
        replSet = await MongoMemoryReplSet.create({replSet: {storageEngine: 'wiredTiger'}});
        await replSet.waitUntilRunning();
        client = await MongoClient.connect(replSet.getUri(), {});
        db = client.db(DB_NAME);
    });

    afterAll(async () => {
        await client.close();
        await replSet.stop();
    });

    test('createIndex() and validate existence', async () => {
        const db = client.db();
        const users = db.collection('users');

        const indexName = await users.createIndex({email: 1}, {unique: true});
        expect(indexName).toBe('email_1');

        const indexes = await users.indexes();
        expect(indexes.length).toBeGreaterThan(1);
    });

    test('create compound index and test query performance', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.createIndex({firstName: 1, lastName: 1});
        await users.insertOne({firstName: 'John', lastName: 'Doe', age: 28});

        const explain = await users.find({firstName: 'John', lastName: 'Doe'}).explain();
        expect(explain.queryPlanner.winningPlan.inputStage.stage).toBeDefined();
    });

    test('dropIndex()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.createIndex({username: 1});
        const dropResult = await users.dropIndex('username_1');
        expect(dropResult.ok).toBe(1);
    });

    test('should create an index on __TumblingWindowDate', async () => {
        await db.createCollection(COLLECTION_NAME);
        await db.collection(COLLECTION_NAME).createIndex({__TumblingWindowDate: 1});

        const indexes = await db.collection(COLLECTION_NAME).indexes();
        const indexExists = indexes.some(index => {
            return index.key && index.key.__TumblingWindowDate === 1;
        });

        expect(indexExists).toBe(true);
    });

});

