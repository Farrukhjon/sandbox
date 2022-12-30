// Constructor Function vs Class

console.log("// Constructor Function demo: function CarConstructorFunction(make, model, year){}")

function CarConstructorFunction(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;

    this.print = function () {
        console.log("Printing: this.print = function (){}")
        console.log("Make: " + this.make + " " + "Model: " + this.model + " " + "Year: " + this.year)
    }

    /*CarConstructorFunction.prototype.print = function () {
        console.log("Printing:")
        console.log("Make: " + this.make + " " + "Model: " + this.model + " " + "Year: " + this.year)
    }*/
}

const carConstructorFunction = new CarConstructorFunction('Eagle', 'Talon TSi', 1993);
carConstructorFunction.print()

console.log("// Class demo: class CarClass {\n    constructor(make, model, year){}")

class CarClass {
    constructor(make, model, year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    print() {
        console.log("Printing: print()")
        console.log("Make: " + this.make + " " + "Model: " + this.model + " " + "Year: " + this.year)
    }
}

const carClass = new CarClass('Eagle', 'Talon TSi', 1993);
carClass.print()
