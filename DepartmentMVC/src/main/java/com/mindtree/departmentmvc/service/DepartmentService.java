package com.mindtree.departmentmvc.service;

import java.util.List;

import com.mindtree.departmentmvc.dto.DepartmentDto;
import com.mindtree.departmentmvc.entity.Department;
import com.mindtree.departmentmvc.exception.DepartmentException;

public interface DepartmentService {

	public DepartmentDto addDepartment(DepartmentDto departmentDto) throws DepartmentException;

	public Department fetchDetails(String deptName);

	public List<DepartmentDto> fetchDetails();

	public List<DepartmentDto> updateDept(DepartmentDto deptDto);

	public Department fetchDetails(int deptId);

}
