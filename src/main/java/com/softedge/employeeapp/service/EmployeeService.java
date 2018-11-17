package com.softedge.employeeapp.service;

import java.util.Set;

import com.softedge.employeeapp.entities.Employee;

public interface EmployeeService {
	public boolean addEmployee(Employee employee);
	public Employee findEmployeeById(long employeeId);
	public Set<Employee> findAllEmployees();
	public boolean deleteEmployee(long employeeId);
	public boolean updateEmployee(Employee employee);
}
