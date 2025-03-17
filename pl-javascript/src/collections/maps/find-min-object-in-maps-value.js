let personMap = new Map([
        [1, {name: "Ali", age: "18", gender: "man"}],
        [2, {name: "Vali", age: "33", gender: "man"}],
        [3, {name: "Sami", age: "33", gender: "man"}],
        [4, {name: "Surayo", age: "23", gender: "woman"}],
        [5, {name: "Muhayo", age: "22", gender: "woman"}],
    ]
);

console.log(personMap);

function findYoungestPersonInMap(personMap) {
    return [...personMap.values()].reduce((prevPerson, currPerson) => {
        return prevPerson.age <= currPerson.age ? prevPerson : currPerson;
    });
}

console.log(findYoungestPersonInMap(personMap));
