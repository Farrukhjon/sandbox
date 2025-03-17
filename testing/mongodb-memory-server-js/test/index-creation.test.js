const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');

describe('Validation that index exists', () => {
    let replSet;
    let client;
    let db;
    const DB_NAME = 'test-db';
    const COLLECTION_NAME = 'tumblingCollection';

    beforeAll(async () => {
        replSet = await MongoMemoryReplSet.create({ replSet: { storageEngine: 'wiredTiger' } });
        await replSet.waitUntilRunning();
        client = await MongoClient.connect(replSet.getUri(), {});
        db = client.db(DB_NAME);
    });

    afterAll(async () => {
        await client.close();
        await replSet.stop();
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

