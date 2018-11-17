package com.softedge.employeeapp.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.softedge.employeeapp.entities.Employee;
import com.softedge.employeeapp.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/")
	public String getHomePage() {
		return "index";
	}
	
	@RequestMapping(value="/addEmployeeForm")
	public String getAddEmployeeForm(Model model) {
		model.addAttribute("employee", new Employee());
		return "addEmployeeForm";
	}
	
	@RequestMapping(value="/addEmployee", method=RequestMethod.POST)
	public String addNewEmployee(@ModelAttribute("employee") Employee employee) {
		employeeService.addEmployee(employee);
		return "redirect:/findAllEmployees";
		
		
	}
	
	@RequestMapping("/findAllEmployees")
	public String findAllEmployeeDetails(Model model) {
		Set<Employee> employees = employeeService.findAllEmployees();
		model.addAttribute("employees", employees);
		return "allEmployees";
	}
	
	@RequestMapping("/deleteEmployee/{employeeId}")
	public String deleteEmployee(@PathVariable int employeeId) {
		
		employeeService.deleteEmployee(employeeId);
		return "redirect:/findAllEmployees";
		
	}
	
	@RequestMapping(value="/updateEmployeeForm/{employeeId}")
	public String getUpdateEmployeeForm(@PathVariable int employeeId, Model model) {
		Employee employee = employeeService.findEmployeeById(employeeId);
		model.addAttribute("employee", employee);
		return "updateEmployeeForm";
		
	}
	
	@RequestMapping(value="/updateEmployee", method=RequestMethod.POST)
	public String updateEmployee(@ModelAttribute("employee") Employee employee ) {
		employeeService.updateEmployee(employee);
		return "redirect:/findAllEmployees";
	}
	
	
}
