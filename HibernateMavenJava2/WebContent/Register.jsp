<%@ page import="com.hibernate.*"%>
<jsp:useBean id="obj" class="com.hibernate.Student">
</jsp:useBean>
<jsp:setProperty property="*" name="obj"/>
<%
int i=StudentDao.Register(obj);  
if(i>0)  
out.print("You are successfully registered");   
%>  
