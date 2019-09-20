package com.algoritmospractica7.application;

import com.algoritmospractica7.model.Alumnos;

public class AlgoritmosPractica7 
{

	public static void main(String[] args) 
	{
		Alumnos MiguelAngel=new Alumnos();
		Alumnos Rosa = new Alumnos();
		Alumnos Josue = new Alumnos();
		MiguelAngel.setNombre("Miguel Angel");
		MiguelAngel.setDomicilio("Calle 1");
		Rosa.setNombre("Rosa");
		Rosa.setDomicilio("Calle 2");
		Josue.setNombre("Josue");
		Josue.setDomicilio("Calle 3");
		
		System.out.println("Objeto 1 Nombre:"+MiguelAngel.getNombre());
		System.out.println("Objeto 1 Domicilio:"+MiguelAngel.getDomicilio());
		System.out.println("Objeto 1 Vecindario:"+MiguelAngel.vecindario);
		System.out.println("Objeto 2 Nombre:"+Rosa.getNombre());
		System.out.println("Objeto 2 Domicilio:"+Rosa.getDomicilio());
		System.out.println("Objeto 2 Vecindario:"+Rosa.vecindario);
		System.out.println("Objeto 3 Nombre:"+Josue.getNombre());
		System.out.println("Objeto 3 Domicilio:"+Josue.getDomicilio());
		System.out.println("Objeto 3 Vecindario:"+Rosa.vecindario);
		
		Rosa.vecindario = "Manzanillo";
		
		System.out.println("Objeto 1 Nombre:"+MiguelAngel.getNombre());
		System.out.println("Objeto 1 Domicilio:"+MiguelAngel.getDomicilio());
		System.out.println("Objeto 1 Vecindario:"+MiguelAngel.vecindario);
		System.out.println("Objeto 2 Nombre:"+Rosa.getNombre());
		System.out.println("Objeto 2 Domicilio:"+Rosa.getDomicilio());
		System.out.println("Objeto 2 Vecindario:"+Rosa.vecindario);
		System.out.println("Objeto 3 Nombre:"+Josue.getNombre());
		System.out.println("Objeto 3 Domicilio:"+Josue.getDomicilio());
		System.out.println("Objeto 3 Vecindario:"+Rosa.vecindario);
	}

}
