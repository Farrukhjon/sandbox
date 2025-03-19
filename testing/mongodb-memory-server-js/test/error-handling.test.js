const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');

describe('Error Handling Scenarios', () => {
    /** @type {MongoClient} */
    let client;
    let replSet;

    beforeAll(async () => {
        replSet = await MongoMemoryReplSet.create({replSet: {storageEngine: 'wiredTiger'}});
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

    test('insertOne() with duplicate _id error', async () => {
        const db = client.db();
        const users = db.collection('users');

        const doc = {_id: 'custom-id', name: 'Adam'};
        await users.insertOne(doc);

        await expect(users.insertOne(doc)).rejects.toThrow(/duplicate key error/);
    });

    test('updateOne() with invalid update operator', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Lana'});

        await expect(users.updateOne(
            {name: 'Lana'},
            {invalidOperator: {name: 'Lena'}}
        )).rejects.toThrow(/unknown top level operator/);
    });

    test('deleteOne() on non-existent document', async () => {
        const db = client.db();
        const users = db.collection('users');

        const result = await users.deleteOne({name: 'Ghost'});
        expect(result.deletedCount).toBe(0);
    });

    test('findOne() with malformed query', async () => {
        const db = client.db();
        const users = db.collection('users');

        await expect(users.findOne({$eq: {age: 20}})).rejects.toThrow();
    });
});
