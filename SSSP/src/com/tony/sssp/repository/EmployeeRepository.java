package com.tony.sssp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tony.sssp.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	Employee getByLastName(String lastName);
	
}
