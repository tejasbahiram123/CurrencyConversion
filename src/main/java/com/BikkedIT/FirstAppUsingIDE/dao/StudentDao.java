package com.BikkedIT.FirstAppUsingIDE.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {

	public StudentDao() {
		super();

	System.out.println("student dao constructor");
	}

	public void saveStudentDao() {
		System.out.println("Taking data from service layer and save to Database");
		
	}
	
}
