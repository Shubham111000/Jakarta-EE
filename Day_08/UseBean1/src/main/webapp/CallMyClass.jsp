<<<<<<< HEAD
<jsp:useBean id="ob1" class="beanpack.MyClass"/>


The message from bean is <br>
<%=ob1.disp()%>
<br><br>


 how can you access disp from attributes way 

<br><br>

<%
beanpack.MyClass ref=(beanpack.MyClass) pageContext.getAttribute("ob1");

out.println(ref.disp());
=======
<jsp:useBean id="ob1" class="beanpack.MyClass"/>


The message from bean is <br>
<%=ob1.disp()%>
<br><br>


 how can you access disp from attributes way 

<br><br>

<%
beanpack.MyClass ref=(beanpack.MyClass) pageContext.getAttribute("ob1");

out.println(ref.disp());
>>>>>>> 5639019305e8044418c2f6c24834f90c9cf7c1fd
%>