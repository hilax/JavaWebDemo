<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: Hilax
  Date: 2018/10/29
  Time: 15:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>标题</title>
</head>
<body>
<%
    int num = 10;
    pageContext.setAttribute("num",num);
    pageContext.setAttribute("list",new ArrayList());
%>
${empty list}
<%--使用if标签--%>
<h3>使用if标签替代if代码</h3>
<c:if test="${num == 10}">
    等于10
    </c:if>
<c:if test="${num == 10}" var="test" scope="application"/>
<br/>
${applicationScope.test}
<br/>
<c:choose>
    <c:when test="${num >10}">
        大于10
    </c:when>
    <c:when test="${num <10}">
        小于10
    </c:when>
    <c:otherwise>
        等于10
    </c:otherwise>
</c:choose>
</body>
    </html>
