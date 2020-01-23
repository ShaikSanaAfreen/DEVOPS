<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<p>Login</p>
<form action="LoginServlet">
<table border="">
<tr><th>UserName:</th><td><input type="text" name="user"></td></tr><br>
<tr><th>Password:</th><td><input type="password" name="pass"></td></tr><br>
<tr><td><input type="submit" value="submit"></td></tr>
<tr><td><input type="reset" value="reset"></td></tr>
</form>
</center>
</body>
</html>