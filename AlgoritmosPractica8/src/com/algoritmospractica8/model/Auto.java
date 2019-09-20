package com.algoritmospractica8.model;

public class Auto extends Vehicle
{
	private int modelo;
	
	public void giroIzquierda(double ratio)
	{
	}
	public void giroDerecha(double ratio)
	{
	}
	
	public int getModelo()
	{
		return modelo;
	}
	public void setModelo(int modelo)
	{
		this.modelo = modelo;
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" Modelo:"+modelo;
		/*
		return "Max Fuel:"+maxFuel+" Max Número Pasajeros:"+maxNroPasajeros+" Velocidad:"+velocidad+" Modelo:"+modelo;*/
	}
}
