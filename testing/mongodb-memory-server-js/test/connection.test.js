const {MongoMemoryReplSet} = require('mongodb-memory-server');
const {MongoClient} = require('mongodb');

describe('Mongodb Memory Server Tests Suit', () => {
    test('Should Successfully connect and pinged MongoDB Memory Server', async () => {
        let mongoReplSet, client;
        try {
            mongoReplSet = await MongoMemoryReplSet.create({replSet: {storageEngine: 'wiredTiger'}});
            await mongoReplSet.waitUntilRunning();
            const uri = mongoReplSet.getUri();
            console.log('MongoDB Memory Server is up at:', uri);
            client = await MongoClient.connect(uri, {});
            const adminDb = await client.db('admin');
            await adminDb.command({ping: 1});
            console.log('Successfully connected and pinged MongoDB Memory Server');
            console.log('MongoDB Version:', mongoReplSet.binary);
        } catch (err) {
            console.error('Could not connect to MongoDB Memory Server:', err);
        } finally {
            await client.close();
            await mongoReplSet.stop()
        }
    })
})