function findMinimalObjectByValue(map) {
    if (map.size === 0) {
        return null;
    }

    let minimalObject = null;

    [...map].reduce((prev, [key, value]) => {
        if (minimalObject === null || value < minimalObject[1]) {
            minimalObject = [key, value];
        }

        return prev;
    }, null);

    return minimalObject;
}

// Example usage:
const map = new Map([
    ["b", 2],
    ["c", 3],
    ["a", 1],
]);

const minimalObject = findMinimalObjectByValue(map);

console.log(minimalObject); // ["a", 1]