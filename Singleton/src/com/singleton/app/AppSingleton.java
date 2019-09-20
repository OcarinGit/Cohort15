package com.singleton.app;

import com.singleton.model.Empleado;

public class AppSingleton {

	public static void main(String[] args) {
		Empleado miObjeto = Empleado.getInstance();
		
		System.out.println("Objeto 1-----------");
		miObjeto.setNombre("Alan");
		System.out.println("Nombre de Empleado:"+miObjeto.getNombre());
		
		System.out.println("Objeto 2-----------");
		Empleado miObjeto2 = Empleado.getInstance();
		
		miObjeto.setNombre("Adan");
		System.out.println("Nombre de Empleado:"+miObjeto2.getNombre());
		
		System.out.println("Objeto 3-----------");
		Empleado miObjeto3 = Empleado.getInstance();
		System.out.println("Nombre de Empleado:"+miObjeto.getNombre());
		System.out.println("Nombre de Empleado:"+miObjeto2.getNombre());
		System.out.println("Nombre de Empleado:"+miObjeto3.getNombre());
	}

}
