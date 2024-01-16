**Akka Actor Model**

**Use Cases, Patterns, Principles and Practices**

Literature and Resources

1.  [***Applied Akka Patterns**, by Michael Nash, Wade
    Waldron*](https://learning.oreilly.com/library/view/applied-akka-patterns/9781491934876/)

2.  [***Actor References, Paths and Addresses*** *• Akka
    Documentation*](https://doc.akka.io/docs/akka/current/general/addressing.html)

*A Problem domain:*

- *How to schedule a group of people across a variety of projects, while
  optimizing time they have available and their skill sets.*

**Principles**

**Rules to implement Actor model**

- ***Computation** rule*

  - *all computations are done <u>within</u> **an actor***

  - *an actor is a <u>unit of computation</u>*

  - *<u>everything is an actor</u> (like everything is an object in
    OOP)*

  - *every function and state variable could be its own actor*

  - *<u>state</u> of the actor is isolated (for direct modification)*

  - *<u>behavior</u> also is embedded into an actor*

- ***Communication** rule*

  - *actors can communicate only through messages*

  - *actors never expose their state or their behavior*

  - *an <u>actor has address</u>*

  - *<u>address</u> of an anchor is entry point for communication for
    that actor*

  - *address is used only indirectly, when messages are passed to it*

  - *an Akka Actor as message addressing uses Reference and Path (also
    has address component)*

  - *in Akka, most actor communication is done using <u>references</u>*

  - *messages are sent to <u>a mailbox</u> that exists at the address
    provided*

  - *Actor Model provides an <u>At-Most-Once guarantee of delivery</u>*

- ***Action (**in response to a message), an actor can:*

  - *<u>change its state</u>*

  - *<u>change its behavior</u>*

  - *<u>send</u> message to other actors*

  - *<u>create</u> a finite numbers of <u>child actors</u>*

<!-- -->

- Actors

<!-- -->

- Streams
