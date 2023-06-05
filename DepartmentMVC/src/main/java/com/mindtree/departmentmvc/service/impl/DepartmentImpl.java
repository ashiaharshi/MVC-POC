package com.mindtree.departmentmvc.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.departmentmvc.dto.DepartmentDto;
import com.mindtree.departmentmvc.entity.Department;
import com.mindtree.departmentmvc.exception.DepartmentException;
import com.mindtree.departmentmvc.exception.service.DepartmentNullException;
import com.mindtree.departmentmvc.repository.DepartmentRepository;
import com.mindtree.departmentmvc.service.DepartmentService;

@Service
public class DepartmentImpl implements DepartmentService{

	@Autowired
	private DepartmentRepository departmentRepository;

	static ModelMapper mapper = new ModelMapper();
	
	@Override
	public DepartmentDto addDepartment(DepartmentDto departmentDto) throws DepartmentException {
		Department department = mapper.map(departmentDto, Department.class);
		Department department1 = departmentRepository.findByName(department.getDepartmentName());
		try {
		if(department1==null) {
		Department dept = departmentRepository.save(department);
		
		return mapper.map(dept, DepartmentDto.class);
		}
		else {
			throw new DepartmentNullException("Data Entered Already exist");
		}
		}catch (DepartmentNullException e) {
			throw new DepartmentException(e.getMessage());
		}

	}


	@Override
	public Department fetchDetails(String deptName) {
		Department department = departmentRepository.findByName(deptName);
		
		return department;
	}


	@Override
	public List<DepartmentDto> fetchDetails() {
		List<DepartmentDto> departmentDtos = new ArrayList<DepartmentDto>();
		List<Department> departments = departmentRepository.findAll();
		for(Department d: departments) {
			DepartmentDto deptDto = (mapper.map(d, DepartmentDto.class));
			departmentDtos.add(deptDto);
		}
		return departmentDtos;
	}


	@Override
	public List<DepartmentDto> updateDept(DepartmentDto deptDto) {
		Department department = (mapper.map(deptDto, Department.class));
		List<DepartmentDto> departmentDtos = new ArrayList<DepartmentDto>();
		departmentRepository.save(department);
		List<Department> departments = departmentRepository.findAll();
		for(Department d: departments) {
			DepartmentDto dept = (mapper.map(d, DepartmentDto.class));
			departmentDtos.add(dept);
		}
		return departmentDtos;
	}


	@Override
	public Department fetchDetails(int deptId) {
		Department department = departmentRepository.findById(deptId).get();
		
		return department;
	}
}
