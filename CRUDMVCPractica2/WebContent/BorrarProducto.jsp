<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Borrar Producto</h2>
	<form action="DeleteProductPrepareServlet" method="get">
		<label for="txtIdProducto">Id Producto:</label>
		<input type="text" id="txtIdProducto" name="txtIdProducto">
		<p>
			<input type="submit" value="Borra el Producto">
		</p>
	</form>
</body>
</html>