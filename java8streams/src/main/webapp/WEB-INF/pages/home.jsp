<%@page import="com.hcl.employee.model.Employee"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<title>Employee Management Screen</title>
</head>
<body>
	<div align="center">
		<h1>Employee List</h1>
		<form:form action="search" method="post" modelAttribute="searchEmployee">
		Emp Name:	<form:input path="empName" /><br/><br/>
		AND<br/>
		Emp Band:	<form:select path="band">
					  <form:option value='0'>Select</form:option>
					  <form:option value='E'>E</form:option>
					  <form:option value='M'>M</form:option>
					  <form:option value='C'>C</form:option>
					</form:select><br/><br/>
					
					AND<br/><br/>
			Salary Gt Than:	<form:input path="salary" /><br/><br/>
					
			<input type="submit" value="Search"/><br/><br/>
		</form:form>
		<h2>${listEmployee.size()}</h2>
		<table border="1">
		
			<th>Employee Name</th>
			<th>Salary</th>
			<th>Band</th>
			<th>Date Of Join</th>
		

			<c:forEach var="employee" items="${listEmployee}">
				<tr>

					<td>${employee.empName}</td>
					<td>${employee.salary}</td>
					<td>${employee.band}</td>
					<td>${employee.dateOfJoin}</td>
				</tr>
			</c:forEach>
		</table>
		
		</div>
</body>
</html>