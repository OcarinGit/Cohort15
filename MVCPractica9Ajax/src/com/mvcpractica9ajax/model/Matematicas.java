package com.mvcpractica9ajax.model;
/**
 * Esta clase matem�ticas me sirve para demostrar el paso de par�metros por el m�todo post mediante Ajax.
 * Es el ejercicio 10 de pr�cticas MVC.
 * 
 * @author El Macho
 * @version 1.0
 * @since 06 Agosto 2019
 *
 */
public class Matematicas {
	
	/**
	 * El presente m�todo calcula la potencia de un n�mero tomando como valores su base y su exponente. La idea es calcular una potencia de tipo entera.
	 * 
	 * @param base Es la base de la potencia
	 * @param exponente Es el exponente de la potencia
	 * @return Es la potencia de tipo entero calculada
	 */
	public static int calcularPotencia(int base, int exponente)
	{
		return (int) Math.pow(base, exponente);
	}
}
