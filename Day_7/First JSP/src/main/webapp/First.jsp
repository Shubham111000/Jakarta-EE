<%@ page import="java.util.*" language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%--

<%!
private String message="Hi";
public String getMessage()
{
	return message;
}
%>
<%=
"Welcome"
%>
<br>
<%=10==10%>
<br><br>
<%
for (int i=0;i<10;i++){
	out.println(i);
	out.println("<br>");}
%>

--%>

 <%
 List<String>mylist=new ArrayList<String>();
 mylist.add("Hi");
 mylist.add("Welcome");
 out.println(mylist); 
 %>
 
</body>
</html>