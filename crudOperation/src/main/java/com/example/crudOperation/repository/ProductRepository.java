package com.example.crudOperation.repository;

import com.example.crudOperation.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> //Specify the data type of your primary key. Extends from the JPA Repo and you specify the class
{
    //need to write logic that connects to your data base, while using spring boot

    Product findByName(String name);
}
