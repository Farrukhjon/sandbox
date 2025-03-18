const {
    MongoClient,
    Db,
    ChangeStream,
    ChangeStreamOptions
} = require('mongodb');

class MongoDBChangeStream {

    /**
     * @type {ChangeStream}
     */
    changeStream;

    /**
     * @type {{fullDocument: string}}
     */
    options;

    changes;

    /**
     * Constructor.
     * @param db {Db}
     * @param collectionNames {[string]}
     */
    constructor(db, collectionNames) {
        this.db = db;
        this.collectionNames = collectionNames;
        this.running = false;
    }

    async start() {
        this.running = true;
        await this.handleChanges();
    }

    async stop() {
        this.running = false;
        if (this.changeStream) {
            await this.changeStream.close();
        }
    }

    async handleChanges() {
        this.changeStream = this.db.watch([
                {
                    $match: {
                        'ns.coll': {$in: this.collectionNames},
                        operationType: {$in: ['insert', 'update', 'delete', 'replace']}
                    }
                },
            ],
            {
                fullDocument: 'updateLookup'
            });
        while (this.running && await this.changeStream.hasNext()) {
            const change = await this.changeStream.next();
            this.changes.push(change);
        }
    }

    get changes() {
        return this.changes;
    }
}

module.exports = {
    MongoDBChangeStream,
}