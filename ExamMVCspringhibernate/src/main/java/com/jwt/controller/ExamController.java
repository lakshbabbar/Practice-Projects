package com.jwt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.dao.GradeInterfaceDAO;
import com.jwt.model.Exam;
import com.jwt.model.Student;
import com.jwt.service.ExamService;
import com.jwt.service.StudentService;

@Controller
public class ExamController {
	
	private static final Logger logger = Logger
			.getLogger(ExamController.class);
	
	public ExamController() {
		logger.info("ExamController");
		System.out.println("Controller()");
	}
	@Autowired
	private SessionFactory sessionFactory;
	
	@Autowired
	private ExamService examService;

	@RequestMapping(value = "/saveExam", method = RequestMethod.POST)
	public ModelAndView saveExam(@ModelAttribute Exam exam) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":saveExam()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":saveExam()"+"Calling the exam service");
		
		if (exam.getExamid() == 0) { // if student id is 0 then creating the
			// student other updating the student
			examService.addExam(exam);
		} else {
			examService.updateExam(exam);
		}
		return new ModelAndView("redirect:/listExam?id="+exam.getStudentid());
	}
	
	@RequestMapping(value = "/newExam", method = RequestMethod.GET)
	public ModelAndView newExam(ModelAndView model, HttpServletRequest req) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":newExam()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":newExam()"+"adding student");
		Exam exam = new Exam();
		int studentId = Integer.parseInt(req.getParameter("id"));
		exam.setStudentid(studentId);
		model.addObject("exam", exam);
		
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listExam()"+" redirecting to examform");

		model.setViewName("ExamForm");
		return model;
	}

	@RequestMapping(value = "/listExam", method = RequestMethod.GET)
	public ModelAndView listExam(ModelAndView model,HttpServletRequest req) throws IOException {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+"Calling the student service");

		List<Exam> listExam = examService.getAllExams(Integer.parseInt(req.getParameter("id")));
		model.addObject("listExam", listExam);
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+" redirecting to home");

		model.setViewName("ExamList");
		return model;
	}

	@RequestMapping(value = "/deleteExam", method = RequestMethod.GET)
   	public ModelAndView deleteExam(HttpServletRequest request) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":deleteStudent()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":deleteStudent()"+"deleting student");
		int examId = Integer.parseInt(request.getParameter("id"));
		int studentid=Integer.parseInt(request.getParameter("sid"));
		examService.deleteExam(examId);
		
		return new ModelAndView("redirect:/listExam?id="+studentid);
	}
	
	@RequestMapping(value = "/editExam", method = RequestMethod.GET)
	public ModelAndView editExam(HttpServletRequest request) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":editContact()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":editContact()"+"Calling the student service");
		int examId = Integer.parseInt(request.getParameter("id"));
		Exam exam =examService.getExam(examId);
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":editContact()"+"going to studentform for edit");

		ModelAndView model = new ModelAndView("ExamForm");
		model.addObject("exam", exam);

		return model;
	}
}
