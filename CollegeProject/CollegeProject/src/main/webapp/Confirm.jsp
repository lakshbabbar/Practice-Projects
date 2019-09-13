<%@page import="com.hcl.college.xyz"%>
<%@page import="java.util.List"%>
<%@page import="com.hcl.college.CollegeCRUD"%>
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

if(session.getAttribute("instruc")!=null && request.getParameter("sub")!=null){
	CollegeCRUD c = new CollegeCRUD();
	List<xyz> obj = c.showfeedback((String)session.getAttribute("instruc"),(String)session.getAttribute("sub"));
	for(xyz obj1 : obj){
		out.println(obj1.getCount());
		out.println(obj1.getFbvalue());
	}
}
else{out.println("hello");}
%>
</body>
</html>