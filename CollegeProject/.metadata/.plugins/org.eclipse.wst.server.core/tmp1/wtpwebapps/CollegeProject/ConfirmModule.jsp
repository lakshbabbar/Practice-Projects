<%@page import="com.hcl.college.CollegeCRUD"%>
<%@page import="com.hcl.college.feedback"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
	String sub=request.getParameter("sub");
	String rate=request.getParameter("rate");

	
%>
<form action="ConfirmModule.jsp">
Feedback Id :
<input type="text" name="fid" value=<%=session.getAttribute("feedid")%> /><br/><br/>
Student Name :
<input type="text" name="name" value=<%=session.getAttribute("sname") %> /><br/><br/>
Instructor :
<input type="text" name="instructor" value=<%=session.getAttribute("instruc") %> /><br/><br/>
Subject :
<input type="text" name="subject" value=<%=sub %> /><br/><br/>
Feedback :
<input type="text" name="feedback" value=<%=rate %> /><br/><br/>
<input type="submit" value="Confirm Please"/>

</form>

<%
	if(request.getParameter("fid")!=null &&
			request.getParameter("name")!=null &&
			request.getParameter("instructor")!=null &&
			request.getParameter("subject")!=null &&
			request.getParameter("feedback")!=null ){
	feedback fd= new feedback();
	fd.setFid(request.getParameter("fid"));
	fd.setStudentName(request.getParameter("name"));
	fd.setInstructor(request.getParameter("instructor"));
	fd.setSubject(request.getParameter("subject"));
	fd.setFbvalue(request.getParameter("feedback"));
	CollegeCRUD crud = new CollegeCRUD();
	out.println(crud.addfeedback(fd));
	}
%>
</body>
</html>