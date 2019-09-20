package com.mvcpractica3basics.model;

public class Persona {
	private String nombre;
	private int edad;
	private double salario;
	private String telefono;
	
	public Persona()
	{
	}
	public Persona(String  nombre, int edad, double salario, String telefono)
	{
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
		this.telefono = telefono;
	}
	public double calculaSalario(int idPersona)
	{
		return salario*.66;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public int getEdad()
	{
		return edad;
	}
	public void setEdad(int edad)
	{
		this.edad = edad;
	}
	public double getSalario()
	{
		return salario;
	}
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	public String getTelefono()
	{
		return telefono;
	}
	public void setTelefono(String telefono)
	{
		this.telefono = telefono;
	}
}
