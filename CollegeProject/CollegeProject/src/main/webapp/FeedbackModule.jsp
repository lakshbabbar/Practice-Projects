<%@page import="java.util.List"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
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
	CollegeCRUD crud = new CollegeCRUD();
%>
<form action="FeedbackModule.jsp" name="frmFeedback" method="get">
<center>
	FeedBack Id : <input type="text" name="fid" readonly="readonly" id="fid" value=<%=crud.generateFid()%> />&nbsp;&nbsp;&nbsp;
	Student Name : <input type="text" name="name"/><br/><br/>
</center>
	Instructor : 
	<select id="instruc" name="instructor" onchange="change()" >
	<option value="Select">Select Instructor</option>
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
	function change() {
		  document.frmFeedback.submit();
	}
</script>


<form method="get" action="ConfirmModule.jsp">
	Please give your Feedback :
	<br/><br/>

	Select Subject :

	<select id = "subdrop" name="sub">
	<option value="Select Subject">Select Subjects</option>
	<%
	CollegeCRUD crud3 = new CollegeCRUD();
	List<String> lst2 = crud3.InstrSub(request.getParameter("instructor"));
	for(String lst1 : lst2){
	%>
	<option value=<%=lst1%>><%=lst1 %></option>
	<%} %>
	</select>
	<br/><br/><br/>
	<input type="radio" name="rate" value="excellent"/>Excellent&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="rate" value="good"/>Good&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="rate" value="adequate"/>Adequete&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="radio" name="rate" value="indequate"/>Inadequete&nbsp;&nbsp;&nbsp;&nbsp;
	
	<input type="submit" value="Show"/>
	
	
	
	<% session.setAttribute("feedid", request.getParameter("fid"));
	session.setAttribute("sname", request.getParameter("name"));
	session.setAttribute("instruc", request.getParameter("instructor"));
	%>
</form>

</body>
</html>