const {MongoClient} = require('mongodb');
const {MongoMemoryReplSet} = require('mongodb-memory-server');

describe('multi-member replica set', () => {
    test('should enter running state', async () => {
        const replSet = await MongoMemoryReplSet.create({replSet: {count: 3}});
        await replSet.waitUntilRunning();
        expect(replSet.servers.length).toEqual(3);
        expect(replSet.getUri().split(',').length).toEqual(3);

        await replSet.stop();
    });

    test('should be possible to connect replicaset after waitUntilRunning resolveds', async () => {
        const replSet = await MongoMemoryReplSet.create({replSet: {count: 3}});
        const con = await MongoClient.connect(replSet.getUri(), {});
        // await while all SECONDARIES will be ready
        await new Promise((resolve) => setTimeout(resolve, 45_000));
        const db = await con.db('admin');
        const admin = db.admin();
        const status = await admin.replSetGetStatus();
        expect(status.members.filter(m => m.stateStr === 'PRIMARY')).toHaveLength(1);
        expect(status.members.filter(m => m.stateStr === 'SECONDARY')).toHaveLength(2);

        await con.close();
        await replSet.stop();
    });
});