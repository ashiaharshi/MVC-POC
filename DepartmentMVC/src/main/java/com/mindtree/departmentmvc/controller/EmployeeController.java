package com.mindtree.departmentmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mindtree.departmentmvc.dto.DepartmentDto;
import com.mindtree.departmentmvc.dto.EmployeeDto;
import com.mindtree.departmentmvc.exception.EmployeeException;
import com.mindtree.departmentmvc.exception.service.EmployeeServiceException;
import com.mindtree.departmentmvc.service.DepartmentService;
import com.mindtree.departmentmvc.service.EmployeeService;
import com.mindtree.departmentmvc.service.impl.DepartmentImpl;
import com.mindtree.departmentmvc.service.impl.EmployeeImpl;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService service = new EmployeeImpl();
	
	@Autowired
	private DepartmentService deptService = new DepartmentImpl();
	
	@RequestMapping("/Employees")
	public String employeeDetails(Model model) {
		List<DepartmentDto> deptNames = deptService.fetchDetails();
		model.addAttribute("departmentNames" ,deptNames);
		return "displayForm";
	}
	
	@RequestMapping("/addEmployeeDetails")
	public String addEmployee(@ModelAttribute("department") EmployeeDto employeeDto, Model model) throws EmployeeException {
		try {
			service.addEmployee(employeeDto);
		} catch (EmployeeServiceException e) {
			throw new EmployeeException(e.getMessage());
		}
		List<EmployeeDto> employeeDtos = service.getDetails();
		model.addAttribute("details",employeeDtos);
		return "showEmployeeList";
	}
	
	@RequestMapping("/showEmployees")
	public String showEmployeesByDeptName(Model model) {
		List<EmployeeDto> employeeDtos = service.getDetails();
		model.addAttribute("details",employeeDtos);
		return "showEmployeeList";
	}
	
	@RequestMapping("/showDeptNames")
	public String showDeptNames(Model model) {
		List<DepartmentDto> deptNames = deptService.fetchDetails();
		model.addAttribute("departmentNames" ,deptNames);
		return "detailsByDeptName";
	}
	
	@ResponseBody
	@RequestMapping("/showEmployeesByDeptName/{Dept}")
	public List<EmployeeDto> showEmployeesByDeptName(@PathVariable("Dept") int deptId, Model model) {
		List<EmployeeDto> employeeDtos = service.getDetailsByDeptName(deptId);
		model.addAttribute("details",employeeDtos);
		return employeeDtos;
	}
}
