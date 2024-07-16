
package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * The main application class responsible for bootstrapping the Spring Boot application.
 */
@SpringBootApplication
public class ApiGateWayApplication {

    /*
     * The main method that starts the Spring Boot application.
     * @param args Command-line arguments passed to the application.
     */
    public static void main(String[] args) {
        SpringApplication.run(ApiGateWayApplication.class, args);
    }
}
