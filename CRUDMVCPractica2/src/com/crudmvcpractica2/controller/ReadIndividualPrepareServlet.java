package com.crudmvcpractica2.controller;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.crudmvcpractica2.model.Productos;

@WebServlet("/ReadIndividualPrepareServlet")
public class ReadIndividualPrepareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String idProducto = request.getParameter("txtIdProducto");
		
		//response.getWriter().append("idProducto:"+idProducto);
		Properties props = new Properties();
		InputStream miStream=null;
		String miArchivoProps = "config.properties";
		miStream = getClass().getClassLoader().getResourceAsStream(miArchivoProps);
		if(miStream!=null)
		{
			props.load(miStream);
		}
		else
		{
			throw new FileNotFoundException("Archivo de Propiedades:"+miArchivoProps+" no se encuentra");
		}
		
		//Paso 1. Declarar variables
		String user = props.getProperty("user");
		String pass = props.getProperty("pass");
		String urlServidor = props.getProperty("urlServidor");
		String miDriver = props.getProperty("driver");
		String sentenciaSQL = props.getProperty("sentenciaSQLReadIndividualProductos");
		
		//Paso 2. Declarar objetos conexión
		Connection conn = null;
		PreparedStatement pstmnt = null;
		ResultSet rs = null;
		Productos miProducto = new Productos(idProducto,null,0.0,0);
		
		try {
			//Paso 3. Instanciar el driver
			Class.forName(miDriver).getDeclaredConstructor().newInstance();
			//Paso 4. Abrir la conexión
			conn = DriverManager.getConnection(urlServidor, user, pass);
			//Paso 5. Configurar el Prepared Statement
			pstmnt = conn.prepareStatement(sentenciaSQL);
			//Paso 6. Pasar los parámetros al Prepared Statement
			pstmnt.setString(1, miProducto.getIdProducto());
			//Paso 7. Ejecutar la consulta
			rs=pstmnt.executeQuery();
			//Paso 8. Mostrar resultados
			while(rs.next()) {
				response.getWriter().append("Id Producto:"+rs.getString("idProducto")+"<br/>");
				response.getWriter().append("Nombre Producto:"+rs.getString("nombreProducto")+"<br/>");
				response.getWriter().append("Precio Producto:"+rs.getDouble(3)+"<br/>");
				response.getWriter().append("Existencias Producto:"+rs.getInt(4)+"<br/>");
			}
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				pstmnt.close();
				conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
