<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="Stylesheet" href="css/style.css">
</head>
<body>
	<h2>CRUD MVC</h2>
	<ul>
		<li>
			<a href="CrearProducto.jsp">Crear Producto</a>
		</li>
		<li>
			<a href="BorrarProducto.jsp">Borrar Producto</a>
		</li>
		<li>
			<a href="ReportesProducto.jsp">Reportes de Producto</a>
		</li>
		<li>
			<a href="ActualizarProducto.jsp">Actualizar Producto</a>
		</li>
	</ul>
	<h2>Transacciones</h2>
	<form action="TransaccionesServlet" method="post">
		<input type="submit" value="Transacciones">
	</form>
</body>
</html>