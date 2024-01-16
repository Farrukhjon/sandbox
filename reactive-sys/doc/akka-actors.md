**Akka Actors**

Literature and Resources

1. [*Akka*](https://akka.io/)

2. [*Akka Actors
   Doc*](https://doc.akka.io/docs/akka/current/typed/index.html?_ga=2.170700192.1228976395.1659939350-725556129.1658930354)

3. [*Actor lifecycle • Akka
   Documentation*](https://doc.akka.io/docs/akka/current/typed/actor-lifecycle.html)

4. [*Akka API (Java)*](https://doc.akka.io/japi/akka/current/)

5. [<u>Actor Model
   Explained</u>](https://www.youtube.com/watch?v=ELwEdb_pD0k)

**Actor**

- is unit of computation

- operations:

    - create another actor

    - send message

    - designate how to handle the next message

- may **hold** its own private ***state***

- may **update** its own private ***state***

- ***is a lightweight thread***

- ***isolated*** from other actors

- don’t shared memory

- has its own ***mailbox*** (like message queue)

- FIFO order is used on processing messages

- message

    - is immutable data structure

- one message at a time processing approach

- ***addresses*** of other actors are used *to communicate with other
  actors*

- can supervise other actors (created by this actor)

**Actor System**

- *is a **hierarchical group of actors** which share common
  **configuration**, e.g. **dispatchers**, **deployments**, remote
  capabilities and **addresses**.*

- *is also the **entry point** for creating or looking up actors.*
