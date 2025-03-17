// by Constructor Function
function Employee(firstName, lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.hello = function () {
        console.log("Hello " + this.firstName + " " + this.lastName + "!");
    }
}

const ali = new Employee("Ali", "Valiev");
const sami = new Employee("Sami", "Ganiev");
ali.hello();
sami.hello();

// by Prototyping
// Method is created by function prototype property:
Employee.prototype.goodbye = function () {
    console.log("Goodbye " + this.firstName + " " + this.lastName + "!");
}

const surayo = new Employee("Surayo", "Valieva");
const muhay = new Employee("Muhayo", "Ganieva");
surayo.goodbye();
muhay.goodbye();

// override hello method for a specific object:
surayo.hello();
surayo.hello = function () {
    console.log("Hello " + this.firstName + "!");
}
surayo.hello();
