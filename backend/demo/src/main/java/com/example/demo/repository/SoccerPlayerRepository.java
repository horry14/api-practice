package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.entity.SoccerPlayer;

public interface SoccerPlayerRepository extends JpaRepository<SoccerPlayer, Integer> {
}
