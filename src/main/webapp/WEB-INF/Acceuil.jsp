<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Accueil</title>
</head>
<body>
	<%@ include file="Menu.jsp" %>
	<p>accueil du site</p>
	<p>Parametre envoyé: 
	
	<% 
	String name = (String) request.getAttribute("name");
	out.println(name);
	%>
</body>
</html>