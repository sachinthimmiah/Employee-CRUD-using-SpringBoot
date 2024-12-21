package com.example.demo.Service;

import java.util.List;

import com.example.demo.Entity.Employee;

public interface EmployeeService {
	public Employee createemp(Employee employee);
	public List<Employee>  fetchallemp();
	public Employee fetchempbyid(int id);
	public Employee updateEmp(Employee employee);
	public String deleteemp(int id);
 
	
}
