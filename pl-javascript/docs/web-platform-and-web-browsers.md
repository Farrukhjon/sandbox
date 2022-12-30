# The Web Platform. JavaScript In Web Browsers. Client-Side JavaScript

## Literature and Resources

- [Events](https://developer.mozilla.org/en-US/docs/Web/Events)
- [Browser Events Explained in Plain English](https://www.freecodecamp.org/news/javascript-events-explained-in-simple-english/)

## How to (Actions)

- Embed code within HTML pages
- Trigger code asynchronously by events
- Control document content and style
- Determine the on-screen position of document elements
- Create reusable user interface components
- Draw graphics
- Play and generate sounds
- Manage browser navigation and history
- Exchange data over the network
- Store data on the user’s computer
- Perform concurrent computation with threads

## Documents

## Components

## HTML DOM

## Events

Client-side JavaScript asynchronous event-driven programming model.
A web browser generates an `event` whenever something happens to

- the document
- browser
- some element
- an object associated with an element

### Event model

- event type
- event target
- event handler (event listener)
- event object
- event propagation

#### Event Type

- Mouse events
  - click
  - dblclick
  - mousemove
  - mouseover
  - mousewheel
  - mouseout
  - contextmenu
  - mousedown
  - mouseup
- Touch events
  - touchstart
  - touchmove
  - touchend
  - touchcancel
  - Keyboard events
  - keydown
  - keypress
  - keyup
- Form events
  - focus
  - blur
  - change
  - submit
- Window events
  - scroll
  - resize
  - hashchange
  - load
  - unload

### Event handler (event listener)

#### Ways of assigning event handlers to DOM elements

- with an HTML attribute
  - form
    ```js
        <element onSomeEvent = "event handler function"></element>
    ```
  - example
    ```js
        <button onclick = "alert('Hello world!')">Click Me</button>
    ```
- with DOM property
  - form
   ```js
        element = document.getElementById("someElement");
        element.onSomeEvent = someEventHandlerFunction
   ```
  - example
    ```js
        const button = document.getElementById("btn");
        button.onclick = function(){alert("Button has been clicked");}
    ```
- 
- with DOM property and `addEventListener/removeEventListener`
  - form
   ```js
        element = document.getElementById("someElement");
        element.addEventListener(event, eventHandler, [optional parameter]);
   ```
  - example
    ```js
        const button = document.getElementById("btn");
        button.addEventListener("click", event => {console.log(event.target);})
    ```  

## Browser BOM

## Graphics

## Audio

## Networking

## Storage

## Threads
