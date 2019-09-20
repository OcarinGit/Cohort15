package com.hibernatepractica2.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernatepractica2.Clientes;
import com.hibernatepractica2.Telefonos;

@WebServlet("/CreateClientServlet")
public class CreateClientServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json charset='utf-8'");
		PrintWriter salida = response.getWriter();
		//salida.append("Estamos en el servlet");
		Configuration cfg = new Configuration();
		SessionFactory miFactory = cfg.configure().buildSessionFactory();
		Session miSesion = miFactory.openSession();
		
		Set<Telefonos> misTelefonos = new HashSet<Telefonos>();
		Telefonos miTelefono1 = new Telefonos("17","17","Night");
		Telefonos miTelefono2 = new Telefonos("18","18","Night");
		misTelefonos.add(miTelefono1);
		misTelefonos.add(miTelefono2);
		
		Clientes miCliente = new Clientes();
		miCliente.setIdCliente(request.getParameter("txtIdCliente"));
		miCliente.setNombreCliente(request.getParameter("txtNombreCliente"));
		miCliente.setDomicilioCliente(request.getParameter("txtDomicilioCliente"));
		
		miTelefono1.setIdCliente(miCliente);
		miTelefono2.setIdCliente(miCliente);
		miCliente.getListaTelefonos().add(miTelefono1);
		miCliente.getListaTelefonos().add(miTelefono2);
		//miCliente.setListaTelefonos(misTelefonos);
		
		System.out.println(miCliente.toString());
		miSesion.beginTransaction();
		miSesion.save(miCliente);
		miSesion.save(miTelefono1);
		miSesion.save(miTelefono2);
		miSesion.getTransaction().commit();
		miSesion.close();
		salida.close();
	}

}
