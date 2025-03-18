const {MongoDBChangeStream} = require('../src/mongodb-change-stream');
const {MongoClient, Db, Collection} = require('mongodb');
const {MongoMemoryReplSet} = require('mongodb-memory-server');

const simulateAsyncPause = (timeOut = 1000) => new Promise(resolve => setTimeout(() => resolve(), timeOut));

describe('MongoDBChangeStream test suite', () => {

    /** @type {MongoMemoryReplSet}. */
    let mongodbServer;

    /** @type {MongoDBChangeStream}. */
    let mongoDBChangeStream;

    /** @type {MongoClient}. */
    let client;

    /** @type {Db}. */
    let db;

    /**
     * @type {Collection}
     */
    let collection;

    const collectionNames = ['user', 'address'];

    beforeAll(async () => {
        mongodbServer = await MongoMemoryReplSet.create({
            replSet: {storageEngine: 'wiredTiger'}
        });
        await mongodbServer.waitUntilRunning();
        let url = mongodbServer.getUri();
        client = await MongoClient.connect(url, {});
        db = client.db('testdb');
        collection = db.collection('users');
        await collection.insertOne({ _id: 'init-doc', value: 0 });
        mongoDBChangeStream = new MongoDBChangeStream(db, collectionNames);
    });

    afterAll(async () => {
        if (client) {
            await client.close();
        }
        if (mongodbServer) {
            await mongodbServer.stop();
        }
    });

    test('should track change stream via hasNext() and next()', async () => {
        //Running in background.
        const runningStream = mongoDBChangeStream.start();
        await simulateAsyncPause(200);

        await collection.insertMany([{name: 'Alice'}, {name: 'Bob'}]);

        await simulateAsyncPause(200);

        await mongoDBChangeStream.stop();
        await runningStream;

        const changes = mongoDBChangeStream.changes;

        expect(changes.length).toBe(2);
        const insertedDocs = changes
            .filter(change => change.operationType === 'insert')
            .map(change => change.fullDocument.name);
        expect(insertedDocs).toContain('Alice');
        expect(insertedDocs).toContain('Bob');
    });

});