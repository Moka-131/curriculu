<%@page import="org.apache.naming.java.javaURLContextFactory"%>
<%@page import="java.util.Date" %>
<%@page import="java.text.SimpleDateFormat" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>login</title>
</head>
<body>
 
<header>
	<div class="h">login</div>
	<% Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
      String formatDate = sdf.format(date);%>
   <%= formatDate %>
</header>

</body>
</html>
