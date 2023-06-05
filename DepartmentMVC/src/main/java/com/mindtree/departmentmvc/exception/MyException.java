package com.mindtree.departmentmvc.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyException {

	@ExceptionHandler(ControllerException.class)
	public String NoSuchDetail(ControllerException ex, Model model) {
		model.addAttribute("errorMsg", ex.getMessage());
		return "errorPage";
	}
//	@ExceptionHandler(ControllerException.class)
//	public ResponseEntity<?> NoSuchMarks(CollegeException ex, WebRequest request) {
//		return new ResponseEntity(ex.getMessage(), HttpStatus.BAD_REQUEST);
//	}
}
