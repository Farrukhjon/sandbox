const {setTimeout} = require('node:timers/promises');

class ChangeStreamIterator {
    constructor(db, collectionNames) {
        this.db = db;
        this.changeStream = null;
        this.consumedChanges = [];
        this.collectionNames = collectionNames;
        this.running = false;
    }

    async start() {
        this.changeStream = this.db.watch([
                {
                    $match: {
                        'ns.coll': {$in: this.collectionNames},
                        operationType: {$in: ['insert', 'update', 'delete', 'replace']}
                    }
                },
            ],
            {
                fullDocument: 'updateLookup',
                fullDocumentBeforeChange: 'whenAvailable'
            });
        this.running = true;
        while (this.running) {
            try {
                const change = await this.changeStream.tryNext(); // Non-blocking
                if (change) {
                    this.consumedChanges.push(change);
                } else {
                    // No change, pause a bit to avoid busy loop
                    await setTimeout(50);
                }
            } catch (error) {
                if (this.changeStream.closed) {
                    break;
                }
                throw error;
            }
        }
    }

    stop() {
        this.running = false;
        if (this.changeStream) {
            this.changeStream.close();
        }
    }

    getChanges() {
        return this.consumedChanges;
    }
}

module.exports = ChangeStreamIterator;
