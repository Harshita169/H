<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Declaration Tag -->
<%!
int requestCount=0;
%>
<!-- Scriptlet Tag -->
<%
requestCount++;
%>
<!-- Expression Tag -->
<h1>No. of Users Visited so far..<%=requestCount%></h1>


</body>
</html>