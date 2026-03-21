package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello API Response";
    }

    @GetMapping("/api/user")
    public Map<String, Object> getUser() {
        return Map.of(
            "id", 1,
            "name", "Yuki",
            "email", "yuki@example.com"
        );
    }

}