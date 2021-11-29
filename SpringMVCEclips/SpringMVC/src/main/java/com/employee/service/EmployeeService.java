package com.employee.service;

import java.util.List;

import com.employee.model.Employee;

public interface EmployeeService {
	List<Employee> getAllEmoployees();
	String addEmployee(Employee employee);
	Employee getEmployeeById(long Id);
	String updateEmployee(Employee employee);
	String deleteEmployeeById(long Id);
}
