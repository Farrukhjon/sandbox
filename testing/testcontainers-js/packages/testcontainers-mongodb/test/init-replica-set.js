const { MongoClient } = require("mongodb");

const sleep = (ms) => new Promise((resolve) => setTimeout(resolve, ms));

const initReplicaSet = async () => {
    console.log("Waiting for MongoDB to start...");
    await sleep(30000); // Wait for 30 seconds to ensure MongoDB is fully started

    const uri = "mongodb://mongo1:27017";
    const client = new MongoClient(uri);

    let retries = 5;
    while (retries > 0) {
        try {
            console.log("Connecting to MongoDB...");
            await client.connect();
            const adminDb = client.db("admin");

            console.log("Initializing replica set...");
            const config = {
                _id: "rs0",
                members: [
                    { _id: 0, host: "mongo1:27017" },
                    { _id: 1, host: "mongo2:27017" },
                    { _id: 2, host: "mongo3:27017" },
                ],
            };
            const result = await adminDb.command({ replSetInitiate: config });
            console.log("Replica set initialization result:", result);
            break; // Exit the loop if successful
        } catch (error) {
            console.error("Error initializing replica set:", error);
            retries--;
            if (retries === 0) {
                throw error; // Throw the error if all retries fail
            }
            console.log(`Retrying in 10 seconds... (${retries} retries left)`);
            await sleep(10000); // Wait for 10 seconds before retrying
        } finally {
            console.log("Closing connection...");
            await client.close();
        }
    }
};
