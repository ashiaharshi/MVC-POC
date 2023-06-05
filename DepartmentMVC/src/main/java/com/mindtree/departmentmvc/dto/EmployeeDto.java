package com.mindtree.departmentmvc.dto;

import java.util.List;

import com.mindtree.departmentmvc.entity.Department;

public class EmployeeDto {
	
	private int employeeId;
	private String employeeName, gender;
	private List<String> skills;
	private Department department;
	
	public EmployeeDto() {
		
	}
	
	public EmployeeDto(int employeeId, String employeeName, String gender, List<String> skills, Department department) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.skills = skills;
		this.department = department;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public List<String> getSkills() {
		return skills;
	}

	public void setSkills(List<String> skills) {
		this.skills = skills;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}
}
