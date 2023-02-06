package com.example.accessingdatamysql.service.repo.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name="STUDENTENROLL")
public class StudentEnroll {
    @Id
    @Column(name="STUDENTID")
    private Integer id;

    @Column(name="COURSE1")
    private Integer course1;

    @Column(name="COURSE2")
    private Integer course2;

    @Column(name="COURSE3")
    private Integer course3;

    @Column(name="COURSE4")
    private Integer course4;

    @Column(name="COURSE5")
    private Integer course5;



public StudentEnroll(){
}

public StudentEnroll(Integer id,Integer course1,Integer course2,Integer course3,Integer course4,Integer course5){
    this.id = id;
    this.course1 = course1;
    this.course2 = course2;
    this.course3 = course3;
    this.course4 = course4;
    this.course5 = course5;
}

public Integer getId() {
    return id;
}

public void setId(Integer id) {
    this.id = id;
}

public Integer getCourse1() {
    return course1;
}

public void setCourse1(Integer course1) {
    this.course1 = course1;
}

public Integer getCourse2() {
    return course2;
}

public void setCourse2(Integer course2) {
    this.course2 = course2;
}

public Integer getCourse3() {
    return course3;
}

public void setCourse3(Integer course3) {
    this.course3 = course3;
}

public Integer getCourse4() {
    return course4;
}

public void setCourse4(Integer course4) {
    this.course4 = course4;
}

public Integer getCourse5() {
    return course5;
}

public void setCourse5(Integer course5) {
    this.course5 = course5;
}


}