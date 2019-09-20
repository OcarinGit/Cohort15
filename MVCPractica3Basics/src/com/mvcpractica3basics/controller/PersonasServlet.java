package com.mvcpractica3basics.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mvcpractica3basics.model.Persona;

@WebServlet("/PersonasServlet")
public class PersonasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Declaración de las variables
		String nombre;
		int edad;
		double salario;
		String telefono;
		
		//Obtención de los datos del frontend
		nombre = request.getParameter("txtNombre");
		edad = Integer.parseInt(request.getParameter("txtEdad"));
		salario = Double.parseDouble(request.getParameter("txtSalario"));
		telefono = request.getParameter("txtTelefono");
		//String sEstadoCivil = request.getParameter("txtEstadoCivil");
		//char cEstadoCivil = sEstadoCivil.charAt(0);
		//Asignación de los datos al objeto (Modelo)
		Persona objPersona = new Persona();
				
		objPersona.setNombre(nombre);
		objPersona.setEdad(edad);
		objPersona.setSalario(salario);
		objPersona.setTelefono(telefono);
		objPersona.calculaSalario(14);
		response.setContentType("application/json");
		PrintWriter salida = response.getWriter();
		salida.append("{"
				+ "\"nombre\":\""+objPersona.getNombre()+"\","
				+"\"edad\":"+objPersona.getEdad()+","
				+"\"salario\":"+objPersona.getSalario()+","
				+"\"telefono\":\""+objPersona.getTelefono()
				+ "\"}");
		
		salida.close();
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Estamos en el post");
	}
}
