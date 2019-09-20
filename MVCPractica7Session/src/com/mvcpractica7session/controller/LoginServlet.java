package com.mvcpractica7session.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		PrintWriter salida = response.getWriter();
		
		RequestDispatcher despachador = 
		request.getRequestDispatcher("links.html");
		
		despachador.include(request, response);
		
		String username = request.getParameter("txtUsuario");
		String password = request.getParameter("txtContrasenia");
		
		if(username.equals("admin") && password.equals("admin"))
		{
			salida.println("Bienvenido, "+username);
			HttpSession miSesion = request.getSession(true);
			miSesion.setAttribute("nombre", username);
		}
		else
		{
			salida.println("Sorry, usuario y contraseña equivocados");
			despachador = request.getRequestDispatcher("index.jsp");
			despachador.include(request, response);
		}
		salida.close();
	}
}
