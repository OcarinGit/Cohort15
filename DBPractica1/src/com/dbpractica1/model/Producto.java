package com.dbpractica1.model;

public class Producto {
	
	private int id;
	private String nombre;
	private double precio;
	private int existencias;

	public Producto()
	{
		
	}
	public Producto(int id, String nombre, Double precio, int existencias)
	{
		this.id = id;
		this.nombre = nombre;
		this.precio = precio;
		this.existencias = existencias;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}
	public String getNombre()
	{
		return nombre;
	}
	public void setPrecio(Double precio)
	{
		this.precio = precio;
	}
	public Double getPrecio()
	{
		return precio;
	}
	public void setExistencias(int existencias)
	{
		this.existencias = existencias;
	}
	public int getExistencias()
	{
		return existencias;
	}
}
