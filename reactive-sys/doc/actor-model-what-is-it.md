**Actor Model**

Literature and Resources

1.  [*Actor model - wiki*](https://en.wikipedia.org/wiki/Actor_model)

2.  [*Applied Akka Patterns by Michael Nash, Wade
    Waldron*](https://learning.oreilly.com/library/view/applied-akka-patterns/9781491934876/)

3.  [*Event-Based Programming without Inversion of Control Philipp
    Haller, Martin
    Odersky*](http://lampwww.epfl.ch/~odersky/papers/jmlc06.pdf)

**Computation In Actor Model**

- *All <u>computation</u> is performed <u>within an actor</u>*

  - *Every actor, when created, is <u>given an address</u>. This address
    is the entry point for communication with that actor. You cannot use
    the address to access the actor directly, but you can use it to send
    messages to that actor.*

  - *Akka separates the concept of an address from a <u>reference</u>.
    Most actor communication is done using <u>references</u>*

- *Actors can communicate <u>only through messages</u>*

- *In <u>response</u> to a message, an <u>actor can</u>:*

  - *Change its <u>state</u> or <u>behavior</u>*

  - *Send messages to other actors*

  - *<u>Create</u> a finite number of <u>child actors</u>*
