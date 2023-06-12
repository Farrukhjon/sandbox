# Testing Asynchronous Code

## Literature and Resources

- [Chapter 27. Testing Asynchronous Code (Growing Object-Oriented Software, Guided by Tests, by N. Pryce)](https://learning.oreilly.com/library/view/growing-object-oriented-software/9780321574442/ch27.html)

## Issues with Testing Asynchronous Code

- inability to check immediately outcome of tests
- tests trigger activities that
    - run concurrently
    - run in non-blocking execution

In order to address above issues tests have to have **_observable_** effect.

There are two ways/strategies to achieve the observable effect:

- by **_sampling_** test's state
- by **_listening_** for event

## Sampling and Listening approaches

### Sampling (polling for a probe)

Sampling means

- repeatedly _polling_ the target system for a _state change_
- with a short _timeout_ and _delay_ between polls
- with _tunable frequency_ of polling
- checking if system has entered _an expected state_ (probe)

### Listening