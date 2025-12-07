package com.example.springSecurity;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class springSecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(springSecurityApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello! Welcome";
    }
}
