package com.microservices.ApiGatewaysApplication.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * client ->(ms1) API Gateway
 */

@Configuration
public class AptGateWayConfig {

   @Bean
   public RouteLocator getWayRoutes(RouteLocatorBuilder builder){

       return builder.routes().route(
               r->r.path("/ms1/v1/**")
                       .uri("lb://MICROSERVICE1")
       ).route(
              r->r.path("/ms2/v1/**")
                      .uri("lb://MICROSERVICE2")
       ).build();
   }





}
