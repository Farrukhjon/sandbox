**Akka Actor Model. Use Cases**

Literature and Resources

1.  [*Actor model - wiki*](https://en.wikipedia.org/wiki/Actor_model)

2.  [*Applied Akka Patterns by Michael Nash, Wade
    Waldron*](https://learning.oreilly.com/library/view/applied-akka-patterns/9781491934876/)

***Definition:** Actor is the fundamental unit of computation* (Carl
Hewitt)

**Note:** *You should not blindly run into every problem assuming that
the Actor Model will always be the best fit.*

**Use Case is about:** *who will be using it and how they will use it*

**When Is the Actor Model Appropriate?**

- *high degree of concurrency and you need to **maintain some sort of
  state***

- *сase for actors and the Actor Model is when you’re **modeling
  finite-state machines***

- *is when you need a high degree of concurrency, but you need to be
  careful in how that concurrency is managed*

- *multiple users to be able to concurrently modify projects in the
  system, but you don’t want those users to be able to modify the same
  project at the same time*

- 
