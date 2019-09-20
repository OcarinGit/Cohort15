package com.mvcpractica4gson.model;

import java.util.Date;

public class Perro {
	private String id;
	private String nombre;
	private Date fechaNacimiento;
	
	public Perro()
	{
	}
	public Perro(String id, String nombre, Date fechaNacimiento)
	{
		this.id = id;
		this.nombre= nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getId()
	{
		return id;
	}
	public void setId(String id)
	{
		this.id=id;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public Date getFechaNacimiento()
	{
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date FechaNacimiento)
	{
		this.fechaNacimiento = FechaNacimiento;
	}
}
