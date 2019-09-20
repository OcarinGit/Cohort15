package com.crudmvcpractica2.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/TransaccionesServlet")
public class TransaccionesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.getWriter().append("Testo");
		Properties props = new Properties();
		InputStream miStream=null;
		
		miStream=getClass().getClassLoader().getResourceAsStream("config.properties");
		if(miStream!=null)
		{
			props.load(miStream);
		}
		else
		{
			throw new FileNotFoundException("archivo config.properties no encontrado");
		}
		//1. Declaramos variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String urlServidor = props.getProperty("urlServidor");
		String driver = props.getProperty("driver");
		
		//2. Declaramos objetos
		Connection conn=null;
		PreparedStatement pstmnt = null;
		String insert1="INSERT INTO Productos VALUES('120','Chorizo',70.0,70)";
		String insert2="INSERT INTO Productos VALUES('130','Queso',70.0,70)";
		String insert3="INSERT INTO Productos VALUES('140','Jamon',70.0,70)";
		String insert4="INSERT INTO Productos VALUES('100','Carne Zebra',70.0,70)";
		String insert5="INSERT INTO Productos VALUES('160','Antílope Pequeñito',70.0,70)";
		
		try {
			//3. Instanciamos el driver
			Class.forName(driver).getDeclaredConstructor().newInstance();
			//4. Abrimos la conexión
			conn = DriverManager.getConnection(urlServidor, user, pass);
			conn.setAutoCommit(false);
			pstmnt = conn.prepareStatement(insert1);
			//5. Configuramos el statement
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert2);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert3);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert4);
			pstmnt.executeUpdate();
			pstmnt = conn.prepareStatement(insert5);
			pstmnt.executeUpdate();
			conn.commit();
		} catch (Exception e)
		{
			e.printStackTrace();
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}
		finally
		{
			try {
				pstmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
