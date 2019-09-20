package com.dbpractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.dbpractica1.model.Producto;

@WebServlet("/DeleteProductServlet")
public class DeleteProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter salida = response.getWriter();
		
		Producto producto = new Producto();
		
		producto.setId(Integer.parseInt(request.getParameter("txtIdProducto")));
		salida.append("ID Producto: "+Integer.toString(producto.getId()));
		/*salida.append("Nombre: "+producto.getNombre());
		salida.append("Precio: "+Double.toString(producto.getPrecio()));
		salida.append("Existencias: "+Integer.toString(producto.getExistencias()));*/
	}

}
