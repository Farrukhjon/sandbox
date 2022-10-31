// Every `for-loop` expression can be expressed in terms of the three
// higher-order functions (HOFs): `map`, `flatMap`, and `withFilter`”

// `for (x <- expr1) yield expr2` is translated to `expr1.map(x => expr2)`