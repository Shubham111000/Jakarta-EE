<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
welcome to success jsp <br>
<%=request.getAttribute("mybook") %>
<br>

<br><br>
<h1>Book selected</h1>
	<table border="1">
	<tr>
		<th align="left">Book Name</th>
		<th align="left">Price</th>
	</tr>
		<tr>
			<td> ${mybook.bookName}</td>
			<td> ${mybook.price}</td>
		</tr>
	</table>
	<br><br><br>
	<a href="bookNew.jsp">Add More Books</a>
</body>
</html>
