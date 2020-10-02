<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- <%@ page errorpage="error.html"%> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="header.html"%><!-- Directive translation mode -->
	<jsp:include page="header.html"></jsp:include>
	<!-- Action tag: Once the requset is fired -->
	<%  
String phone=request.getParameter("phone");
String username=request.getParameter("username");
out.write("Phone Number is :"+phone);
%>

	<%= "username is :"+username %>
	<%@include file="footer.html"%>
</body>
</html>