package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.employee.model.Employee;
import com.employee.service.EmployeeService;

@Controller
public class EmployeeController {

	EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}


	@GetMapping("/getEmployeeList")
	public ModelAndView getAllEmployees() {
		ModelAndView modelAndView = new ModelAndView("employeeList");
		modelAndView.addObject("employeeList", this.employeeService.getAllEmoployees());
		return modelAndView;
	}

	@GetMapping("/showNewEmployeeForm")
	public String showNewEmployeeForm(Model model) {
		Employee employee = new Employee();
		model.addAttribute("employee", employee);
		return "addEmployee";
	}

	@PostMapping("/saveEmployee")
	public ModelAndView addEmployee(@ModelAttribute Employee employee) {
		employeeService.addEmployee(employee);
		ModelAndView modelAndView = new ModelAndView("employeeList");
		modelAndView.addObject("employeeList", this.employeeService.getAllEmoployees());
		return modelAndView;

	}

	@GetMapping("/updateEmployee/{id}")
	public String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Employee employee = employeeService.getEmployeeById(id);
		model.addAttribute("employee", employee);
		return "updateEmployee";
	}

	@PostMapping("updateEmployee/{id}")
	public ModelAndView updateEmployee(@PathVariable(value = "id") long id,
			@ModelAttribute("employee") Employee employee) {
		employeeService.updateEmployee(employee);
		ModelAndView modelAndView = new ModelAndView("employeeList");
		modelAndView.addObject("employeeList", this.employeeService.getAllEmoployees());
		return modelAndView;
	}

	@GetMapping("/deleteEmployee/{id}")
	public ModelAndView DeleteEmployee(@PathVariable(value = "id") long id, Model model) {
		employeeService.deleteEmployeeById(id);
	    System.out.println(this.employeeService.getAllEmoployees().size());
		ModelAndView modelAndView = new ModelAndView("employeeList");
		modelAndView.addObject("employeeList", this.employeeService.getAllEmoployees());
		return modelAndView;
	}
}
