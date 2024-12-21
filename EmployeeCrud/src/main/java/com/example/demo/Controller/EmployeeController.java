package com.example.demo.Controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Employee;
import com.example.demo.Service.EmployeeService;
import com.example.demo.Service.EmployeeServiceImplimentation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RestController
@RequestMapping("/emp")
public class EmployeeController {

	@Autowired
	 EmployeeService employeeService;
	
	@PostMapping("/emppost")
	public Employee create(@RequestBody Employee employee) {
		return  employeeService.createemp(employee);
	}
	
	@GetMapping("/emplo")
	public List<Employee> getall() {
		System.out.println("data is fetched");
		return  employeeService.fetchallemp();
	}
	
	@PutMapping("/empupdate")
	public Employee update(@RequestBody Employee employee) {
	 
		return  employeeService.updateEmp(employee);
	}
	
	@GetMapping("/empget/{id}")
	public Employee getbyid(@PathVariable int  id) {
		return employeeService.fetchempbyid(id);
	}
	
	@DeleteMapping("/deleteemp/{id}")
	public String deletebyid(@PathVariable int id) {
		return employeeService.deleteemp(id);
		
	}
}
