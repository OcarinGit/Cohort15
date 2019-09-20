package com.algoritmospractica4.model;

public class OperacionesMatematicas 
{
	private double numero1;
	private double numero2;
	public int miAtributPublico;
	
	public OperacionesMatematicas()
	{
	}
	public OperacionesMatematicas(double numero1, double numero2)
	{
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	public double getNumero1()
	{
		return numero1;
	}
	public void setNumero1(double numero1)
	{
		this.numero1 = numero1;
	}
	public double getNumero2()
	{
		return numero2;
	}
	public void setNumero2(double numero2)
	{
		this.numero2 = numero2;
	}
	
	public int potencia(int base, int exponente)
	{	int potencia=1;
		for(int i=0;i<exponente;i++)
		{
			potencia=potencia*base;
		}
		return potencia;
	}
	
	public int factorial(int rango)
	{
		int resultadoFactorial=1;
		for(int i=rango;i>1;i--)
		{
			resultadoFactorial = resultadoFactorial*i;
		}
		return resultadoFactorial;
	}
	public boolean isPar(int numero)
	{
		if(numero%2==0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public boolean isPrimo(int numero)
	{
		for (int i=2;i<numero;i++)
		{
			if(numero%i==0)
			{
				return false;
			}
		}
		return true;
	}
}
