# Problems are Solved by Reactive Streams

Literature and Resource

1. [<u>Reactive Streams -
   wiki</u>](https://en.wikipedia.org/wiki/Reactive_Streams)

2. [<u>The Reactive Manifesto</u>](https://www.reactivemanifesto.org/)

3. [<u>What is Reactive
   Programming?</u>](https://blog.redelastic.com/what-is-reactive-programming-bc9fa7f4a7fc)

4. [<u>A Journey into Reactive
   Streams</u>](https://blog.redelastic.com/a-journey-into-reactive-streams-5ee2a9cd7e29#.2wqcc3cja)

Reactive Streams is

- ***Asynchronous***

- ***Non-blocking***

- ***Backpressure***

- *Responsive*

- *Resilient (and/or Fault-tolerance)*

- *Elastic*

- *Stream/Message-driven*

- *Scalable*

- *Flexible*

- *Loosely-coupled*

- *Fast Data (vs Big data) and Real-Time*

Problems

- *Data flow problem*

- *Publish/Subscribe*

- *Asynchronous*

- *Large-Scale*

- *Resilient*

**Backpressure**

- Problem

    - Fast rate upstream publisher - Slow downstream Subscriber

- **Strategies** *(solutions)*

    - ***Drop*** message (oldest, newest, whole)

    - **Throw exception**/fail

    - ***Pull-based*** signal, slow down upstream publisher until there is
      space in subscribers buffer (by request for the next portion of
      messages (some number). Then publisher sends at-most such numbers of
      message
