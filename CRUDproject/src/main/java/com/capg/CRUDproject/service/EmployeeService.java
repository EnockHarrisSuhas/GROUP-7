package com.capg.CRUDproject.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.CRUDproject.Entity.Employee;
import com.capg.CRUDproject.Repository.EmployeeRepository;

@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee) {
        return employeeRepository.save(employee);
    }

    public List<Employee> saveEmployees(List<Employee> employees) {
        return employeeRepository.saveAll(employees);
    }

    public List<Employee> getEmployee() {
        return employeeRepository.findAll();
    }

    public Employee getEmployeeById(int id) {
        return employeeRepository.findById(id).orElse(null);
    }


    public String deleteEmployee(int id) {
    	employeeRepository.deleteById(id);
        return "employee removed !! " + id;
    }

    public Employee updateEmployee(Employee employee) {
    	Employee existingEmployee = employeeRepository.findById(employee.getEmployeeid()).orElse(null);
        existingEmployee.setEmployeeFirstname(employee.getEmployeeFirstname());
        existingEmployee.setEmployeeLastname(employee.getEmployeeLastname());
        existingEmployee.setSalary(employee.getSalary());
        return employeeRepository.save(existingEmployee);
    }
}
