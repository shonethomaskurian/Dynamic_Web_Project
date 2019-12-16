<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
text-align:center;
}
</style>
</head>
<body>
<form name="signinform"  action="/RegistrationProject/LoginServlet" method="post" >
<table>
<tr>
<td>USERNAME:</td><td><input type="text" name="username" required><br></td></tr>
<tr><td>PASSWORD:</td><td><input type="password" name="passwordlog" required><br></td></tr>
<tr><td><input type="submit" value="Sign In"></td></tr>
</table>
</form>
</body>
</html>