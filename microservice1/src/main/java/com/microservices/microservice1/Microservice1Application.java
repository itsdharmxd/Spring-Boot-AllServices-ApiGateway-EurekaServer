package com.microservices.microservice1;

import ch.qos.logback.classic.spi.ILoggingEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *  GET  127.0.0.1:7001/ms1/v1/messages
 */
@EnableDiscoveryClient
@SpringBootApplication
@RestController
@RequestMapping("/messages")
@EnableFeignClients
public class Microservice1Application {
	@Autowired
	public Microservice2  microservice2;
	public static void main(String[] args) {
		SpringApplication.run(Microservice1Application.class, args);
		System.out.println("Microservice 1 running");

	}


 @GetMapping
	public ResponseEntity helloMesssage(){
/**
 * GET 127.0.0.1:8081/ms1/v1/message
 *    -Get 127.0.0.1:8081/ms2/v1/message  -> Hello from Microservice 2
 * @return
 */

	 String  response =microservice2.getMessage();

		return 	new ResponseEntity("Hello from Microservice1 "+"Response from M2 = "+response, HttpStatus.OK);
	}



}
