<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
	body{
	background-color:lightgrey;
font-size:120%;
color:blue;

}
span{
font-size:80%;
color:red;
}
</style>
</head>
<body>
<form name="myform" action="/RegistrationProject/RegisterServlet" method="post"> 
<table>
<h3> Register Here</h3>
<tr><td>Name:</td><td><input type="text" name="name"  id="a" onblur = "return(validate());"><br></td></tr>
<tr><td><span id="e"> </span><br></td></tr>
<tr><td>Mobile:</td><td><input type="text" name="mobile"  id="b"><br></td></tr>
<tr><td><span id="f"> </span><br></td></tr>
<tr><td>Email:</td><td><input type="email" name="email" id="c"  onkeyup = "return(validateemail());"><br/>  </td></tr>
<tr><td><span id="g"> </span><br></td></tr>
<tr><td>Password:</td><td><input type="password" name="password"  id="d" onkeyup = "return(validatepass());"><br/> </td></tr>
<tr><td><span id="h"> </span><br></td></tr>
 <tr><td>Retype Password:</td><td><input type="password" name="repassword" id="i" onkeyup = "return(validaterep());"><br/> </td></tr>
<tr><td><span id="j"> </span> <br></td></tr>
<tr><td><input type="submit" value="sign up"/></td></tr>  
</table> 
</form> 
</body>
</html>