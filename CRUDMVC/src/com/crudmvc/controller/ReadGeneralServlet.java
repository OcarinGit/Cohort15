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

@WebServlet("/ReadGeneralServlet")
public class ReadGeneralServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user="root";
		String pass="admin";
		String urlServidorBD="jdbc:mysql://localhost:3306/ocarin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
		
		Connection conn=null;
		Statement stmnt=null;
		ResultSet rs=null;
		String sentenciaSQL = "SELECT * FROM Productos";
		PrintWriter salida = response.getWriter();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
			conn = DriverManager.getConnection(urlServidorBD,user,pass);
			stmnt = conn.createStatement();
			rs = stmnt.executeQuery(sentenciaSQL);
			salida.append("<table>");
			salida.append("<th>");
			salida.append("<td>");
			salida.append("idProducto");
			salida.append("</td>");
			salida.append("<td>");
			salida.append("nombreProducto");
			salida.append("</td>");
			salida.append("<td>");
			salida.append("precioProducto");
			salida.append("</td>");
			salida.append("<td>");
			salida.append("existenciasProducto");
			salida.append("</td>");
			salida.append("</th>");
			while(rs.next())
			{
				salida.append("<tr>");
				salida.append("<td>");
				salida.append(rs.getString("idProducto"));
				salida.append("</td>");
				salida.append("<td>");
				salida.append(rs.getString(2));
				salida.append("</td>");
				salida.append("<td>");
				salida.append(" "+rs.getDouble(3));
				salida.append("</td>");
				salida.append("<td>");
				salida.append(" "+rs.getInt(4));
				salida.append("</td>");
				salida.append("</tr>");				
			}
			salida.append("</table>");	
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				stmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
	}

}
