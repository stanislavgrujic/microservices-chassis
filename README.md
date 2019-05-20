# About
Referential implementation for [microservices chassis](https://microservices.io/patterns/microservice-chassis.html) using Java and Spring Boot.

# How to run
In order to have the chassis working properly, you should run the servers listed bellow.

## Config server
You can download it [here](https://github.com/stanislavgrujic/config-service), with basic configuration setup for all other projects.
Run it with `mvn spring-boot:run` in console, or from your IDE.

## Eureka server
Run Eureka server, for service discovery.
You can download one [here](https://github.com/stanislavgrujic/eureka-server).
Run it with `mvn spring-boot:run` in console, or from your IDE.

## Spring Boot Admin Server
Run Spring Boot Admin Server, for service monitoring.
You can download one [here](https://github.com/stanislavgrujic/spring-boot-admin-server).
Run it with `mvn spring-boot:run` in console, or from your IDE.

## Zipkin server
Run Zipkin server, for distributed tracing.
In order to run server with Eureka enabled discovery client, refer [here](https://github.com/stanislavgrujic/zipkin-server).

## Pong application
Download it from [here](https://github.com/stanislavgrujic/pong-application).
Run it with `mvn spring-boot:run` in console, or from your IDE.
