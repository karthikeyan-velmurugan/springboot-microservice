package com.karthik.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroserviceApplication.class, args);
	}

}
