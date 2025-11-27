<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.*"%>
    <jsp:declaration>
    LocalDateTime dateTime;
    String val;
    </jsp:declaration>
    <jsp:scriptlet>
    dateTime=LocalDateTime.now();
    val=dateTime.toString();
    </jsp:scriptlet>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Today Day Date And Time:<jsp:expression>val</jsp:expression>
</body>
</html>
