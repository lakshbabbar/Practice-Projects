package com.hcl.college;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="subjects")
public class subjects {

	private int subId; 
	private int year;
	private String instructor;
	private String subject;
	private int theory;
	private int practical;
	
	@Id
	@Column(name="subId")
	public int getSubId() {
		return subId;
	}
	public void setSubId(int subId) {
		this.subId = subId;
	}
	@Column(name="year")
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}

	@Column(name="instructor")
	public String getInstructor() {
		return instructor;
	}
	public void setInstructor(String instructor) {
		this.instructor = instructor;
	}
	@Column(name="subject")
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subjects) {
		this.subject = subjects;
	}
	@Column(name="theory")
	public int getTheory() {
		return theory;
	}
	public void setTheory(int theory) {
		this.theory = theory;
	}
	@Column(name="practical")
	public int getPractical() {
		return practical;
	}
	public void setPractical(int practical) {
		this.practical = practical;
	}
	
	
}
