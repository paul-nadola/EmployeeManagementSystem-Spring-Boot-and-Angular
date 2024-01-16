package com.fullstackApp.employeeManager.repository;

import com.fullstackApp.employeeManager.dto.OrderResponse;
import com.fullstackApp.employeeManager.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {


    @Query("SELECT new com.fullstackApp.employeeManager.dto.OrderResponse (c.name, p.productName) FROM Customer c JOIN c.productList p")
    public List<OrderResponse> getJoinInformation();
}
