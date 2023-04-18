package com.BikkedIT.FirstAppUsingIDE.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.BikkedIT.FirstAppUsingIDE.dao.StudentDao;

@Service
public class StudentService {

//	@Autowired                                        //Using field Injection
	private StudentDao studentDao;
	
	/*
	 * @Autowired //using setter injection public void setStudentDao(StudentDao
	 * studentDao) { System.out.println("student service setter"); this.studentDao =
	 * studentDao; }
	 */
	
	@Autowired
	public StudentService(StudentDao studentDao) {
		super();
		System.out.println("Student service parameterized constructor");
		this.studentDao = studentDao;
	}
	

	public StudentService() {
		super();
		System.out.println("student service constructor");
	}



	public void saveStudentService() {
		System.out.println("Taking data from Controller layer and send to Dao layer");
		
	//	StudentDao studentDao = new StudentDao();        //by creating instance
		studentDao.saveStudentDao();
	}
}
