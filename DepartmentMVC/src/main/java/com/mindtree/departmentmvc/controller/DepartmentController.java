package com.mindtree.departmentmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.mindtree.departmentmvc.dto.DepartmentDto;
import com.mindtree.departmentmvc.entity.Department;
import com.mindtree.departmentmvc.exception.ControllerException;
import com.mindtree.departmentmvc.exception.DepartmentException;
import com.mindtree.departmentmvc.service.DepartmentService;

@Controller
@RequestMapping("/Dept")
public class DepartmentController {

	@Autowired
	private DepartmentService service;
	
	@RequestMapping("/Home")
	public String showDepartment() {
		return "WelcomePage";
	}
	
	@RequestMapping("/Department")
	public String loginPage() {
		return "addDetails";
	}
	
	@RequestMapping("/addDepartment")
	public String addDepartment(@ModelAttribute("department") DepartmentDto departmentDto, Model model) throws ControllerException {
		try {
			System.out.println(departmentDto.getDepartmentName());
			service.addDepartment(departmentDto);
		} catch (DepartmentException e) {
			throw new ControllerException(e.getMessage());
		}
		List<DepartmentDto> departmentDtos = service.fetchDetails();
		model.addAttribute("details", departmentDtos);
		return "showdepartment";
	}
	
	@RequestMapping("/showDepartment")
	public String showDepartments(Model model) {
		List<DepartmentDto> departmentDtos = service.fetchDetails();
		model.addAttribute("details", departmentDtos);
		return "displaydepartment";
	}
	
//	@RequestMapping("/showDepartment/{name}")
//	public String displayDepartmentByName(@PathVariable("name") String deptName, Model model) {
//		Department department = service.fetchDetails(deptName);
//		model.addAttribute("details", department);
//		return "displaydepartment";
//	}
	
	@RequestMapping("/updatedList")
	public String updatedDepartmentList(@ModelAttribute("department") DepartmentDto deptDto, Model model) {
		List<DepartmentDto> departmentDtos = service.updateDept(deptDto);
		departmentDtos = service.fetchDetails();
		model.addAttribute("details", departmentDtos);
		return "showdepartment";
	}
	
	@RequestMapping(value = "/updateDepartment/{Id}", method = RequestMethod.GET)
	public String updateDepartment(@PathVariable("Id") int deptId, Model model) {
		Department department = service.fetchDetails(deptId);
		model.addAttribute("details", department);
		return "updateDeptStrength";
	}
	
}
