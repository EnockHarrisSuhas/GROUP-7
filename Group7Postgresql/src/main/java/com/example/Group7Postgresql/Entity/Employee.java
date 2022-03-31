package com.example.Group7Postgresql.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue
	private int Employeeid;
	
	@Column(name ="FirstName")
	private String EmployeeFirstname;
	@Column(name ="LastName")
	private String EmployeeLastname;
	@Column(name ="Salary")
	private double salary;
	public int getEmployeeid() {
		return Employeeid;
	}
	public void setEmployeeid(int employeeid) {
		Employeeid = employeeid;
	}
	public String getEmployeeFirstname() {
		return EmployeeFirstname;
	}
	public void setEmployeeFirstname(String employeeFirstname) {
		EmployeeFirstname = employeeFirstname;
	}
	public String getEmployeeLastname() {
		return EmployeeLastname;
	}
	public void setEmployeeLastname(String employeeLastname) {
		EmployeeLastname = employeeLastname;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
