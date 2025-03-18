const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');
const ChangeStreamIterator = require('../src/change-stream-iterator');
const {setTimeout} = require('node:timers/promises');

describe('ChangeStreamIterator Class Test Suite', () => {
    let replSet;
    let client;
    let db;
    let changeStreamIterator;

    beforeAll(async () => {
        replSet = await MongoMemoryReplSet.create({
            replSet: {storageEngine: 'wiredTiger'}
        });
        await replSet.waitUntilRunning();
        const uri = replSet.getUri();
        client = await MongoClient.connect(uri, {});
        db = client.db();
        changeStreamIterator = new ChangeStreamIterator(db, ['users']);
    });

    afterAll(async () => {
        if (client) {
            await client.close();
        }
        if (replSet) {
            await replSet.stop();
        }
    });

    test('should consume insert change events manually via the iterator methods', async () => {
        // Start listening in background
        const streamPromise = changeStreamIterator.start();

        // Perform inserts
        const collection = db.collection('users');
        await collection.insertMany([{name: 'Alice'}, {name: 'Bob'}]);

        // Give some time for events to be captured
        await setTimeout(300);
        await changeStreamIterator.stop();
        await streamPromise;
        const changes = changeStreamIterator.getChanges();
        expect(changes.length).toBe(2);
        const insertedDocs = changes
            .filter(change => change.operationType === 'insert')
            .map(change => change.fullDocument.name);
        expect(insertedDocs).toContain('Alice');
        expect(insertedDocs).toContain('Bob');
    });
});
