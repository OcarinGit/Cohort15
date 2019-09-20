package com.crudmvc.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crudmvc.model.Productos;

@WebServlet("/ReadIndividualServlet")
public class ReadIndividualServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Productos miProducto = new Productos();
		miProducto.setIdProducto(request.getParameter("txtIdProducto"));
		PrintWriter salida = response.getWriter();
		response.setContentType("text/html");
		
		salida.append("IdProducto:"+miProducto.getIdProducto());
		
		//1. Inicializaci�n de las variables
		String user="root";
		String pass="admin";
		String urlServidor="jdbc:mysql://localhost:3306/ocarin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		String sentenciaSQL="SELECT * FROM Productos WHERE idProducto='EL ID DE MI PRODUCTO'";
		
		//2. Declarar los objetos de conexi�n
		Connection conn=null;
		Statement stmnt=null;
		ResultSet rs=null;
		
		try {
			//3. Inicializar el Driver
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			
			//4. Abrir la conexi�n
			conn = DriverManager.getConnection(urlServidor, user, pass);
			
			//5. Configurar el statement
			stmnt = conn.createStatement();
			
			//6. Prepara la sentencia SQL
			sentenciaSQL = "SELECT * FROM Productos WHERE idProducto='"+miProducto.getIdProducto()+"'";
			
			//7. Ejecutar la sentencia SQL
			rs = stmnt.executeQuery(sentenciaSQL);
			
			while(rs.next())
			{
				salida.append("<span>Id Producto:</span>"+rs.getString("idProducto")+"<br/>");
				salida.append("<span>Nombre Producto:</span>"+rs.getString(2)+"<br/>");
				salida.append("<span>Precio Producto:</span>"+rs.getDouble("precioProducto")+"<br/>");
				salida.append("<span>Existencias Producto:</span>"+rs.getInt(4)+"<br/>");
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				//8. Cerrar la ejecuci�n
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		salida.close();
	}

}
