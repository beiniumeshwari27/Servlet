<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="com.codegnan.beans.Person"%>
    <%
    String name=request.getParameter("name");
    int age=Integer.parseInt(request.getParameter("age"));
    %>
    <jsp:useBean id="person" class="com.codegnan.beans.Person"
    scope="session">
    <jsp:setProperty name="person" property="name" value="<%=name%>" />
    <jsp:setProperty name="person" property="age" value="<%=age%>" />
    </jsp:useBean>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>person information</h2>
<p>Name:<jsp:getProperty name="person" property="name"/><p>
<p>Age:<jsp:getProperty name="person" property="age"/></p>
</body>
</html>
