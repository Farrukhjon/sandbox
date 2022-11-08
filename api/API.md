# API

## Literature and Resources
 1. [API](https://en.wikipedia.org/wiki/API)
 2. [Web API](https://en.wikipedia.org/wiki/Web_API)
 3. [OpenAPI Specification](https://swagger.io/specification/)
 4. [OpenAPIs](https://www.openapis.org/)
 5. [API Design Patterns, by John J. Geewax](https://learning.oreilly.com/videos/api-design-patterns/9781617295850AU/)

### What is API?
An API
  - stands for Application Programming Interface
  - is `a way for two or more computer programs` to `communicate` with each other
  - is `a contract` that define how applications, services, and components `communicate`
  - offers a `service` to other `pieces` of software
  - simplifies programming by `abstracting the underlying implementation`

### API specification
 - A document/standard that describes how to build/use such a connection or interface
 - When a user interface (UI) connects a computer to a person, an API connects computers or pieces of software to each other

### Categories of APIs
 - **Library/Framework-based API**
   - interface between application/programmer and libraries/frameworks/programming language built-in libs
 - **Operating System API (OS API)**
   - interface between an application and OS
 - **Network-based API (or Web API)**
   - client app and server/service app interface

### Web API
 - is `network-based API` (in contrast of `library-based` APIs)
 - a server-side web API is an interface consisting of one or more publicly `exposed endpoints`
 - defines request–response message system
 - expressed in JSON, XML or Protobuf data formats
 - exposed via an HTTP-based web server

#### Types of popular adopted Web APIs
 - **SOAP**
 - **REST**
 - **RPC**
   - **gRPC**
 - **GraphQL**

### Compatibility - Backward - Compatible API
Backwards - compatible API
 - when a client written against one version of an API will continue to work the same way against future versions of the API
 - API change satisfies two constraints:
   - New server version must be able to read existing clients call/requests
   - Old clients must be able to read return/responses of the new server version