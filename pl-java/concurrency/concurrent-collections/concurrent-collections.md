# The Java Concurrent Collections Framework

### BlockingQueue

- Defines a first-in-first-out data structure that blocks or times out when you attempt to add to a full queue, or
  retrieve from an empty queue.

### ConcurrentMap

- Is a sub-interface of java.util.Map that defines useful atomic operations.
- These operations remove or replace a key-value pair only if the key is present, or add a key-value pair only if the
  key is absent. Making these operations atomic helps avoid synchronization.
  The standard general-purpose implementation of ConcurrentMap is ConcurrentHashMap, which is a concurrent analog of
  HashMap.

### ConcurrentNavigableMap

- is a sub-interface of ConcurrentMap that supports approximate matches.
  The standard general-purpose implementation of ConcurrentNavigableMap is ConcurrentSkipListMap,
  which is a concurrent analog of TreeMap.

All of these collections help avoid Memory Consistency Errors by defining a happens-before relationship between an
operation that adds an object to the collection with subsequent operations that access or remove that object.