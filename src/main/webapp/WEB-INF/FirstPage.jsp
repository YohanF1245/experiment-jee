<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>First page</title>
</head>
<body>
	<h1>Premiere page</h1>
	<p>Bonjour, bienvenue sur mon premier JSP</p>
	<p>Nous sommes le 
	<%
		String date = (String) request.getAttribute("date");
		out.print(date);
	%>
	</p>
	<p>Il est :
		<%
		String time = (String) request.getAttribute("time");
		out.print(time);
	%>
	</p>
</body>
</html>