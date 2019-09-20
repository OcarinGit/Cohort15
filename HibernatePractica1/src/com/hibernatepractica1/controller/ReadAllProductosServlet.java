package com.hibernatepractica1.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.persistence.criteria.CriteriaQuery;
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

@WebServlet("/ReadAllProductosServlet")
public class ReadAllProductosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html charset='utf-8'");
		PrintWriter salida = response.getWriter();
		
		Configuration cfg = new Configuration();
		SessionFactory miFactory = cfg.configure().buildSessionFactory();
		Session miSesion = miFactory.openSession();
		Transaction miTransaccion = miSesion.beginTransaction();
		
		CriteriaQuery<Productos> cq = miSesion.getCriteriaBuilder().createQuery(Productos.class);		
		cq.from(Productos.class);
		ArrayList<Productos> misProductos = new ArrayList<Productos>();
		misProductos = (ArrayList<Productos>) miSesion.createQuery(cq).getResultList();
		
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
		
		/* Código de Magda
		 * protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
 		PrintWriter salida=response.getWriter();
  		Configuration cfg=new Configuration();
   		SessionFactory miFactory=cfg.configure().buildSessionFactory();
   		Session miSesion =miFactory.openSession();
   		Transaction miTransaction=miSesion.beginTransaction();
   		String tablahtml="";
   	
   		CriteriaQuery<MiProducto> cq = miSesion.getCriteriaBuilder().createQuery(MiProducto.class);
   		cq.from(MiProducto.class);
   		List<MiProducto> producto = miSesion.createQuery(cq).getResultList();
   		
   		for(MiProducto e:producto) {
   			tablahtml+= "<tr>"
   					+ "<td>"+e.getIdProducto()+"</td>"
   					+ "<td>"+e.getNombre_producto()+"</td>"
   					+ "<td>"+e.getPrecio()+"</td>"
   					+ "<td>"+e.getExistencias()+"</td>"
   					+ "</tr>" ;
		
   			  			
   		}
   		
   		
   		miTransaction.commit();
   		miSesion.close();
   	
		
   		request.setAttribute("allProducts", tablahtml);
   		
   		request.getRequestDispatcher("/productos.jsp").forward(request, response);
	
	}

	}
		 */
		/* Solución al deprecated por Newton
		 * https://teamtreehouse.com/community/createcriteria-is-deprecated-here-is-the-solution
		 */
		miSesion.close();
		salida.close();
	}

}
