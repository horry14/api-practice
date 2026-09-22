package com.example.demo.service;

import org.springframework.stereotype.Service;
import com.example.demo.entity.SoccerPlayer;
import com.example.demo.repository.SoccerPlayerRepository;
import java.util.List;

@Service
public class UserService {

    private final SoccerPlayerRepository repo;

    public UserService(SoccerPlayerRepository repo) {
        this.repo = repo;
    }

    public SoccerPlayer getUserById(Integer id) {
        return repo.findById(id).orElse(null);
    }

    public List<SoccerPlayer> getUserAll() {
        return repo.findAll();
    }
}
