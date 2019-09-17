package com.hcl.employee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.employee.model.Employee;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
	

	@Autowired
	private com.hcl.employee.dao.EmployeeDAO employeeDAO;

	@Override
	@Transactional
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}
}
