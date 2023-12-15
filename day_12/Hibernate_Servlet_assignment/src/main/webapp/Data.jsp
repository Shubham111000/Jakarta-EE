<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="DataServ" method="get">
Location:<input type=text name="location">
<br>
<input type=submit>
<br>
 <c:forEach var="a" items="${requestScope.list}">
 ${a}
 <br>
 </c:forEach>
</form>
</body>
</html>
