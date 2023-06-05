package com.mindtree.departmentmvc.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.departmentmvc.dto.EmployeeDto;
import com.mindtree.departmentmvc.entity.Employee;
import com.mindtree.departmentmvc.exception.service.EmployeeServiceException;
import com.mindtree.departmentmvc.exception.service.NoDataEnteredException;
import com.mindtree.departmentmvc.repository.EmployeeRepository;
import com.mindtree.departmentmvc.service.EmployeeService;

@Service
public class EmployeeImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	static ModelMapper mapper = new ModelMapper();

	@Override
	public boolean addEmployee(EmployeeDto employeeDto) throws EmployeeServiceException {
		
		try {
		if(employeeDto.getEmployeeName()==null) {
			throw new NoDataEnteredException("None of the Information is given by User!!!");
		
		}
		else {
			Employee employee = mapper.map(employeeDto, Employee.class);
			employee = employeeRepository.save(employee);
			return true;
		}
		}catch (NoDataEnteredException e) {
			throw new EmployeeServiceException(e.getMessage());
		}
	}

	@Override
	public List<EmployeeDto> getDetails() {
		List<Employee> employees = 	employeeRepository.findAll();
		List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
		for(Employee e: employees) {
			EmployeeDto employeeDto = mapper.map(e, EmployeeDto.class);
			employeeDtos.add(employeeDto);
		}
		return employeeDtos;
	}

	@Override
	public List<EmployeeDto> getDetailsByDeptName(int deptId) {
		List<Employee> employees = 	employeeRepository.findAll();
		List<Employee> employee = employees.stream().filter(e -> e.getDepartment().getDepartmentId()==deptId).collect(Collectors.toList());
		List<EmployeeDto> employeeDtos = new ArrayList<EmployeeDto>();
		for(Employee e: employee) {
			EmployeeDto employeeDto = mapper.map(e, EmployeeDto.class);
			employeeDtos.add(employeeDto);
		}
		return employeeDtos;
	}

}
