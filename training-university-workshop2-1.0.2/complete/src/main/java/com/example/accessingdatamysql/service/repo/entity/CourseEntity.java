package com.example.accessingdatamysql.service.repo.entity;


import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="COURSES")
public class CourseEntity {
    @Id
    @GeneratedValue(starategy=GenerationType.AUTO)
    @Column(name="ID", updateable=false)
    private int id;

    @Column(name="NAME")
    private String name;

    @Column(name="CREDIT")
    private int credits;

    @Column(name="MAXSEAT")
    private int maxseats;


    public CourseEntity(){

    }

    public CourseEntity(int id, String name, int credits, int maxseats){
        this.id = id;
        this.name = name;
        this.credits = credits;
        this.maxseats = maxseats;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getCredits(){
        return credits;
    }

    public void setCredit(int credits){
        this.credits = credits;
    }

    public int getMaxSeat(){
        return maxseats;
    }

    public void setMaxSeat(int maxseats){
        this.maxseats = maxseats;
    }
}
