package com.hcl.employ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
	
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
		DataInsertDao d = (DataInsertDao)ctx.getBean("myDao");
		//d.insertEmploy();
		d.insertDepartment();
		System.out.println("Record Inserted...");
	}
}
