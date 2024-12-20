package com.chatter.authservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Main class for the authentication service.
 */
@SpringBootApplication
public class AuthServiceApplication {
    /**
     * Entry point for the authentication service application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        SpringApplication.run(AuthServiceApplication.class, args);
    }

}
