package com.jwt.service;

import java.util.List;

import com.jwt.model.Exam;

public interface ExamService {
	public void addExam(Exam exam);
	public Exam updateExam(Exam exam);
	public void deleteExam(int examid);
	public List<Exam> getAllExams(int studentid);
	public Exam getExam(int examid);

	
}
