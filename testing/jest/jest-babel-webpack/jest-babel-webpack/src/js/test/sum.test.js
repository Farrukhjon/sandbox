const sum = require('../main/sum');

test.each([[1], [2]])("adds %s to %s to equal 3", (a, b) => {
    expect(sum(a, b)).toBe(3);
});
