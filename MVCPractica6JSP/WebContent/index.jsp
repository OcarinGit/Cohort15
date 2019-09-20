<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<c:out value="Mi Testo"></c:out>
	<c:set var="miNombre" scope="session" value="El Macho"></c:set>
	<c:set var="miSalario" scope="session" value="3.14"></c:set>
	<c:out value="${miSalario}"></c:out>
	<table>
	<c:forEach var="i" begin="1" end="5">
		
		<tr>
			<c:out value="${miNombre}"></c:out>
		</tr>
	</c:forEach>
	</table>
	<hr/>
	<form action="index.jsp" method="post">
	<p>
		<label for="txtNumero1">Introduce un número:</label>
		<input type="text" id="txtNumero1" name="txtNumero1">
	</p>
	<p>
		<label for="txtNumero2">Introduce otro número:</label>
		<input type="text" id="txtNumero2" name="txtNumero2">
	</p>
	<c:set var="suma" value="${param.txtNumero1+param.txtNumero2}"></c:set>
	<div><c:out value="${suma}"></c:out></div>
	<p>
		<input type="submit" value="Suma los Números">
	</p>
	</form>
</body>
</html>