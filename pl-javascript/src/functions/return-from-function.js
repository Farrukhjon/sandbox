function returnFromCondition(array) {
    for (let i = 0; i < array.length; i++) {
        if(array[i] === -1) {
            return array[i];
        }
    }
}

console.log(returnFromCondition([0, -1, 2]))