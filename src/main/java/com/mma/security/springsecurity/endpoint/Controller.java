package com.mma.security.springsecurity.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/private")
    public String hello() {
        return "<h1>private endpoint</h1>";
    }

    @GetMapping("/public")
    public String publicHello() {
        return "<h1>public endpoint</h1>";
    }
}
