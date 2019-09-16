package com.jwt.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jwt.model.Exam;
import com.jwt.model.Student;
import com.jwt.service.StudentService;

@Controller
public class StudentController {

	private static final Logger logger = Logger
			.getLogger(StudentController.class);

	public StudentController() {
		logger.info("StudentController");
		System.out.println("Controller()");
	}

	@Autowired
	private StudentService studentService;

	@RequestMapping(value = "/")
	public ModelAndView listStudent(ModelAndView model) throws IOException {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+"Calling the student service");

		List<Student> listStudent = studentService.getAllStudents();
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+"Calling is completed. No. of student called "+listStudent.size());

		model.addObject("listStudent", listStudent);
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+" redirecting to home");

		model.setViewName("home");
		return model;
	}

	@RequestMapping(value = "/newStudent", method = RequestMethod.GET)
	public ModelAndView newContact(ModelAndView model) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":newContact()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":newContact()"+"adding student");
		Student student = new Student();
		model.addObject("student", student);
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":listStudent()"+" redirecting to studentform");

		model.setViewName("StudentForm");
		return model;
	}

	@RequestMapping(value = "/saveStudent", method = RequestMethod.POST)
	public ModelAndView saveStudent(@ModelAttribute Student student) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":saveStudent()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":saveStudent()"+"Calling the student service");
		if (student.getId() == 0) { // if student id is 0 then creating the
			// student other updating the student
			studentService.addStudent(student);
		} else {
			studentService.updateStudent(student);
		}
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/deleteStudent", method = RequestMethod.GET)
   	public ModelAndView deleteStudent(HttpServletRequest request) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":deleteStudent()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":deleteStudent()"+"deleting student");
		int studentId = Integer.parseInt(request.getParameter("id"));
		studentService.deleteStudent(studentId);
		return new ModelAndView("redirect:/");
	}

	@RequestMapping(value = "/editStudent", method = RequestMethod.GET)
	public ModelAndView editContact(HttpServletRequest request) {
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":editContact()"+"Entering into");
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":editContact()"+"Calling the student service");
		int studentId = Integer.parseInt(request.getParameter("id"));
		Student student = studentService.getStudent(studentId);
		logger.debug("Debug:"+new Date()+":"+this.getClass()+":editContact()"+"going to studentform for edit");

		ModelAndView model = new ModelAndView("StudentForm");
		model.addObject("student", student);

		return model;
	}
	

}