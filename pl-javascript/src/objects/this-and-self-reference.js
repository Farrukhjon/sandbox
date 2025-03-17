// node this-and-self-reference.js

let selfAndThisObj = {
    foo: "bar",
    func: function () {
        let self = this;
        console.log("outer func:  this.foo = " + this.foo); //outer func:  this.foo = bar
        console.log("outer func:  self.foo = " + self.foo); //outer func:  self.foo = bar
        (function () {
            console.log("inner func:  self.foo = " + self.foo); //inner func:  self.foo = bar
            console.log("inner func:  this.foo = " + this.foo); //inner func:  this.foo = undefined
        }());
    }
}

selfAndThisObj.func();