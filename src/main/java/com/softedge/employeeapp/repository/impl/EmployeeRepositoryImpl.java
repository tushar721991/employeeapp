package com.softedge.employeeapp.repository.impl;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.softedge.employeeapp.entities.Employee;
import com.softedge.employeeapp.repository.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

	
	private Set<Employee> employees = new HashSet<Employee>();
	
	public boolean addEmployee(Employee employee) {
		return employees.add(employee);
	}

	public Employee findEmployeeById(long employeeId) {

		for (Employee employee : employees) {
			if(employee.getEmployeeId() == employeeId) {
				return employee;				
			}
		}
		return null;
	}

	public Set<Employee> findAllEmployees() {
		return employees;
	}

	public boolean deleteEmployee(long employeeId) {
		for (Employee employee : employees) {
			if(employee.getEmployeeId() == employeeId) {
				return employees.remove(employee);
			}
		}
		return false;
	}

	public boolean updateEmployee(Employee employee) {
		for (Employee emp : employees) {
			if(emp.getEmployeeId() == employee.getEmployeeId()) {
				employees.remove(emp);				
			}
		}
		return employees.add(employee);
	}

}
