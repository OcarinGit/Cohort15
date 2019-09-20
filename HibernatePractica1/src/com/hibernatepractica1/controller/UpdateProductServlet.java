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

import com.hibernatepractica1.model.Productos;

@WebServlet("/UpdateProductServlet")
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='UTF-8'");
		PrintWriter salida = response.getWriter();
		
		Configuration cfg = new Configuration();
		SessionFactory miFactory = cfg.configure("hibernate.cfg.xml").buildSessionFactory();
		Session miSesion = miFactory.openSession();
		Transaction miTransaccion = miSesion.beginTransaction();
		
		//Obtenemos los valores del frontend
		Productos miProducto = new Productos(request.getParameter("txtIdProducto"),request.getParameter("txtNombreProducto"),Double.parseDouble(request.getParameter("txtPrecioProducto")),Integer.parseInt(request.getParameter("txtExistenciasProducto")));
		miSesion.update(miProducto);
		
		miTransaccion.commit();
		miSesion.close();
		salida.close();
	}

}
