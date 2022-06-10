package com.boida.api;

import com.boida.core.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(scanBasePackages = "com.boida")
@RestController
public class BoidaApiApplication {
    @Autowired
    private MyService myService;

    public static void main(String[] args) {
        SpringApplication.run(BoidaApiApplication.class, args);
    }

    @GetMapping(path = "/api/hello/world")
    public String helloWorld() {
        return myService.message();
    }
}
