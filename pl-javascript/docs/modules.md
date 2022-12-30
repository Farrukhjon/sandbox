# Modules (ECMAScript modules)

## Literature and resources

- [JavaScript modules](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Guide/Modules)
- [export](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/export)
- [import](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Statements/import)
- [Javascript Module Systems Showdown](https://auth0.com/blog/javascript-module-systems-showdown/)

## What is a module?

- is just `a container for` classes, functions, or values
- `an analog of a JavaScript module is a Maven artifact` or Java >=9 `platform module`, but `not package`

A module system provides the same benefits as classes provide for their class-users exposing public interface by hiding
private implementations, but module for programming at larger scales.
A module can make certain classes and functions available, while hiding others, so that the module’s evolution can be
controlled.

A module `provides` features (called the `exported`/`imported` features):

- classes
- functions
- objects
- arrays
- primitive values
- other values

Features that are not exported are private to the module.

## Modules are different from plain “scripts”:

- The code inside a module always executes in `strict mode`.
- `Each module has its own top-level scope` that is distinct from the global scope of the JavaScript runtime.
- `A module is only processed once` even if it is loaded multiple times.
- A module is `processed asynchronously`.
- A module `can contain` `import` and `export` statements.

## Export/Import modules

### Exporting modules

- the `export` declaration is used to export `features` a module
- exported features can then be `imported` into other programs with the `import` declaration or `dynamic import`
- when a module `updates` the `features` of a binding that it exports,
  the `update will be visible in its imported value`

#### Individual export example:

```js
export const name = 'square';

export function draw(ctx, length, x, y, color) {
    ctx.fillStyle = color;
    ctx.fillRect(x, y, length, length);
    return {length, x, y, color};
}
```

#### Exporting all items in a single export statement (at the end of a module file)

```js
export {someVar, someConst, someFunction, someObject, someArray, someClass};
```

#### Types of export modules

##### The Default export

- Names for export declarations `must be distinct from each other`
- Having exports with `duplicate names` will result in a SyntaxError
- Using `more than one` `default` will result in a SyntaxError
- Examples
  - `export default function (ctx) {}`

##### Named exports

- Examples
  - `export const soemConst = 'someConstValue';`
  - `export { someFunc, someObj };`
  - `export { someFunc as aliasSomeFunc, someObj as aliasSomeObj };`

### Importing modules

#### Types of import modules

##### The Default import

- Description
  - In a browser, the module location must be a full URL or <br/>a relative URL that starts with `./, ../, or /` <br/>
  - Node.js, you can use `a relative URL` that starts with `./, ../,` or a `file://` URL. You can also specify a
    package name
- Examples
  - `import DesiedName from './some_modules/some_file.mjs'`
  - `import DN from './some_modules/some_file.mjs'`

##### Named imports

- Description
- Examples
  - `import { someFunc, someObj } from './some_modules/some_file.mjs'`
  - `import { someFunc as aliasSomeFunc, someObj as aliasSomeObj } from './some_modules/some_file.mjs'`
  - `import * as someConsolidatedObj from './some_modules/some_file.mjs'`

##### Dynamic imports

The `import` keyword is used as if it were a function with the module location as argument:

```js
import(`./plugins/${action}.mjs`)
```

The dynamic import statement loads the module `asynchronously`:

```js
import(`./plugins/${action}.mjs`)
    .then(module => {
        module.default()
        module.namedFeature(args)
    ...
    })
```

The statement yields `a promise` for an object containing all exported features.

## Packaging Modules

### .mjs versus .js module source file extensions

When the JavaScript runtime reads the module content, it must know that it is processing a module and not a plain
script.

### In a Web browser

Load a module with a `script` tag whose type attribute is `module`

```js
<script type="module" src="./modules/someModuleFile.mjs"></script>
```

### In Node.js

Use the file extension `.mjs` to indicate that a file is a module.
If the plain `.js` extension going to be used, then it needs to be marked modules in the `package.json` configuration
file. When invoking the `node` executable in interactive mode, use the command-line option `--input-type=module`

### A note on file extensions

On the Web, the file extension doesn't really matter, as long as the file is served with the JavaScript MIME
type `text/javascript`.
The browser knows it’s a module because of the _type attribute on the script element_: `<script type="module">`

It's recommended to use the `.mjs` extension for modules, for these reasons:

- During development, the `.mjs` extension makes it crystal clear to you and anyone else looking at your project that
  the `file is a module` as `opposed to a classic script`.
- It’s not always possible to tell just by looking at the code.
- Modules are treated differently than classic scripts, so the difference is hugely important!
- It ensures that your file is parsed as a module by runtimes such as Node.js and d8, and build tools such as Babel.
- The `.mjs` extension is the cross-compatible way to ensure that files are treated as modules.
