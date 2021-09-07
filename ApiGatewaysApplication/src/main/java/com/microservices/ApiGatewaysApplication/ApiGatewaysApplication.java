package com.microservices.ApiGatewaysApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewaysApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewaysApplication.class, args);
		System.out.println("Api Gateway running");
	}

}
