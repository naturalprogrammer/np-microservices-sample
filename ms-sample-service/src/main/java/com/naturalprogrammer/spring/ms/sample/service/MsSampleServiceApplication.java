package com.naturalprogrammer.spring.ms.sample.service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@SpringBootApplication
@RestController
@EnableResourceServer
public class MsSampleServiceApplication {

    @GetMapping("/")
    public Principal home(Principal user) {
        return user;
    }

    public static void main(String[] args) {
		SpringApplication.run(MsSampleServiceApplication.class, args);
	}
}
