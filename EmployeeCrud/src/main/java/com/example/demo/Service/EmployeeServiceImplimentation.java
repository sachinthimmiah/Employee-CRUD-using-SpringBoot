package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.EmployeeRepository.EmployeeRepository;
import com.example.demo.Entity.Employee;

@Service
public class EmployeeServiceImplimentation implements EmployeeService {

	
	@Autowired
	 EmployeeRepository employeeRepository;
	
	@Override
	public Employee createemp(Employee employee) {
	
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> fetchallemp() {
		 
		return  employeeRepository.findAll();
	}

	@Override
	public Employee fetchempbyid(int id) {
		 
		return  employeeRepository.findById(id).orElse(null);
	}

	@Override
	public Employee updateEmp(Employee employee) {
		 
		return  employeeRepository.save(employee);
	}

	@Override
	public String deleteemp(int id) {
	 employeeRepository.deleteById(id);
		return "delete successfull";
		
	}

}
