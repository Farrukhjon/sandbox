const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');

describe('CRUD Collection Methods Test Suite', () => {
    /** @type {MongoClient} */
    let client;

    /** @type {MongoMemoryReplSet} */
    let replSet;

    beforeAll(async () => {
        replSet = await MongoMemoryReplSet.create({
            replSet: {storageEngine: 'wiredTiger'}
        });
        await replSet.waitUntilRunning();
        const uri = replSet.getUri();
        client = await MongoClient.connect(uri, {});
    });

    afterAll(async () => {
        if (client) await client.close();
        if (replSet) await replSet.stop();
    });

    beforeEach(async () => {
        await client.db().dropDatabase();
    });

    test('insertOne() and updateOne()', async () => {
        const db = client.db();
        let usersCollection = db.collection('users');
        await usersCollection.insertOne(
            {
                firstName: 'Ali',
                lastName: 'Valizoda',
                age: 32
            }
        );
        let result = await usersCollection.findOne({firstName: 'Ali'});
        expect(result.firstName).toBe('Ali');
        expect(result.lastName).toBe('Valizoda');
        expect(result.age).toBe(32);

        await usersCollection.updateOne({firstName: 'Ali'}, {$set: {age: 40}});
        result = await usersCollection.findOne({firstName: 'Ali'});
        expect(result.age).toBe(40);
    });

    test('insertOne() and findOne()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Alice', age: 28});
        const result = await users.findOne({name: 'Alice'});

        expect(result).toBeDefined();
        expect(result.name).toBe('Alice');
    });

    test('insertMany() and find()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertMany([
            {name: 'John', age: 25},
            {name: 'Jane', age: 30}
        ]);

        const results = await users.find({}).toArray();
        expect(results.length).toBe(2);
    });

    test('updateOne() with upsert option', async () => {
        const db = client.db();
        const users = db.collection('users');

        let result = await users.updateOne(
            {name: 'Bob'},
            {$set: {age: 35}},
            {upsert: true}
        );

        expect(result.upsertedCount).toBe(1);

        result = await users.findOne({name: 'Bob'});
        expect(result.age).toBe(35);
    });

    test('updateMany()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertMany([
            {name: 'Tom', age: 22},
            {name: 'Tom', age: 23},
            {name: 'Tom', age: 24}
        ]);

        const result = await users.updateMany({name: 'Tom'}, {$set: {verified: true}});
        expect(result.modifiedCount).toBe(3);

        const updated = await users.find({verified: true}).toArray();
        expect(updated.length).toBe(3);
    });

    test('replaceOne()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Lara', age: 31, verified: false});
        const result = await users.replaceOne(
            {name: 'Lara'},
            {name: 'Lara', age: 31}
        );

        expect(result.modifiedCount).toBe(1);
        const user = await users.findOne({name: 'Lara'});
        expect(user.verified).toBeUndefined();
    });

    test('deleteOne()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Eve', age: 40});
        const result = await users.deleteOne({name: 'Eve'});
        expect(result.deletedCount).toBe(1);

        const user = await users.findOne({name: 'Eve'});
        expect(user).toBeNull();
    });

    test('deleteMany()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertMany([
            {name: 'Mike'},
            {name: 'Mike'},
            {name: 'Mike'}
        ]);
        const result = await users.deleteMany({name: 'Mike'});
        expect(result.deletedCount).toBe(3);

        const count = await users.countDocuments({name: 'Mike'});
        expect(count).toBe(0);
    });

    test('countDocuments()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertMany([
            {name: 'A'}, {name: 'B'}, {name: 'C'}
        ]);
        const count = await users.countDocuments({});
        expect(count).toBe(3);
    });

    test('estimatedDocumentCount()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertMany([
            {name: 'X'}, {name: 'Y'}, {name: 'Z'}
        ]);
        const estCount = await users.estimatedDocumentCount();
        expect(estCount).toBeGreaterThanOrEqual(3); // not always exact
    });

    test('bulkWrite()', async () => {
        const db = client.db();
        const users = db.collection('users');

        const result = await users.bulkWrite([
            {insertOne: {document: {name: 'Dan'}}},
            {updateOne: {filter: {name: 'Dan'}, update: {$set: {active: true}}}},
            {deleteOne: {filter: {name: 'Dan'}}}
        ]);

        expect(result.insertedCount).toBe(1);
        expect(result.modifiedCount).toBe(1);
        expect(result.deletedCount).toBe(1);
    });

    test('find().limit().sort()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertMany([
            {name: 'Alice', age: 10},
            {name: 'Bob', age: 30},
            {name: 'Eve', age: 20}
        ]);

        const result = await users.find({})
            .sort({age: -1})
            .limit(2)
            .toArray();

        expect(result[0].age).toBe(30);
        expect(result.length).toBe(2);
    });

    test('findOneAndUpdate()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Leo', age: 29});
        const result = await users.findOneAndUpdate(
            {name: 'Leo'},
            {$set: {age: 30}},
            {returnDocument: 'after'}
        );

        expect(result.age).toBe(30);
    });

    test('findOneAndReplace()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Anna', role: 'dev'});
        const result = await users.findOneAndReplace(
            {name: 'Anna'},
            {name: 'Anna', role: 'lead'},
            {returnDocument: 'after'}
        );

        expect(result.role).toBe('lead');
    });

    test('findOneAndDelete()', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Xander', age: 45});
        const result = await users.findOneAndDelete({name: 'Xander'});

        expect(result.name).toBe('Xander');
        const user = await users.findOne({name: 'Xander'});
        expect(user).toBeNull();
    });
});
