package com.crudmvc.controller;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crudmvc.model.Productos;

@WebServlet("/CreateProductServlet")
public class CreateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		Productos miProducto = new Productos();
		miProducto.setIdProducto(request.getParameter("txtIdProducto"));
		miProducto.setNombreProducto(request.getParameter("txtNombreProducto"));
		miProducto.setPrecioProducto(Double.parseDouble(request.getParameter("txtPrecioProducto")));
		miProducto.setExistencias(Integer.parseInt(request.getParameter("txtExistenciasProducto")));
		
		//Pasos para conectar a la base de datos
		//Paso 1. Declarar las variables de acceso
		String user="root";
		String pass="admin";
		String urlServidor="jdbc:mysql://localhost:3306/ocarin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sentenciaSQL="";
		
		//Paso 2. Declarar los objetos conexión
		Connection conn=null;
		Statement stmnt=null;
		int nRegistros=0;
		
			try 
			{
				//Paso 3. Inicializar el driver
				Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
				//Paso 4. Abrir la conexión
				conn = DriverManager.getConnection(urlServidor, user, pass);
				
				stmnt = conn.createStatement();
				//Paso 5. Preparar el comando SQL a ejecutar
				sentenciaSQL = "INSERT INTO Productos (idProducto, nombreProducto, precioProducto, existencias) values ('"+miProducto.getIdProducto()+"','"+miProducto.getNombreProducto()+"',"+miProducto.getPrecioProducto()+","+miProducto.getExistencias()+")";
				//Paso 6. Ejecutar el comando SQL en la BD
				nRegistros = stmnt.executeUpdate(sentenciaSQL);
				if(nRegistros>0)
					response.getWriter().print("Sí se guardó el registro");
			} catch (Exception e)
			{
				e.printStackTrace();
			}
			finally
			{
				try {
					//Paso 7. Cerrar las conexiones.
					stmnt.close();
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		
		response.getWriter().append("miTesto1");
	}

}
