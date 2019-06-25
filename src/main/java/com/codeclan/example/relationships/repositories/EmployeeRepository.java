package com.codeclan.example.relationships.repositories;

import com.codeclan.example.relationships.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
