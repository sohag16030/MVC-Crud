package com.employee.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.employee.model.Employee;

public class EmployeeServiceImp implements EmployeeService {
	private List<Employee> employeeList = new ArrayList<Employee>();

	public EmployeeServiceImp() {
		super();
		this.employeeList.add(new Employee(1, "Tony", "Stark", "backend developer"));
		this.employeeList.add(new Employee(2, "Spider", "Man", "frontend developer"));
		this.employeeList.add(new Employee(3, "Thunder", "God", "QA"));

	}

	public List<Employee> getAllEmoployees() {
		return this.employeeList;
	}

	public String addEmployee(Employee employee) {
		try {
			this.employeeList.add(employee);
			
		} catch (Exception e) {
			return "Error adding new Employee";
		}
		return "employee added successfully";
	}

	@Override
	public Employee getEmployeeById(long Id) {
		return this.employeeList.stream().filter(employee -> employee.getId() == Id).findFirst().orElse(null);
	}
	
	public String updateEmployee(Employee employee) {
		try {
			this.employeeList.set((int) (employee.getId() - 1), employee);
		} catch (Exception ex) {
			return "Error updating employee information";
		}

		return "Successfully update employee information";
	}

	@Override
    public String deleteEmployeeById(long Id) {
		try {
			this.employeeList.remove(getEmployeeById(Id));
        }
		catch (Exception ex) {
			return "Error deleting employee information";
		}
		return "employee deleted successfully";
    }
}
