package com.hibernatepractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.hibernatepractica1.model.Productos;

@WebServlet("/ReadProductServlet")
public class ReadProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter salida = response.getWriter();
		
		Configuration cfg = new Configuration();
		
		SessionFactory miFactory = cfg.configure().buildSessionFactory();
		
		Session miSesion = miFactory.openSession();
		Transaction miTransaccion = miSesion.beginTransaction();
		
		//Ejecutamos la b�squeda
		String idProducto = request.getParameter("txtIdProducto");
		Productos miProducto = new Productos();
		miProducto = miSesion.get(Productos.class, idProducto);
		ObjectMapper miJackson = new ObjectMapper();
		String objetoJsonJackson = miJackson.writeValueAsString(miProducto); 
				
		Gson miGson = new Gson();
		//salida.append(miGson.toJson(miProducto));
		salida.append(objetoJsonJackson);
		
		miTransaccion.commit();
		miSesion.close();

		salida.close();
	}

}
