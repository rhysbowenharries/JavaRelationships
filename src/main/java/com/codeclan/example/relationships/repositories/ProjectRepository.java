package com.codeclan.example.relationships.repositories;

import com.codeclan.example.relationships.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
