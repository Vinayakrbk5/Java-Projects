<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%! static int temp=0; %>
</head>
<body>
<h1><% Date date=new Date(); %></h1>
<h2><%= date%></h2>
</body>
</html>