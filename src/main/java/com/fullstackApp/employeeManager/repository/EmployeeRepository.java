package com.fullstackApp.employeeManager.repository;

import com.fullstackApp.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {


    void deleteEmployeeById(long id);

    Optional <Employee> findEmployeeById(Long id);
}
