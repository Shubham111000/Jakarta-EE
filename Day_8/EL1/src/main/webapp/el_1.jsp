<<<<<<< HEAD
<%pageContext.setAttribute("one","PAGE");%>
<%request.setAttribute("two","REQUEST");%>
<%session.setAttribute("three","SESSION");%>
<%application.setAttribute("four","APPLICATION");%>

<%=pageContext.getAttribute("one")%>
<br>
${pageScope.one}
<br>
${one}
<br>

<%=request.getAttribute("two")%>
<br>
${requestScope.two}
<br>
${two}
<br>

<%=session.getAttribute("three")%>
<br>
${sessionScope.three}
<br>
${three}
<br>

<%=application.getAttribute("four")%>
<br>
${applicationScope.four}
<br>
${four}
=======
<%pageContext.setAttribute("one","PAGE");%>
<%request.setAttribute("two","REQUEST");%>
<%session.setAttribute("three","SESSION");%>
<%application.setAttribute("four","APPLICATION");%>

<%=pageContext.getAttribute("one")%>
<br>
${pageScope.one}
<br>
${one}
<br>

<%=request.getAttribute("two")%>
<br>
${requestScope.two}
<br>
${two}
<br>

<%=session.getAttribute("three")%>
<br>
${sessionScope.three}
<br>
${three}
<br>

<%=application.getAttribute("four")%>
<br>
${applicationScope.four}
<br>
${four}
>>>>>>> 5639019305e8044418c2f6c24834f90c9cf7c1fd
<br>