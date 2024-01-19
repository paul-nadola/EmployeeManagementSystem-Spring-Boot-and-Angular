package crudPart2.crudBackend.repository;

import crudPart2.crudBackend.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    //ALL CRUD DATABASE METHODS


}
