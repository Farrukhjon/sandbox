const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');

describe('MongoDB Transactions Test Suite', () => {
    /** @type {MongoClient} */
    let client;
    let session;
    let replSet;

    beforeAll(async () => {
        replSet = await MongoMemoryReplSet.create({ replSet: {storageEngine: 'wiredTiger'} });
        await replSet.waitUntilRunning();
        const uri = replSet.getUri();
        client = await MongoClient.connect(uri, { useUnifiedTopology: true });
    });

    afterAll(async () => {
        if (client) await client.close();
        if (replSet) await replSet.stop();
    });

    beforeEach(async () => {
        await client.db().dropDatabase();
    });

    test('Commit Transaction: Insert + Update', async () => {
        const db = client.db();
        const users = db.collection('users');

        session = client.startSession();
        session.startTransaction();

        try {
            await users.insertOne({name: 'Amy', age: 20}, {session});
            await users.updateOne({name: 'Amy'}, {$set: {age: 21}}, {session});
            await session.commitTransaction();
        } catch (err) {
            await session.abortTransaction();
            throw err;
        } finally {
            await session.endSession();
        }

        const result = await users.findOne({name: 'Amy'});
        expect(result.age).toBe(21);
    });

    test('Abort Transaction: Rollback on Error', async () => {
        const db = client.db();
        const users = db.collection('users');

        session = client.startSession();
        session.startTransaction();

        try {
            await users.insertOne({name: 'Jim'}, {session});
            // Simulate error
            throw new Error('Simulated failure ❌');
        } catch (err) {
            await session.abortTransaction();
        } finally {
            await session.endSession();
        }

        const result = await users.findOne({name: 'Jim'});
        expect(result).toBeNull();
    });
});
