<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
<form action="ShowFeedbackModule.jsp" name="frm" method="get">
Instructor :
<select id="instruc" name="instructor" onchange="change1()" >
	<option>Select Instructor</option>
	<%
	CollegeCRUD crud2 = new CollegeCRUD();
	List<String> lst = crud2.GetInstr();
	for(String lst1 : lst){
	%>
	<option value=<%=lst1%>><%=lst1 %></option>
	<%} %>

	</select><br/><br/>
</form>

<script>
	function change1() {
		  document.frm.submit();
	}
</script>
<form method="get" action="Confirm.jsp">

	<br/><br/>

	Select Subject :

	<select name="sub">
	<option>Select Subjects</option>
	<%
	CollegeCRUD crud3 = new CollegeCRUD();
	List<String> lst2 = crud3.InstrSub(request.getParameter("instructor"));
	for(String lst1 : lst2){
	%>
	<option value=<%=lst1%>><%=lst1 %></option>
	<%} %>
	</select>
	
	<input type="submit" value="Show"/>
	
	<%
	session.setAttribute("sub", request.getParameter("sub"));
	session.setAttribute("instruc", request.getParameter("instructor"));
	%>
	
</form>


</body>
</html>