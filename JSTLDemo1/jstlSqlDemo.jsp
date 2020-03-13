<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource
user="root"
password="root"
url="jdbc:mysql://localhost:3306/emp"
driver="com.mysql.jdbc.Driver"
/>
<%--
<sql:update>
insert into employee values(4,'Neerja','development',25000)
</sql:update>--%>
<%-- <sql:update>
update employee set sal=38000 where name='Neerja'
</sql:update> --%> 
<sql:query var="rs" sql="select * from employee">
</sql:query>
<table style="border:1px solid black;">

<td><c:forEach var="row" items="${rs.rows}" >
<tr>
<td style="border:1px solid black;"><c:out value="${row.id}"/></td>
<td style="border:1px solid black;"><c:out value="${row.name}"/></td>
<td style="border:1px solid black;"><c:out value="${row.department}"/></td>
<td style="border:1px solid black;"><c:out value="${row.sal}"/></td>
</tr>
</c:forEach>
</table>

</body>
</html>