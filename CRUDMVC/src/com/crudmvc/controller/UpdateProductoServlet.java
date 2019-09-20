package com.crudmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
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

@WebServlet("/UpdateProductoServlet")
public class UpdateProductoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Productos miProducto = new Productos();
		miProducto.setIdProducto(request.getParameter("txtIdProducto"));
		miProducto.setNombreProducto(request.getParameter("txtNombreProducto"));
		miProducto.setPrecioProducto(Double.parseDouble(request.getParameter("txtPrecioProducto")));
		miProducto.setExistencias(Integer.parseInt(request.getParameter("txtExistenciasProducto")));
		
		PrintWriter salida = response.getWriter();
		response.setContentType("text/html");
		
		salida.append("IdProducto:"+miProducto.getIdProducto());
		
		//1. Inicialización de las variables
		String user="root";
		String pass="admin";
		String urlServidor="jdbc:mysql://localhost:3306/ocarin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sentenciaSQL="SELECT * FROM Productos WHERE idProducto='EL ID DE MI PRODUCTO'";
		
		//2. Declarar los objetos de conexión
		Connection conn=null;
		Statement stmnt=null;
		int nRegistros=0;
		
		try {
			//3. Inicializar el Driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//4. Abrir la conexión
			conn = DriverManager.getConnection(urlServidor, user, pass);
			
			//5. Configurar el statement
			stmnt = conn.createStatement();
			
			//6. Prepara la sentencia SQL
			sentenciaSQL = "UPDATE Productos SET nombreProducto='"+miProducto.getNombreProducto()+"',precioProducto="+miProducto.getPrecioProducto()+",existencias="+miProducto.getExistencias()+" WHERE idProducto='"+miProducto.getIdProducto()+"'";
			
			//7. Ejecutar la sentencia SQL
			nRegistros = stmnt.executeUpdate(sentenciaSQL);
			if(nRegistros>0)
			{
				salida.append("Registro Sí fue Modificado con Éxito");
			}
			
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				//8. Cerrar la ejecución
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		salida.close();
	}

}
