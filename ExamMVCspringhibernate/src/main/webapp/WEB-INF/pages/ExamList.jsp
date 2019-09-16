<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="center">
<h1>Exam List</h1>
<table border="1">

			<th>Subject</th>
			<th>Marks</th>
			<th>Action</th>
			<c:forEach var="exam" items="${listExam}">
				<tr>

					<td>${exam.subjectname}</td>
					<td>${exam.marks}</td>
					<td><a href="editExam?id=${exam.examid}">Edit</a>
						&nbsp;&nbsp;&nbsp;&nbsp; 
						<a href="deleteExam?id=${exam.examid}&sid=${exam.studentid}">Delete</a>&nbsp;&nbsp;&nbsp;&nbsp;
					</td>
				</tr>
			</c:forEach>
		</table><br/><br/>
					<a href="newExam?id=<%=request.getParameter("id")%>">Add Exam Results</a><br/><br/>
					<a href="/SpringMVCHibernateCRUD/">Go To Home</a><br/><br/>
					
</div>
</body>
</html>