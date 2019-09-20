<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Actualizar Producto</h2>
	<form action="UpdateProductoServlet" method="post">
		<p>
			<label for="txtIdProducto">Id Producto:</label>
			<input type="text" id="txtIdProducto" name="txtIdProducto">
		</p>
		<p>
			<label for="txtNombreProducto">Nombre Producto:</label>
			<input type="text" id="txtNombreProducto" name="txtNombreProducto">
		</p>
		<p>
			<label for="txtPrecioProducto">Precio Producto:</label>
			<input type="text" id="txtPrecioProducto" name="txtPrecioProducto">
		</p>
		<p>
			<label for="txtExistenciasProducto">Existencias Producto:</label>
			<input type="text" id="txtExistenciasProducto" name="txtExistenciasProducto">
		</p>
		<p>
			<input type="submit" value="Actualiza el Producto">
		</p>
	</form>
</body>
</html>