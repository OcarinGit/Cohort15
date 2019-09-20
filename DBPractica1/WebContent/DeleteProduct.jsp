<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="css/bootstrap.min.css">
<title>Eliminar Producto</title>
</head>
<body>
    <div class="container">
        <h2 class="text-center display-4">ELIMINAR PRODUCTO</h2>
        <hr/>
        <form action="DeleteProductServlet" method="POST">
            <p><label for="txtIdProducto">ID Producto: </label>
            <input type="number" name="txtIdProducto" id="txtIdProducto"></p>
            <p><input type="submit" value="Eliminar" class="btn btn-danger"></p>
        </form>
        <p><a href="index.jsp">Regresar Menu</a></p>
    </div>
</body>
<script src="js/jquery-3.4.1.min.js"></script>
<script src="js/bootstrap.bundle.min.js"></script>
</html>