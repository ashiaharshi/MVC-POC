package com.mindtree.departmentmvc.dto;

import java.util.List;

import com.mindtree.departmentmvc.entity.Employee;

public class DepartmentDto {
	private int departmentId;
	private String departmentName;
	private int totalStrength;
	private List<Employee> employees;

	public DepartmentDto() {

	}

	public DepartmentDto( String departmentName, int totalStrength) {
		super();
		//this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.totalStrength = totalStrength;
	}

	
	 public int getDepartmentId() { return departmentId; }
	 
	 public void setDepartmentId(int departmentId) { this.departmentId =
	 departmentId; }
	 
	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getTotalStrength() {
		return totalStrength;
	}

	public void setTotalStrength(int totalStrength) {
		this.totalStrength = totalStrength;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
