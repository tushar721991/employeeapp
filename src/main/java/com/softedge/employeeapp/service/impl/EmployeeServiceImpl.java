package com.softedge.employeeapp.service.impl;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softedge.employeeapp.entities.Employee;
import com.softedge.employeeapp.repository.EmployeeRepository;
import com.softedge.employeeapp.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	
	public boolean addEmployee(Employee employee) {
		return employeeRepository.addEmployee(employee);
	}

	public Employee findEmployeeById(long employeeId) {
		return employeeRepository.findEmployeeById(employeeId);
	}

	public Set<Employee> findAllEmployees() {
		return employeeRepository.findAllEmployees();
	}

	public boolean deleteEmployee(long employeeId) {
		return employeeRepository.deleteEmployee(employeeId);
	}

	public boolean updateEmployee(Employee employee) {
		return employeeRepository.updateEmployee(employee);
	}

}
