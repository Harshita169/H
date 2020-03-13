<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>From third.jsp page</h1>
<%
response.setIntHeader("refresh",5);
%>
<jsp:useBean id="ref" class="com.cts.bean.LoginBean" scope="application"/>
<jsp:getProperty property="userName" name="ref"/>
<jsp:getProperty property="password" name="ref"/>
</body>
</html>