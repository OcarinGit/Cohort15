<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Lectura Individual</h2>
	<%!String a; %>
	<form action="ReadIndividualPrepareServlet" method="get">
		<label for="txtIdProducto">Id Producto:</label>
		<input type="text" id="txtIdProducto" name="txtIdProducto" value=${a}>
		<p>
			<input type="submit" value="Muestrame el Producto">
		</p>
	</form>
</body>
</html>