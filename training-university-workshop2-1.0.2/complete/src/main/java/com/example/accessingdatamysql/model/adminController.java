package com.example.accessingdatamysql.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;


public class adminController {
    private int id;
    private String name;
    private int credit;
    private int max_seat;

    public void setId(int id){
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setCredit(int credit){
        this.credit = credit;
    }

    public void setMax_seat(int max_seat){
        this.max_seat = max_seat;
    }
}
