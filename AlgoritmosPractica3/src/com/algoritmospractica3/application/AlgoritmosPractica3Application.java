package com.algoritmospractica3.application;

import com.algoritmospractica3.model.Alumnos;

public class AlgoritmosPractica3Application 
{
	public static void main(String[] args) 
	{
		//Reservo el espacio en memoria RAM
		Alumnos objEmmanuel;
		
		//Creo, instancio o concretizo a la clase
		objEmmanuel = new Alumnos();
		
		Alumnos objAdan = new Alumnos("2234567","Adan",2.5);
		
		Alumnos objNeltzy = new Alumnos("123","Neltzy",3.0);
		
		System.out.println("Código de Emmanuel:"+objEmmanuel.getCodigoAlumno());
		System.out.println("Nombre de Emmanuel:"+objEmmanuel.getNombreAlumno());
		System.out.println("Calificacion de Emmanuel:"+objEmmanuel.getCalificacionAlumno());
		
		System.out.println("Código de Adan:"+objAdan.getCodigoAlumno());
		System.out.println("Nombre de Adan:"+objAdan.getNombreAlumno());
		System.out.println("Calificacion de Adan:"+objAdan.getCalificacionAlumno());
		
		System.out.println("Código de Neltzy:"+objNeltzy.getCodigoAlumno());
		System.out.println("Nombre de Neltzy:"+objNeltzy.getNombreAlumno());
		System.out.println("Calificacion de Neltzy:"+objNeltzy.getCalificacionAlumno());
		
		objEmmanuel.setCodigoAlumno("123");
		objEmmanuel.setNombreAlumno("Emmanuel");
		objEmmanuel.setCalificacionAlumno(1.0);
		
		System.out.println("Código de Emmanuel:"+objEmmanuel.getCodigoAlumno());
		System.out.println("Nombre de Emmanuel:"+objEmmanuel.getNombreAlumno());
		System.out.println("Calificacion de Emmanuel:"+objEmmanuel.getCalificacionAlumno());
	}
}
