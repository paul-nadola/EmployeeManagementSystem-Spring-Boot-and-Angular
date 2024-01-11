package com.fullstackApp.employeeManager.repository;

import com.fullstackApp.employeeManager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
