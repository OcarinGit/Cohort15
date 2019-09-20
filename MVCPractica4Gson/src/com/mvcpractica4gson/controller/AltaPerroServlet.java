package com.mvcpractica4gson.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.mvcpractica4gson.model.Perro;



@WebServlet("/AltaPerroServlet")
public class AltaPerroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Configuramos el MIME type
		response.setContentType("application/json");
		//Asignamos el printwriter para generar la salida
		PrintWriter salida = response.getWriter();
		//Declaro mis variables para persistir los valores del frontend
		String id;
		String nombre;
		String strFechaNacimiento;
		
		SimpleDateFormat formateador = new SimpleDateFormat("yyyy-MM-DD");
		Date fechaNacimiento = null;
		
		id = request.getParameter("txtId");
		nombre = request.getParameter("txtNombre");
		strFechaNacimiento = request.getParameter("txtFechaNacimiento");
		
		System.out.println(strFechaNacimiento);
		try {
			//fechaNacimiento = formateador.parse("2019-01-01");
			fechaNacimiento = formateador.parse(strFechaNacimiento);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		Perro miPerritu = new Perro(id, nombre, fechaNacimiento);
		
		Gson miObjetoGson = new Gson();
		String miCadenaJson = miObjetoGson.toJson(miPerritu);
		salida.append(miCadenaJson);
		/*
		salida.append("Estamos en el controller");
		salida.append("id:"+id);
		salida.append("nombre:"+nombre);
		salida.append("fechaNacimiento:"+formateador.format(fechaNacimiento));
		*/
		
		salida.close();
	}

}
