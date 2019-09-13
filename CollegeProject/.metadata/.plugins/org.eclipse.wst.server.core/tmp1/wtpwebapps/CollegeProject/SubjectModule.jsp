<%@page import="com.hcl.college.CollegeCRUD"%>
<%@page import="com.hcl.college.subjects"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
function myfunction(){
	var s = document.getElementById("myselect");
	var sub = s.options[s.selectedIndex].value;
	
	if(sub=="microprocessor"){
		document.getElementById("theory").value=34;
		document.getElementById("practical").value=12;
	}
	else if(sub=="java"){
		document.getElementById("theory").value=45;
		document.getElementById("practical").value=87;
	}
	else if(sub=="c#"){
		document.getElementById("theory").value=58;
		document.getElementById("practical").value=28;
	}
	else if(sub=="iot"){
		document.getElementById("theory").value=53;
		document.getElementById("practical").value=38;
	}
	else if(sub=="ai"){
		document.getElementById("theory").value=30;
		document.getElementById("practical").value=63;
	}
	else if(sub=="software"){
		document.getElementById("theory").value=30;
		document.getElementById("practical").value=52;
	}
	else if(sub=="servlets"){
		document.getElementById("theory").value=67;
		document.getElementById("practical").value=90;
	}
	else{
		document.getElementById("theory").value=11;
		document.getElementById("practical").value=15;
	}
	
}

</script>
</head>
<body>
<form action="SubjectModule.jsp" method="get">
<select id="myselect" onchange="myfunction()" name="subdrop">
<option value="select" >Select
</option>
<option value="microprocessor" >Microprocessor Interfacing</option>
<option value="java" >Java</option>
<option value="c#"  >C#</option>
<option value="iot" >IOT</option>
<option value="ai"  >Artificial Intelligence</option>
<option value="software" >Software Intelligence</option>
<option value="servlets" >Servlets</option>
<option value="ds" >Data Structures</option>
</select><br/><br/>
Theory : <input type = "text" name="theory" id="theory"/><br/><br/>
Practical : <input type="text" name="practical" id="practical"/><br/><br/>
Year : <input type="text" name="year"/><br/><br/>
Instructor : <input type="text" name="instructor"/><br/><br/>
<input type="submit" value="submit" />
</form>

<%
	if(request.getParameter("year")!=null && request.getParameter("instructor")!=null && 
			request.getParameter("theory")!=null && request.getParameter("practical")!=null &&
			request.getParameter("subdrop")!=null){
		subjects sub = new subjects();
		sub.setSubject(request.getParameter("subdrop"));
		sub.setTheory(Integer.parseInt(request.getParameter("theory")));
		sub.setPractical(Integer.parseInt(request.getParameter("practical")));
		sub.setInstructor(request.getParameter("instructor"));
		sub.setYear(Integer.parseInt(request.getParameter("year")));
		
		CollegeCRUD crud = new CollegeCRUD();
		String s = crud.addsubjects(sub);
		out.println(s);
	}

%>
</body>
</html>