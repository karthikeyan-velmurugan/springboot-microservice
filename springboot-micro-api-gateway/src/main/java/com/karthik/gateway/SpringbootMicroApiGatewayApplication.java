package com.karthik.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableCircuitBreaker
public class SpringbootMicroApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootMicroApiGatewayApplication.class, args);
	}

}
