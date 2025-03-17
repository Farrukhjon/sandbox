# Docker and Docker Compose

<!-- TOC -->

* [Docker and Docker Compose](#docker-and-docker-compose)
    * [Literature and Resources](#literature-and-resources)
    * [Docker Concepts](#docker-concepts)
        * [Docker CLI Client & Desktop](#docker-cli-client--desktop)
        * [Docker Host & Daemon](#docker-host--daemon)
        * [Docker Registry](#docker-registry)
        * [Docker Image](#docker-image)
        * [Docker Container](#docker-container)
        * [Dockerfile](#dockerfile)
    * [Docker Compose Concepts](#docker-compose-concepts)

<!-- TOC -->

## Literature and Resources

- [Docker Guides/Get started](https://docs.docker.com/get-started/)

## Docker Concepts

- Docker CLI Client & Desktop
- Docker Host & Daemon
- Docker Registry
- Docker Image
- Docker Container
- Dockerfile

### Docker CLI Client & Desktop

### Docker Host & Daemon

### Docker Registry

### Docker Image

### Docker Container

#### Run a Container

    docker run

-it: the container is interactive, which means the terminal’s standard input and output are attached to the container

--rm: the container will be removed when it is stopped

--name <aname>: the name of the container

-p <containerPortNum>:<hostPortNum>: maps port <containerPortNum> in the container to the <hostPortNum> port on the Docker host so that applications outside the container can communicate with

--link: <name>:<name>: tells the container that it can find ZooKeeper in the <name> container, which is running on the same Docker host

### Dockerfile

## Docker Compose Concepts
