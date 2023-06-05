package com.mindtree.departmentmvc.entity;

import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int employeeId;
	private String employeeName, gender;
	@ElementCollection
	@CollectionTable(name = "employeeSkills", joinColumns = @JoinColumn(name = "employeeId"))
	@Column(name = "skills")
	private List<String> skills;
	@ManyToOne
	@JsonIgnore
	private Department department;
	
	public Employee() {
		
	}
	
	public Employee(int employeeId, String employeeName, String gender, List<String> skills, Department department) {
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
