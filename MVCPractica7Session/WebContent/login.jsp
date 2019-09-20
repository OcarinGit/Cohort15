<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Pantalla de Login</h2>
	<form action="LoginServlet" method="post">
		<p>
		<label for="txtUsuario">Usuario:</label>
		<input type="text" id="txtUsuario" name="txtUsuario">
		</p>
		<p>
		<label for="txtContrasenia">Contraseña:</label>
		<input type="password" id="txtContrasenia" name="txtContrasenia">
		</p>
		<p>
		<input type="submit" value="Login">
		</p>
	</form>
</body>
</html>