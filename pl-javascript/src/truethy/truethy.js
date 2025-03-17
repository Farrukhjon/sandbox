
let obj1  ={};
if(!obj1.param1) {
    console.log(`obj1.param1: ${obj1.prama1} is false!`);
}

obj1.param1 = "";
if(!obj1.param1) {
    console.log(`obj1.param1: ${obj1.param1} is false!`);
}

obj1.param1 = false;
if(!obj1.param1) {
    console.log(`obj1.param1: ${obj1.param1} is false!`);
}

obj1.param1 = false;
if(!obj1.param1) {
    console.log(`obj1.param1: ${obj1.param1} is false!`);
}

let doNotExist = !(obj1.param1);
console.log(doNotExist);

obj1.param1 = ""
doNotExist = !(obj1.param1);
console.log(doNotExist);

obj1.param1 = null;
doNotExist = !(obj1.param1);
console.log(doNotExist);