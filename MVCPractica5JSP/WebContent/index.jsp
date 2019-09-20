<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/style.css"/>
</head>
<body>
	<H2>Práctica MVC JSP </H2>
	<%!String nombre="El Macho"; %>
	<%
	for(int i=0;i<1000;i++)
	{
		out.println(String.format("<p>%s</p>", nombre));
	}
	%>
	<hr/>
	<h2>Práctica de MVC</h2>
	<p>
		<label for="txtMensaje">Mensaje:</label>
		<input type="text" id="txtMensaje" name="txtMensaje" value="<%=nombre%>">
	</p>
</body>
<script src="js/script.js"></script>
</html>