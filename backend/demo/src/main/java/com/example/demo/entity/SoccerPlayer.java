package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "SoccerPlayers")
public class SoccerPlayer {

    @Id
    private Integer id;

    private String Name;
    private String Number;

    // getter / setter
    public Integer getId() { return id; }
    public void setId(Integer id) { this.id = id; }

    public String getName() { return Name; }
    public void setName(String Name) { this.Name = Name; }

    public String getNumber() { return Number; }
    public void setNumber(String number) { this.Number = number; }
}
