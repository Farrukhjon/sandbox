const square = (x) => x * x;

describe("square = (x) => x * y;", () => {
    it.each([1, 2])(
        `should return proper result when passed arguments is: %s`,
        (x) => {
            expect(square(x)).toEqual(4);
        }
    );
});

const add = (x, y) => x + y;

describe("add = (x, y) => x + y;", () => {
    it.each`
    x        | y        | result
    ${0}     | ${0}     | ${0}
    ${-1}    | ${-2}    | ${-3}
    ${1}     | ${2}     | ${3}
    ${99999} | ${99999} | ${199998}
  `(
        `should return proper result when passed arguments are: $x, $y`,
        ({x, y, result}) => {
            expect(add(x, y)).toEqual(result);
        }
    );
});