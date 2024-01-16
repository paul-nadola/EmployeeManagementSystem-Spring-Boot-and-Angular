package com.fullstackApp.employeeManager.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor //decorators used to reduce boilerplate code - lombok generates a class that use all the fielsa of the class as parameters
@NoArgsConstructor //When you need a default constructor
@ToString
@Entity
public class Product {

    @Id
    private int pid;
    private String productName;
    private int quantity;
    private int price;
}
