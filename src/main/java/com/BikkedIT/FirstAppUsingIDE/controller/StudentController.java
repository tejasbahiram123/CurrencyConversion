package com.BikkedIT.FirstAppUsingIDE.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;

import com.BikkedIT.FirstAppUsingIDE.service.StudentService;

@RestController
public class StudentController {
	
//	@Autowired
	private StudentService studentService;             //field injection

	/*
	 * @Autowired //Using setter Injection public void
	 * setStudentService(StudentService studentService) {
	 * System.out.println("Student controller Setter"); this.studentService =
	 * studentService; }
	 */
	
	@Autowired
	public StudentController(StudentService studentService) {
		super();
		System.out.println("Student controller parameterized constructor");
		this.studentService = studentService;
	}


	public StudentController() {
		super();
	System.out.println("student controller constructor");
	}

	
	public void saveStudentController() {
		System.out.println("Taking data from UI and send to service layer");
		
	//	StudentService studentService=new StudentService();     //by creating instance
		studentService.saveStudentService();
	}
}
