<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: Hilax
  Date: 2018/10/29
  Time: 9:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>列表</title>
</head>
<body>
<!---->
<%----%>
<%!
    private  String password = "你妹";
    void  doWork(){
        System.out.println("哈哈哈");
    }
%>
 <%
     doWork();
     System.out.println(this.password);
 %>
<%
    //这是java代码
    String name = "哈哈";
    System.out.println(name);

%>
<%= name%>
<%--这里是注释--%>
<p>北京时间: <%=new Date().toLocaleString()%></p>
<%
    pageContext.setAttribute("msg","pageContext");
    request.setAttribute("msg","request");
    session.setAttribute("msg","session");
    application.setAttribute("msg","application");
%>
<hr/>
 ${requestScope.msg}
  <a href="${pageContext.request.contextPath}/index.jsp">list.jsp</a>
</body>
</html>
