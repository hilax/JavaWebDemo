<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Date" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<%--
  Created by IntelliJ IDEA.
  User: Hilax
  Date: 2018/10/29
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>标题</title>
</head>
<body>
<%
    pageContext.setAttribute("list", Arrays.asList("java","js","美女"));
    pageContext.setAttribute("date", new Date());
%>
<fmt:formatDate value="${date}"/>
<h3>需求: 在页面中输出1-10</h3>
<c:forEach  var="i" begin="1" end="10" step="1">

    ${i}&nbsp;&nbsp;
</c:forEach>
<h3>需求: 迭代list集合中的元素</h3>
<c:forEach  var="obj" items="${list}">
    ${obj}&nbsp;&nbsp;
</c:forEach>
</body>
</html>
