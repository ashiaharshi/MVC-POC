package com.mindtree.departmentmvc.service;

import java.util.List;

import com.mindtree.departmentmvc.dto.EmployeeDto;
import com.mindtree.departmentmvc.exception.service.EmployeeServiceException;

public interface EmployeeService {

	public boolean addEmployee(EmployeeDto employeeDto) throws EmployeeServiceException;

	public List<EmployeeDto> getDetails();

	public List<EmployeeDto> getDetailsByDeptName(int deptId);

}
