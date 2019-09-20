package com.dbpractica1.controller;

import java.sql.*;

public class ConexionMySQL {

	public String db = "Sistema";
	public String url = "jdbc:mysql://localhost/"+db;
	public String user = "admin";
	public String pass = "12345";

	public Connection Conectar(){
		
		Connection link = null;  
		
		try{   
			
			Class.forName("org.gjt.mm.mysql.Driver");
			link = DriverManager.getConnection(this.url, this.user, this.pass);
			
	    }catch(Exception ex){

	 
	    }
		return link; 
	}
}
