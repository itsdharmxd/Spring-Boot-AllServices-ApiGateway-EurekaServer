package com.microservices.microservice2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.ServerApplicationConfig;

/**
 *  GET  127.0.0.1:7002/ms2/v1/messages
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RequestMapping("/messages")
public class Microservice2Application {

	@Autowired
	ServerProperties serverProperties;

	public static void main(String[] args) {
		SpringApplication.run(Microservice2Application.class, args);
		System.out.println("Microservice 2 running");
	}
	@GetMapping
	public ResponseEntity helloMesssage(){

		System.out.println("M Service 2 "+serverProperties.getPort());

		return 	new ResponseEntity("Hello from Microservice2", HttpStatus.OK);
	}

}
