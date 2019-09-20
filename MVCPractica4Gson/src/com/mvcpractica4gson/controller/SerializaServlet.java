package com.mvcpractica4gson.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.mvcpractica4gson.model.Perro;

/**
 * Servlet implementation class SerializaServlet
 */
@WebServlet("/SerializaServlet")
public class SerializaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SerializaServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String miJson = request.getParameter("txtJson");
		
		Gson miGson = new Gson();
		Perro miPerro = new Perro();
		
		miPerro = miGson.fromJson(miJson, miPerro.getClass());
		
		PrintWriter salida = response.getWriter();
		salida.append("Id:"+miPerro.getId());
		salida.append("Nombre:"+miPerro.getNombre());
		salida.append("Date:"+miPerro.getFechaNacimiento().toString());
		salida.close();
	}

}
