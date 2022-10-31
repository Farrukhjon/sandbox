# gRPC & Protocol Buffers (Protobuf)

## Literature & resources
 - [gRPC Documentation](https://grpc.io/docs/)
 - [gRPC Documentation - Java](https://grpc.io/docs/languages/java/)
 - [Awesome gRPC](https://github.com/grpc-ecosystem/awesome-grpc)
 - [REST vs GraphQL vs gRPC](https://blog.bitsrc.io/rest-vs-graphql-vs-grpc-684edfacf810)
 - [An introduction to gRPC and Protocol Buffers](https://grpc.io/docs/what-is-grpc/introduction/)
 - [Protocol Buffers](https://developers.google.com/protocol-buffers)
 - [Protocol Buffer Basics: Java](https://developers.google.com/protocol-buffers/docs/javatutorial)
 - [Language Guide (proto3)](https://developers.google.com/protocol-buffers/docs/proto3)
 - [Protocol Buffer Techniques](https://developers.google.com/protocol-buffers/docs/techniques)
   - [Streaming Multiple Messages](https://developers.google.com/protocol-buffers/docs/techniques#streaming)
   - [Large Data Sets](https://developers.google.com/protocol-buffers/docs/techniques#large-data)
   - [Self-describing Messages](https://developers.google.com/protocol-buffers/docs/techniques#self-description)
 - [Protocol Buffer Style Guide](https://developers.google.com/protocol-buffers/docs/style)

## gRPC
**What is gRPC?**
 - a **communication protocol**
 - **HTTP/2** is used by default
 - **full-duplex streaming**
 - **binary** format serialization/deserialization
 - **types** of communication
   - **Unary**
   - **Client-Streaming**
   - **Server-Streaming**
   - **Bidirectional Streaming**
 - **use cases**
   - low resource devices communication
     - IoT devices
     - smart devices
     - robotic
   - polyglot microservices communication
 - a client application can directly call a method on a server application
   - client/server sides can be in different machines
   - client calls remote object/method seeing that as local object/method

## Principles

### Sides of communication in gRPC
 - server side
 - client (or stub) side

### Scenarios of communication in gRPC
 - Unary RPC
 - Server-side streaming RPC
 - Client-side streaming RPC
 - Bidirectional RPC

### gRPC can use Protocol Buffers
 - as its **Interface Definition Language** (**IDL**)
 - as its underlying **message interchange format**
 - gRPC uses Protocol Buffers by default
   - (although it can be used with other data formats such as [JSON](https://grpc.io/blog/grpc-with-json/))

### gRPC compared to SOAP, REST and GraphQL

| Protocol | Data <br/> Format | Web API<br/> dev tool | State     | Use cases |
|----------|-------------------|-----------------------|-----------|-----------|
| SOAP     | XML               | Yes                   | Stateless |           |
| REST     | JSON              | Yes                   | Stateless |           |
| gRPC     | Protobuf          | Yes                   | Stateless |           |
| GraphQL  |                   | Yes                   | Stateless |           |


## Protocol Buffers (Protobuf)
**What are Protocol Buffers** (Protobuf in short)?
 - a serialization mechanism
   - for structured data
 - generating source code
   - for multiple programming languages
### Protobuf Style guide
#### File structure
 - Files should be named `lower_snake_case.proto` 
 - All files should be ordered in the following manner:
   - License header (if applicable)
   - File overview
   - Syntax
   - Package
   - Imports (sorted)
   - File options
   - Everything else

## Tools
 - [protobuf maven plugin](https://www.xolstice.org/protobuf-maven-plugin/)
   - `src/main/proto/` and `src/test/proto/` directories treated by `default` lookup