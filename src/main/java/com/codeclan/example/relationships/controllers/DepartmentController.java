package com.codeclan.example.relationships.controllers;

import com.codeclan.example.relationships.models.Department;
import com.codeclan.example.relationships.repositories.DepartmentRepository;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.annotation.Retention;
import java.util.List;

@RestController
@RequestMapping(value = "/dept")
public class DepartmentController {

    @Autowired
    DepartmentRepository departmentRepository;

    @GetMapping
    public List<Department> getAllDept(){
        return departmentRepository.findAll();
    }
}
