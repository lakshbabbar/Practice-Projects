package com.jwt.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exams")
public class Exam implements Serializable{
	private static final long serialVersionUID = -3465813074586302847L;

	@Id
	@Column
	private int examid;
	@Column
	private String subjectname;
	@Column
	private float marks;
	@Column
	private int studentid;
	public int getExamid() {
		return examid;
	}
	public void setExamid(int examid) {
		this.examid = examid;
	}
	public String getSubjectname() {
		return subjectname;
	}
	public void setSubjectname(String subjectname) {
		this.subjectname = subjectname;
	}
	public float getMarks() {
		return marks;
	}
	public void setMarks(float marks) {
		this.marks = marks;
	}
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
