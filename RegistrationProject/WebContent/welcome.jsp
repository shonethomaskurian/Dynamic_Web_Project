<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page language="java" import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body{
background-color:lightgrey;
font-size:120%;
color:blue;
text-align:center;}
</style>
</head>
<body>
<H3> WELCOME TO MY PAGE</H3>
<h5> Your Details Entered as Follows</h5>
<%
out.println("your name"+ "your mobile"+ "your email");
ArrayList list = (ArrayList)request.getAttribute("habits");
for(int i=0;i<list.size();i++)
{
	
	out.println(list.get(i));
}
%>


</body>
</html>