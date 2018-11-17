package com.softedge.employeeapp.repository;

import java.util.Set;

import com.softedge.employeeapp.entities.Employee;

public interface EmployeeRepository {

	
	public boolean addEmployee(Employee employee);
	public Employee findEmployeeById(long employeeId);
	public Set<Employee> findAllEmployees();
	public boolean deleteEmployee(long employeeId);
	public boolean updateEmployee(Employee employee);
}
