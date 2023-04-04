# Architecture of Software (Applications)

## Literature and Resources

1. [Software Architecture](https://en.wikipedia.org/wiki/Software_architecture)
2. [Architectural Pattern](https://en.wikipedia.org/wiki/Architectural_pattern)
3. [Fundamentals of Software Architecture, by Mark Richards, Neal Ford](https://learning.oreilly.com/library/view/fundamentals-of-software/9781492043447/)
4. [Software Architecture Patterns, 2nd Edition by Mark Richards](https://learning.oreilly.com/library/view/software-architecture-patterns/9781098134280/)

## Definition

## Styles and Structures

### Monolithic Style

- Modular Monolith
- Microkernel

#### Pros and Cons of Monolithic architecture

### Distributed Style

#### Pros and Cons of Distributed architecture

### Architecture styles

- **Layered** Architecture
- **Microkernel** Architecture
- **Event-Driven** Architecture
- **Microservices** Architecture
- **Space-Based** Architecture

Application Architecture and Design

### Problem domain, Communications, Solutions (Styles and Patterns)

- Batch processing
    - Problem
        - Job and Task Scheduling/Management
        - Offline data processing
        - Reporting
    - Solution
        - Jobs & Tasks Pipeline
        - ETL
- Request-Response
    - Problem
        - Client/Server
    - Solution (Style/Pattern)
        - RPC/SOAP/XML
        - REST/JSON
        - gRPC/Protobuf
        - GraphQL
    - Abstraction/Data Structure
        - Procedure call
- Messaging (Queues and Exchanges/Routing)
    - Problem
        - Producer/Consumer
    - Solution (Style/Pattern)
        - JMS
        - AMQP
    - Abstraction/Data Structure
        - Queue
    - Tools and Frameworks
        - RabbitMQ and ActiveMQ Brokers
        - Spring JMS/AMQP and Spring Integration
- Event Streaming
    - Problem
        - Pipeline (data and tasks?)
        - Producer/Consumer
        - Stream Processing
            - Mapping
            - Transformation
            - Aggregation
    - Solution (Style/Pattern)
        - Streams of Logs
    - Abstraction/Data Structure
        - Commit Log (distributed)
    - Tools and Frameworks
        - Apache Kafka
            - Clients (Prod/Con) API
            - Kafka Streams API
        - Spring for Apache Kafka
- Reactive Event Streaming
    - Problem
        - Publisher/Subscriber/Processor (Pub/Sub)
        - Asynchronous
        - Non-Blocking
        - Backpressure
    - Solution (Style/Pattern)
        - Observer/Observable
        - Futures
        - Flow and Reactive Streams
        - Java Flow API and CompletableFuture
    - Abstraction/Data Structure
        - Stream of Data
    - Tools and Frameworks
        - Reactor (Project Reactor)
        - Spring WebFlux
        - RxJava (ReactiveX)
        - Akka & Akka Streams
