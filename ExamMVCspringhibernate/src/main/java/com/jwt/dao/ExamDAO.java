package com.jwt.dao;

import java.util.List;

import com.jwt.model.Exam;
import com.jwt.model.Student;

public interface ExamDAO {
	public void addExam(Exam exam);
	public Exam updateExam(Exam exam);
	public void deleteExam(int examid);
	public List<Exam> getAllExams(int studentid);
	public Exam getExam(int examid);


}
