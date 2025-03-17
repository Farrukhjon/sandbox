const {MongoMemoryReplSet} = require('mongodb-memory-server');


describe('MongoMemoryReplSet', () => {
    test('Should return an empty object', async () => {
        const replset = await MongoMemoryReplSet.create({replSet: {storageEngine: 'wiredTiger'}}); // This will create an ReplSet with 4 members and storage-engine "wiredTiger"
        const uri = replset.getUri();
        // The ReplSet can be stopped again with
        await replset.stop();

    })
})
// This will create an new instance of "MongoMemoryReplSet" and automatically start all Servers
