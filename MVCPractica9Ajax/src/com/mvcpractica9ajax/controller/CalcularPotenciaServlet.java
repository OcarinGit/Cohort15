package com.mvcpractica9ajax.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcpractica9ajax.model.Matematicas;

/**
 * 
 * @author El Macho
 * @version 1.0
 * @since 06 Agosto 2019
 *
 */

/**
 * 
 * Esta servlet hace uso de la clase matemáticas para realizar el cálculo de la potencia.
 *
 */
@WebServlet("/CalcularPotenciaServlet")
@MultipartConfig
public class CalcularPotenciaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	/**
	 * Este método cacha el valor de la base y del exponente del frontend
	 * 
	 * @param request Es el objeto request de mi servlet
	 * @param response Es el objeto response de mi servlet
	 * @return No genera ningún valor en el return porque crea la salida en el objeto response
	 * @see com.mvcpractica9ajax.model.Matematicas)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Estamos en el servlet");
		response.setContentType("text/html");
		int base = Integer.parseInt(request.getParameter("txtBase"));
		int exponente = Integer.parseInt(request.getParameter("txtExponente"));
		int potencia=Matematicas.calcularPotencia(base, exponente);
		
		response.getWriter().append("La potencia es:"+potencia);
	}

}
