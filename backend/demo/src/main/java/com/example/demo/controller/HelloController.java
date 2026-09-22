package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;
import com.example.demo.entity.SoccerPlayer;
import com.example.demo.service.UserService;
import java.util.List;

@RestController
public class HelloController {

    @GetMapping("/api/hello")
    public String hello() {
        return "Hello API Response";
    }

    @GetMapping("/api/user/test")
    public Map<String, Object> getUser() {
        return Map.of(
            "id", 1,
            "name", "Yuki",
            "email", "yuki@example.com"
        );
    }

    private final UserService service;

    public HelloController(UserService service) {
        this.service = service;
    }

    @GetMapping("/api/user/{id}")
    public SoccerPlayer getUser(@PathVariable Integer id) {
        return service.getUserById(id);
    }

    @GetMapping("/api/user/all")
    public List<SoccerPlayer> getAllUsers() {
        return service.getUserAll();
    }
}