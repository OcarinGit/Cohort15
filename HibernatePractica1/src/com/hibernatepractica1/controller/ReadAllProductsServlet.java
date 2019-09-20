package com.hibernatepractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;
import com.hibernatepractica1.model.Productos;

@WebServlet("/ReadAllProductsServlet")
public class ReadAllProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter salida = response.getWriter();
		
		Configuration cfg = new Configuration();
		SessionFactory miFactory = cfg.configure().buildSessionFactory();
		Session miSesion = miFactory.openSession();
		Transaction miTransaccion = miSesion.beginTransaction();
		
		@SuppressWarnings("deprecation")
		Criteria miCriterio = miSesion.createCriteria(Productos.class);
		ArrayList<Productos> misProductos  = (ArrayList<Productos>) miCriterio.list();
		
		Gson miJson = new Gson();
		
		salida.append(miJson.toJson(misProductos));
		miTransaccion.commit();
		/*
		Iterator miIterador = misEmpleados.iterator();
		ArrayList<Productos> misProductos = new ArrayList<Productos>();
		
		while(miIterador.hasNext())
		{
			misProductos.add((Productos) miIterador.next());
			
		}*/
		
		/*Codigo Axel
		 * 
		 * response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		Configuration cfg = new Configuration();
		
		SessionFactory fct = cfg.configure("Hibernate.cfg.xml").buildSessionFactory();
		
		Session sssn = fct.openSession();
		
		Transaction trnsc = sssn.beginTransaction();
		
		//ejecutamos la busqueda
		String idProducto = request.getParameter("idProducto");
		
		//Productos prod = new Productos();
		//prod = sssn.get(Productos.class, idProducto);
				
		@SuppressWarnings("deprecation")
		Criteria criteria = sssn.createCriteria(Productos.class);
		List productos = criteria.list();

		Iterator itr = productos.iterator();
		
		Gson gson = new Gson();
		
		while (itr.hasNext()) {

			Productos prod = (Productos) itr.next();
			out.append(gson.toJson(prod));
		}
				
				
				
				
		
		//ObjectMapper jack = new ObjectMapper();
		//String jackObj = jack.writeValueAsString(prod);
		
		//Gson gson = new Gson();
		//out.append(gson.toJson(prod));
		
		trnsc.commit();
		sssn.close();*/

		
		miSesion.close();
		salida.close();
	}

}
