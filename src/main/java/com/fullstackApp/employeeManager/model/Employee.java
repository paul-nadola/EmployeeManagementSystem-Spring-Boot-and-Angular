package com.fullstackApp.employeeManager.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
// ALWAYS USE JAVA PERSISTENCE
import java.io.Serializable;

@Data
@Entity //MAKES SURE CLASS IS MAPPED TO ANY DATABASE
public class Employee implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, updatable = false)
    private long id;
    private String name;
    private String email;
    private String jobTitle;
    private String phone;
    private String imageUrl;
    @Column(nullable = false, updatable = false)

    private String employeeCode;

    @Override
    public String toString(){
        return "Employee{" +
                "id=" + id +
                ", name'" + name + '\'' +
                ", email'" + email + '\'' +
                ", jobTitle'" + jobTitle + '\'' +
                ", phone'" + phone + '\'' +
                ", imageUrl'" + imageUrl + '\'' +
                '}';
    }
}
