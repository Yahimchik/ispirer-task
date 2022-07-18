package com.example.webapplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Egor Yahimovich
 * @version 1.0
 * @see SpringBootApplication
 */

@SpringBootApplication
public class WebApplication {

    /**
     * Starts server
     */

    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}
