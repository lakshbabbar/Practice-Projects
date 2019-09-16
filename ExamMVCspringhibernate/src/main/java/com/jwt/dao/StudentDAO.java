package com.jwt.dao;

import java.util.List;

import com.jwt.model.Exam;
import com.jwt.model.Student;

public interface StudentDAO {

	public void addStudent(Student employee);

	public List<Student> getAllStudents();

	public void deleteStudent(Integer employeeId);

	public Student updateStudent(Student employee);

	public Student getStudent(int employeeid);
	
}
