package com.algoritmospractica20.application;

import java.util.Scanner;

public class AlgoritmosPractica20 {

	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		int edad=0;
		
		System.out.println("Introduce tu edad:");
		edad=entradaTeclado.nextInt();
		
		assert (edad>=18):"Edad no válida";
		
		System.out.println("La edad es:"+edad);
		

	}

}
