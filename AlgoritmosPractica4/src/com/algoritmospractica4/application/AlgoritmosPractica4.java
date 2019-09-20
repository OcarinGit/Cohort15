package com.algoritmospractica4.application;

import com.algoritmospractica4.model.OperacionesMatematicas;
import java.util.Scanner;

public class AlgoritmosPractica4 
{
	public static void main(String[] args) 
	{
		Scanner pizza = new Scanner(System.in);
		int perritu, gatitu;
		
		System.out.println("Dame una base:");
		perritu = pizza.nextInt();
		System.out.println("Dame un exponente:");
		gatitu = pizza.nextInt();
		
		OperacionesMatematicas objOperaciones1;
		objOperaciones1 = new OperacionesMatematicas();
		
		System.out.println("La potencia es:"+objOperaciones1.potencia(perritu, gatitu));
		
		System.out.println("Dame un número para calcular su factorial:");
		perritu = pizza.nextInt();
		
		System.out.println("El factorial es:"+objOperaciones1.factorial(perritu));
		
		System.out.println("21 Es primo?"+objOperaciones1.isPrimo(21));
	}
}
