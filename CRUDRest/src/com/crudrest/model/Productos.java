package com.crudrest.model;

public class Productos {
	private String idProducto;
	private String nombreProducto;
	private double precioProducto;
	private int existencias;
	
	public Productos()
	{}
	public Productos(String idProducto, String nombreProducto, double precioProducto, int existencias)
	{
		this.idProducto= idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.existencias = existencias;
	}
	public String getIdProducto()
	{
		return idProducto;
	}
	public void setIdProducto(String idProducto)
	{
		this.idProducto = idProducto;
	}
	public String getNombreProducto()
	{
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto)
	{
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto()
	{
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto)
	{
		this.precioProducto = precioProducto;
	}
	public int getExistencias() 
	{
		return existencias;
	}
	public void setExistencias(int existencias)
	{
		this.existencias = existencias;
	}
}
