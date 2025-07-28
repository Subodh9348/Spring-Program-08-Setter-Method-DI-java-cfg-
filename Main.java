package com.subodh.mainclass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.subodh.SpringBeans.Student;
import com.subodh.cfg.JavaConfiguration;

public class Main {

	public static void main(String[] args) {
		ApplicationContext ctx=new AnnotationConfigApplicationContext(JavaConfiguration.class);
		Student std=(Student) ctx.getBean(Student.class);
		std.display();
	}

}
