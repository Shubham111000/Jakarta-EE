<<<<<<< HEAD
<%@page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
List<String> mylist=new ArrayList<String>();
mylist.add("c++");
mylist.add("java");
mylist.add("databse");
mylist.add("aptitude");
pageContext.setAttribute("modules",mylist);
%>

<form action="second.jsp">
<c:forEach var="str" items="${pageScope.modules}">
	<input type=checkbox name=ch value=${str}>${str}
	
</c:forEach>
<input type=submit>
</form>

=======
<%@page import="java.util.*" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%
List<String> mylist=new ArrayList<String>();
mylist.add("c++");
mylist.add("java");
mylist.add("databse");
mylist.add("aptitude");
pageContext.setAttribute("modules",mylist);
%>

<form action="second.jsp">
<c:forEach var="str" items="${pageScope.modules}">
	<input type=checkbox name=ch value=${str}>${str}
	
</c:forEach>
<input type=submit>
</form>

>>>>>>> 5639019305e8044418c2f6c24834f90c9cf7c1fd
