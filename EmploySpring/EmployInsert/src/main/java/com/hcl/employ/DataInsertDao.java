package com.hcl.employ;

import java.util.Scanner;

import org.springframework.context.annotation.ScannedGenericBeanDefinition;
import org.springframework.jdbc.core.JdbcTemplate;

public class DataInsertDao {
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	
	public void insertEmploy(){
		int empno,basic;
		String name,dept,desig;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employ No ");
		empno=Integer.parseInt(sc.nextLine());
		System.out.println("Name of Employ ");
		name=sc.nextLine();
		System.out.println("Department ");
		dept=sc.nextLine();
		System.out.println("Designation ");
		desig=sc.nextLine();
		System.out.println("Salary ");
		basic=Integer.parseInt(sc.nextLine());
		String cmd="insert into employ values(?,?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[]
				{
						empno,
						name,
						dept,
						desig,
						basic
				});
	}
	
	public void insertDepartment(){
		int deptno;
		String dname,dloc,dhead;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Department No ");
		deptno=Integer.parseInt(sc.nextLine());
		System.out.println("Name of Department ");
		dname=sc.nextLine();
		System.out.println("Location ");
		dloc=sc.nextLine();
		System.out.println("Head ");
		dhead=sc.nextLine();
		String cmd="insert into department values(?,?,?,?)";
		jdbcTemplate.update(cmd, new Object[]
				{
						deptno,
						dname,
						dloc,
						dhead
				});
	}
}
