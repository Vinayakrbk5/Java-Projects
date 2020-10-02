<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

</head>
<body>
<%@ include file="sports.jsp" %>
<%! int temp=0; %>
<h1> Hello Vinayak </h1>
<%= "Vinayak" %>
<% Date date=new Date();
temp++;
String b=application.getInitParameter("driver");
out.print(b);
%>
<%= date+"temp="+temp %>
<%@ include file="footer.html" %>

<form action="sports.jsp" method ="post">

<div> Enter UserName:<input type="text" name="username" ></div>
<div> Enter Password:<input type="password" name="password"></div>
<input type="submit" value="submit">

</form>
</body>
</html>