<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Enter the Details Of Student</h1>
<br>
<form action="AddServ" method="post">
Name:<input type=text name="name">
<br>
Address:<input type=text name=address>
<br>
<label for="target">Choose where to Write</label>

    <select id="target" name="target">
        <option value="File">File</option>
        <option value="Database">Database</option>
    </select>
<br>
<input type=submit>
</form>
</body>
</html>