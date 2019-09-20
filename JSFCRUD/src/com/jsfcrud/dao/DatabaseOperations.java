package com.jsfcrud.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Map;

import javax.faces.context.FacesContext;

import com.jsfcrud.beans.ClientBean;

public class DatabaseOperations {

	public static Connection conn;
	public static PreparedStatement pstmnt;
	public static ResultSet rs;
	public static String urlServidor="jdbc:mysql://localhost:3306/ocarin?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
	public static String user="root";
	public static String pass="admin";
	public static String sentenciaSQL="SELECT * FROM Clientes";
	
	public static Connection getConnection()
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection(urlServidor, user, pass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	public static ArrayList getClientsListFromDB()
	{
		ArrayList clientsList = new ArrayList();
		try {
			pstmnt = getConnection().prepareStatement(sentenciaSQL);
			rs = pstmnt.executeQuery();
			while(rs.next())
			{
				ClientBean clientObj =  new ClientBean();
				clientObj.setIdClient(rs.getString(1));
				clientObj.setNameClient(rs.getString(2));
				clientObj.setAddressClient(rs.getString(3));
				clientsList.add(clientObj);
			}
			System.out.println("Number of Records:"+clientsList.size());
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return clientsList;
	}
	
	public static String saveClientDetailsInDb(ClientBean newClientObj)
	{
		int nRegistros=0;
		String navigationResult="";
		try {
			pstmnt = getConnection().prepareStatement("INSERT INTO clientes VALUES (?,?,?)");
			
			pstmnt.setString(1, newClientObj.getIdClient());
			pstmnt.setString(2, newClientObj.getNameClient());
			pstmnt.setString(3, newClientObj.getAddressClient());
			
			nRegistros = pstmnt.executeUpdate();
			conn.close();
		} catch (SQLException e) {

			e.printStackTrace();
		}
		if(nRegistros!=0)
		{
			navigationResult = "ClientsList.xhtml?faces-redirect=true";
		}
		else
		{
			navigationResult = "CreateClient.xhtml?faces-redirect=true";
		}
		return navigationResult;
	}
	public static String editClientRecordInDb(String idClient)
	{
		ClientBean myRecord = null;
		
		System.out.println("Id Client Record to erase:"+idClient);
		
		Map<String, Object> sessionMapObject = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		
		try {
			pstmnt = getConnection().prepareStatement("SELECT * FROM Clientes WHERE idCliente=?");
			pstmnt.setString(1, idClient);
			rs = pstmnt.executeQuery();
			if(rs!=null)
			{
				rs.next();
				myRecord.setIdClient(rs.getString(1));
				myRecord.setNameClient(rs.getString(2));
				myRecord.setAddressClient(rs.getString(3));
				sessionMapObject.put("editRecordObj", myRecord);
				conn.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return "/EditClient.xhtml?faces-redirect=true";
	}
}
