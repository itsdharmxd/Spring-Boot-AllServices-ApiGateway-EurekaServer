package com.microservices.microservice1;

import org.springframework.cloud.loadbalancer.core.ServiceInstanceListSupplier;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadBalanceConfiguration {

    @Bean
    public ServiceInstanceListSupplier stickyLoadBalancing(ConfigurableApplicationContext ctx){
        return ServiceInstanceListSupplier.builder().withBlockingDiscoveryClient()
                .withSameInstancePreference().build(ctx);
    }
}
