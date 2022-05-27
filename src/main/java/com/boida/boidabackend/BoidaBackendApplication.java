package com.boida.boidabackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BoidaBackendApplication {
    public static void main(String[] args) {
        SpringApplication.run(BoidaBackendApplication.class, args);
    }

    @GetMapping(path = "/api/hello/world")
    public String helloWorld() {
        return "Hello jinyoung";
    }
}
