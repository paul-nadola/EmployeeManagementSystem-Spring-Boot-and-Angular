package com.fullstackApp.employeeManager.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Data
@AllArgsConstructor //decorators used to reduce boilerplate code - lombok generates a class that use all the fielsa of the class as parameters
@NoArgsConstructor //When you need a default constructor
@ToString
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;
    private String email;
    private String gender;

    //Establishing a one to many relationship between customer and products

    @OneToMany(targetEntity = Product.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "cust_product_fk", referencedColumnName = "id")
    private List<Product> productList;

}
