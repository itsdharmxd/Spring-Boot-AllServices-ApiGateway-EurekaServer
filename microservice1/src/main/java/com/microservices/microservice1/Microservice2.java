package com.microservices.microservice1;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "MICROSERVICE2")
public interface Microservice2 {


@GetMapping("ms2/v1/messages")
    public String getMessage() ;



}
