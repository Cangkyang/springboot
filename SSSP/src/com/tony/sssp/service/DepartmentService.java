package com.tony.sssp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tony.sssp.entity.Department;
import com.tony.sssp.repository.DepartmentRepository;

@Service
public class DepartmentService {

	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Transactional
	public List<Department> getAll(){
		
		return departmentRepository.getAll();
		
	}
	
}
