package com.BikkedIT.FirstAppUsingIDE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.BikkedIT.FirstAppUsingIDE.controller.StudentController;

@SpringBootApplication
public class FirstAppUsingIdeApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(FirstAppUsingIdeApplication.class, args);
		StudentController bean = configurableApplicationContext.getBean("studentController",StudentController.class);
	
     	bean.saveStudentController();
	

		/*
		 * StudentController studentController=new StudentController();
		 * studentController.saveStudentController();
		 */
}
}