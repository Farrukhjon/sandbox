const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');

describe('Aggregation Pipeline Test Suite', () => {
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

    test('Aggregation: $match + $group + $sum', async () => {
        const db = client.db();
        const orders = db.collection('orders');

        await orders.insertMany([
            {customer: 'Alice', amount: 50},
            {customer: 'Alice', amount: 30},
            {customer: 'Bob', amount: 40}
        ]);

        const result = await orders.aggregate([
            {$match: {amount: {$gte: 30}}},
            {$group: {_id: '$customer', total: {$sum: '$amount'}}}
        ]).toArray();

        expect(result.find(r => r._id === 'Alice').total).toBe(80);
        expect(result.find(r => r._id === 'Bob').total).toBe(40);
    });

    test('Aggregation: $project fields', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertOne({name: 'Lisa', age: 34, location: 'Paris'});

        const result = await users.aggregate([
            {$project: {_id: 0, name: 1, location: 1}}
        ]).toArray();

        expect(result[0]).toEqual({name: 'Lisa', location: 'Paris'});
    });

    test('Aggregation: $sort + $limit', async () => {
        const db = client.db();
        const users = db.collection('users');

        await users.insertMany([
            {name: 'X', score: 50},
            {name: 'Y', score: 80},
            {name: 'Z', score: 60}
        ]);

        const result = await users.aggregate([
            {$sort: {score: -1}},
            {$limit: 2}
        ]).toArray();

        expect(result[0].score).toBe(80);
        expect(result.length).toBe(2);
    });
});
