const constructedFunction = new Function('a', 'b', "return a*b");

const tmp = constructedFunction(3, 4);
console.log(tmp);