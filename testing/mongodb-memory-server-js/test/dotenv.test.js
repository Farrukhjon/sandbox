describe('Dotenv test suit', () => {
    test('Dotenv test', () => {
        expect(process.env.MONGOMS_VERSION).toEqual('8.0.0')
        expect(process.env.MONGOMS_DOWNLOAD_URL).toEqual('https://fastdl.mongodb.org/osx/mongodb-macos-x86_64-8.0.0.tgz')
    });
});

