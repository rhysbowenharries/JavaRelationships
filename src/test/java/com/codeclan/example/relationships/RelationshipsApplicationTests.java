package com.codeclan.example.relationships;

import com.codeclan.example.relationships.models.Department;
import com.codeclan.example.relationships.models.Employee;
import com.codeclan.example.relationships.models.Project;
import com.codeclan.example.relationships.repositories.DepartmentRepository;
import com.codeclan.example.relationships.repositories.EmployeeRepository;
import com.codeclan.example.relationships.repositories.ProjectRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RelationshipsApplicationTests {

	@Autowired
	DepartmentRepository departmentRepository;

	@Autowired
	EmployeeRepository employeeRepository;

	@Autowired
	ProjectRepository projectRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createEmployeeAndDepartment(){
		Department department1 = new Department("Accounts");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Jack", "Frost", 12, department1);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Rob", "Bob", 13, department1);
		employeeRepository.save(employee2);

	}

	@Test
	public void addProjectsAndEmployees(){
		Department department1 = new Department("wages");
		departmentRepository.save(department1);

		Employee employee1 = new Employee("Paul", "Smith", 12, department1);
		employeeRepository.save(employee1);

		Employee employee2 = new Employee("Peter", "Young", 13, department1);
		employeeRepository.save(employee2);

		Project project1 = new Project("nautilus", 12);
		projectRepository.save(project1);

		project1.addEmployee(employee1);
		projectRepository.save(project1);

		project1.addEmployee(employee2);
		projectRepository.save(project1);



	}



}
