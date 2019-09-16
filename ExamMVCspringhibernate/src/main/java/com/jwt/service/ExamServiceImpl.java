package com.jwt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jwt.dao.ExamDAO;

import com.jwt.model.Exam;
import com.jwt.model.Student;

@Service
@Transactional
public class ExamServiceImpl implements ExamService {
	
	@Autowired
	private ExamDAO examDAO;
	@Override
	@Transactional
	public void addExam(Exam exam) {
		examDAO.addExam(exam);
		
	}

	@Override
	public Exam updateExam(Exam exam) {
		return examDAO.updateExam(exam);

	}

	@Override
	@Transactional

	public void deleteExam(int examid) {
		examDAO.deleteExam(examid);
		
	}

	@Override
	@Transactional
	public List<Exam> getAllExams(int studentid) {
		return examDAO.getAllExams(studentid);
	}
	public Exam getExam(int examid) {
		return examDAO.getExam(examid);
	}

}
