package com.algoritmospractica11.application;

import java.util.Scanner;
public class AlgoritmosPractica11 {

	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		double numerador;
		double denominador;
		double resultado;
		
		System.out.println("Introduce el numerador:");
		numerador=entradaTeclado.nextDouble();
		
		System.out.println("Introduce el denominador:");
		denominador = entradaTeclado.nextDouble();
		
		try
		{
			resultado = numerador/denominador;
			System.out.println("El resultado de la división es:"+resultado);
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Error, división entre zero!!!");
		}
	}

}
