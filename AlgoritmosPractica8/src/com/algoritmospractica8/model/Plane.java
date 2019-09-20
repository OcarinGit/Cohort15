package com.algoritmospractica8.model;

public class Plane extends Vehicle{
	private double maxAltitud;
	private int numeroMotores;
	
	public void ascender(double ratio)
	{
	}
	public void descender(double ratio)
	{
	}
	public double getMaxAltitud()
	{
		return maxAltitud;
	}
	public void setMaxAltitud(double maxAltitud)
	{
		this.maxAltitud = maxAltitud;
	}
	public int getNumeroMotores()
	{
		return numeroMotores;
	}
	public void setNumeroMotores(int numeroMotores)
	{
		this.numeroMotores = numeroMotores;
	}
	@Override
	public String toString()
	{
		return super.toString()+" Max Altitud:"+maxAltitud+" Numero Motores:"+numeroMotores;
	}
}
