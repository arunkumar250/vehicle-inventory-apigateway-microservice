package com.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class ApiGateWayConfig {

    @Bean
    public RouteLocator myRoutes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("vehicleInventory", r -> r.path("/vehicleinventory/**")
                        .uri("http://localhost:9090"))
                .route("sales-service", r -> r.path("/sales/**")
                        .uri("http://localhost:9091"))
                .build();
    }
}
