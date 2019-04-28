package com.stanislavgrujic.microservicechassis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MicroserviceChassisApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceChassisApplication.class, args);
	}

}
