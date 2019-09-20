package com.mvcpractica2basics.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumaServlet")
public class SumaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Si jala, get");
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int numero1;
		int numero2;
		int resultado;
		
		numero1 = Integer.parseInt(request.getParameter("txtNumero1"));
		numero2 = Integer.parseInt(request.getParameter("txtNumero2"));
		
		resultado=numero1+numero2;
		
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		salida.append("<html>");
		salida.append("<head>");
		salida.append("<title>");
		salida.append("Practica 2");
		salida.append("</title>");
		salida.append("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">");
		salida.append("</head>");
		salida.append("<body>");
		salida.append("<h2>");
		salida.append("Práctica 2 MVC");
		salida.append("</h2>");
		salida.append("<p>");
		salida.append("<ul>");
		salida.append("<li>La suma de los números es:"+resultado+"</li>");
		salida.append("</ul>");
		salida.append("</p>");
		
		salida.append("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\" integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>"
				+ "<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\" integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\" crossorigin=\"anonymous\"></script>");
		salida.append("</body>");
		salida.append("</html>");
		
		salida.close();
	}
}
