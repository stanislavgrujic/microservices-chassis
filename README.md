# About
Referential implementation for [microservices chassis](https://microservices.io/patterns/microservice-chassis.html) using Java and Spring Boot.

# How to run
## Eureka server
Run Eureka server, for service discovery.
You can download one (here)[https://github.com/stanislavgrujic/eureka-server].

## Zipkin server
Run Zipkin server by running the following code
```
curl -sSL https://zipkin.io/quickstart.sh | bash -s
java -jar zipkin.jar
```

