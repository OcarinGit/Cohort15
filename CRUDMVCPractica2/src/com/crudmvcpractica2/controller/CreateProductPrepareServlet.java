package com.crudmvcpractica2.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crudmvcpractica2.model.Productos;

@WebServlet("/CreateProductPrepareServlet")
public class CreateProductPrepareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProducto = request.getParameter("txtIdProducto");
		String nombreProducto = request.getParameter("txtNombreProducto");
		double precioProducto = Double.parseDouble(request.getParameter("txtPrecioProducto"));
		int existencias = Integer.parseInt(request.getParameter("txtExistenciasProducto"));
		Productos miProducto = new Productos(idProducto, nombreProducto, precioProducto, existencias);
		
		//Paso 1. Declarar Variables
		String user="root";
		String pass="admin";
		String urlServidor="jdbc:mysql://localhost:3306/ocarin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		//Paso 2. Declarar Objetos
		Connection conn=null;
		PreparedStatement pstmnt=null;
		String sentenciaSQL = "INSERT INTO Productos (idProducto, nombreProducto, precioProducto, existencias) VALUES (?,?,?,?)";
		int nRegistros=0;

		try 
		{
			//Paso 3. Instanciar el Driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			//Paso 4. Abrir conexi�n
			conn = DriverManager.getConnection(urlServidor, user, pass);
			//Paso 5. Configurar el prepared statement
			pstmnt = conn.prepareStatement(sentenciaSQL);
			//Paso 6. Configurar la sentencia SQL
			pstmnt.setString(1, miProducto.getIdProducto());
			pstmnt.setString(2, miProducto.getNombreProducto());
			pstmnt.setDouble(3, miProducto.getPrecioProducto());
			pstmnt.setInt(4, miProducto.getExistencias());
			//Paso 7. Ejecutar el Prepared Statement
			nRegistros = pstmnt.executeUpdate();
			//Paso 8. Mostrar resultados
			if(nRegistros>0)
				response.getWriter().append("Registro S� fue Creado con �xito");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			//Paso 9. Cerrar conexi�n
			try {
				pstmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
