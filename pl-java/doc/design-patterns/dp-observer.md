# Observer Design Pattern

## Intent of the pattern is:

    To define a one-to-many relatinships between objects
    so that when one object changes state,
    all its dependent objects are notified and updated automatically.

## Problem to address

    - How can a one-to-many dependency between objects be defined without making the objects Tightly Coupled?
    - How can an object notify an open-ended number of other objects?

## The key idea of the pattern is:

    To establish a flexible notification-registration mechanism
    that notifies all registered objects automatically when an event of interest occurs.

## Solution

Define `Subject` and `Observer objects` so that when a subject `changes state`, all registered observers are `notified`
and `updated automatically`.

### Details of the solution:

    – Subject defines an interface for registering and unregistering observers:
        - register(Observer);
        - remove(Observer);
        - notifyObservers(); // i.e., by calling update() on all registered observers.
    – Observer defines an interface for updating state:
        - update(); // i.e., synchronizing observer's state with subject's state.
    - When a subject changes state, all registered observers are notified and updated automatically:
        for each observer in observers: observer.update();

## Benefits

    Enabling loosely coupling between Subject and Observers;
    The Subject and Observers have no explicit knowledge of each other;
    Event-driven mechanism (publish-subscribe interaction)
    The Subject is the publisher of notifications. Observers - subscribers.