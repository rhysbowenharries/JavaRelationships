package com.codeclan.example.relationships.repositories;

import com.codeclan.example.relationships.models.Department;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {

}
