package com.algoritmospractica8.model;

public abstract class Vehicle implements Vehicleable, NavesEspacialeable {
	protected double maxFuel;
	protected int maxNroPasajeros;
	protected double velocidad;
	
	public void acelerar(double ratio)
	{
		velocidad = velocidad+ratio;
	}
	public void desacelerar(double ratio)
	{
		velocidad = velocidad-ratio;
	}
	public double getMaxFuel() 
	{
		return maxFuel;
	}
	public void setMaxFuel(double maxFuel)
	{
		this.maxFuel = maxFuel;
	}
	public int getMaxNroPasajeros()
	{
		return maxNroPasajeros;
	}
	public void setMaxNroPasajeros(int maxNroPasajeros)
	{
		this.maxNroPasajeros = maxNroPasajeros;
	}
	public double getVelocidad()
	{
		return velocidad;
	}
	public void setVelocidad(double velocidad)
	{
		this.velocidad = velocidad;
	}
	
	@Override
	public String toString()
	{
		return "MaxFuel:"+maxFuel+" Max Numero Pasajeros:"+maxNroPasajeros+" Velocidad:"+velocidad;
	}
}
