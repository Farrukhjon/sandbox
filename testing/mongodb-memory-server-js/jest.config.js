require('dotenv').config(); // Load .env before exporting config
module.exports = {
    verbose: true,
    roots: ['test/'],
    testTimeout: 45_000
};