<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.time.*"%>
<%!
LocalDateTime dateTime=null;
String dateAndTime="";
int day;
int month;
int year;
int hour;
int minute;
int second;
%> 
<%
dateTime=LocalDateTime.now();
day=dateTime.getDayOfMonth();
month=dateTime.getMonthValue();
year=dateTime.getYear();
hour=dateTime.getHour();
minute=dateTime.getMinute();
second=dateTime.getSecond();
dateAndTime=day+"/"+month+"/"+year+"T"+hour+":"+minute+":"+second;
%>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>
Date And Time:<%=dateAndTime%>
</h1>
</body>
</html>