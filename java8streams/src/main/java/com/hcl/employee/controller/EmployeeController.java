package com.hcl.employee.controller;

import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.hcl.employee.model.Employee;
import com.hcl.employee.service.EmployeeService;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/")
	public ModelAndView listEmployee(ModelAndView model) throws IOException {
		
		List<Employee> listEmployee = employeeService.getAllEmployees();
		
		model.addObject("searchEmployee",new Employee());
		model.addObject("listEmployee", listEmployee);

		model.setViewName("home");
		return model;
	}
	@RequestMapping(value = "search",method=RequestMethod.POST)
	public ModelAndView searchEmployee(ModelAndView model,@ModelAttribute Employee searchEmployee) throws IOException {
			
			List<Employee> listEmployee = employeeService.getAllEmployees();
			if(searchEmployee.getBand()!='0')
			listEmployee=listEmployee.stream().filter((var)->var.getEmpName().startsWith(searchEmployee.getEmpName())&& searchEmployee.getBand()==var.getBand()&&var.getSalary()>searchEmployee.getSalary()).collect(Collectors.toList());
			else listEmployee=listEmployee.stream().filter((var)->var.getEmpName().startsWith(searchEmployee.getEmpName())&&var.getSalary()>searchEmployee.getSalary()).collect(Collectors.toList());
			model.addObject("searchEmployee",searchEmployee);
			model.addObject("listEmployee", listEmployee);

			model.setViewName("home");
			return model;
		}

}
