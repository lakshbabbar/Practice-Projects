<%@page import="com.hcl.EmployCRUDHib.Employ"%>
<%@page import="com.hcl.EmployCRUDHib.EmployCRUD"%>
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
	int empno=Integer.parseInt(request.getParameter("empno"));
	EmployCRUD crud = new EmployCRUD();
	Employ e = crud.searchEmploy(empno);
%>
<form action="EmployUpdate.jsp" method="get">
Employ No :
<input type="text" readonly="readonly" value=<%=e.getEmpno()%>  name="empno" /><br/><br/>
Name :
<input type="text" value=<%=e.getName()%> name="name" /><br/><br/>
Department :
<input type="text" value=<%=e.getDept()%> name="dept" /><br/><br/>
Designation :
<input type = "text" value=<%=e.getDesig()%> name="desig" /><br/><br/>
Basic :
<input type= "text" value=<%=e.getBasic()%> name="basic" /><br/><br/>
<input type="submit" value="Update"/>
</form>
<%
if(request.getParameter("empno") !=null && 
request.getParameter("name") !=null &&
request.getParameter("dept") !=null &&
request.getParameter("desig") !=null &&
request.getParameter("basic") !=null 
){
e = new Employ();
e.setEmpno(Integer.parseInt(request.getParameter("empno")));
e.setName(request.getParameter("name"));
e.setDept(request.getParameter("dept"));
e.setDesig(request.getParameter("desig"));
e.setBasic(Integer.parseInt(request.getParameter("basic")));
crud = new EmployCRUD();
out.println(crud.updateEmploy(e));

%>
<jsp:forward page="EmployShow.jsp"/>
<% } %>
</body>
</html>