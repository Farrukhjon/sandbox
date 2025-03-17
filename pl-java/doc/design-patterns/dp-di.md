# Dependency Injection (DI)

    Dependency Injection (DI) - is a software design pattern and part of SOLID priciple
    separation Data and Behavior ob Object; Depend upon Abstraction but Do not depend
    upon Concretion.

## DI involves four elements

- Implementation of the Service object (AImpl, BImpl and CImpl);
- The client object depending on the service (ClientClass);
- The interface that Client (Demo) use to communicate with the Service
- The injector object which responsible for injection (in our case Factory object).