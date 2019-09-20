package com.singleton.model;

import java.io.FileNotFoundException;

public class Empleado {
	private String nombreEmpleado;
	
	private static Empleado instanciaEmpleado=null;
	private Empleado()
	{}
	
	public static Empleado getInstance()
	{
		if(instanciaEmpleado==null)
		{
			return instanciaEmpleado = new Empleado();
		}
		else
		{
			return instanciaEmpleado;
		}
	}
	public String getNombre()
	{
		return nombreEmpleado;
	}
	public void setNombre(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}
}
