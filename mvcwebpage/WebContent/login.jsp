<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
String message = (String)request.getAttribute("error");
if(message !=null)
{
out.println(message);
}
%>
	<form action="LoginServlet" method="POST">
		<table border="">
			<tr>
				<td>Username:<input type="text" name="username"></td>
			</tr>
			<br>
			<tr>
				<td>Password:<input type="password" name="password"></td>
			</tr>
			<br>
			<tr>
				<td><input type="submit" value="submit"> <input
					type="Reset" value="clear"></td>
			</tr>


		</table>
	</form>
</body>
</html>