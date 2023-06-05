package com.mindtree.departmentmvc.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int departmentId;
	private String departmentName;
	private int totalStrength;
	@OneToMany(mappedBy = "department")
	private List<Employee> employees;

	public Department() {

	}

	public Department(int departmentId, String departmentName, int totalStrength, List<Employee> employees) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.totalStrength = totalStrength;
		this.employees = employees;
	}

	public int getDepartmentId() {
		return departmentId;
	}

	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}

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

}
