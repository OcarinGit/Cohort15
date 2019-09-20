package com.algoritmospractica13.model;

public class Empleado {
	//Atributos
	private int idEmpleado;
	private String nombreEmpleado;
	private Domicilio domicilioEmpleado;
	
	//Constructores
	public Empleado()
	{
		idEmpleado=000;
		nombreEmpleado="Sin nombre";
		//domicilioEmpleado = new Domicilio();
	}
	public Empleado(int idEmpleado, String nombreEmpleado, Domicilio domicilioEmpleado)
	{
		this.idEmpleado = idEmpleado;
		this.nombreEmpleado = nombreEmpleado;
		this.domicilioEmpleado = domicilioEmpleado;
	}
	//Getters y Setters
	public int getIdEmpleado()
	{
		return idEmpleado;
	}
	public void setIdEmpleado(int idEmpleado)
	{
		this.idEmpleado = idEmpleado;
	}
	public String getNombreEmpleado()
	{
		return nombreEmpleado;
	}
	public void setNombreEmpleado(String nombreEmpleado)
	{
		this.nombreEmpleado = nombreEmpleado;
	}
	public Domicilio getDomicilioEmpleado()
	{
		return domicilioEmpleado;
	}
	public void setDomicilioEmpleado(Domicilio domicilioEmpleado)
	{
		this.domicilioEmpleado = domicilioEmpleado;
	}
}
