package com.mvcpractica9ajax.model;
/**
 * Esta clase matemáticas me sirve para demostrar el paso de parámetros por el método post mediante Ajax.
 * Es el ejercicio 10 de prácticas MVC.
 * 
 * @author El Macho
 * @version 1.0
 * @since 06 Agosto 2019
 *
 */
public class Matematicas {
	
	/**
	 * El presente método calcula la potencia de un número tomando como valores su base y su exponente. La idea es calcular una potencia de tipo entera.
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
