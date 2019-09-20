package com.algoritmospractica6.application;

import java.util.Random;

import com.algoritmospractica6.model.AlgoritmosArreglitos;

public class AlgoritmosPractica6 {

	public static void main(String[] args) {
		
		final int MAX_ARRAY_ELEMENTS = 10;
		final int TOP_LIMIT=10;
		
		int[] miVector = new int[MAX_ARRAY_ELEMENTS];
		Random pseudoaleatorios = new Random(System.nanoTime());
		int cantidadPares=0;
		
		//Pasada 1 - Inicialización de valores
		for(int i=0;i<miVector.length;i++)
		{
			miVector[i] = pseudoaleatorios.nextInt(TOP_LIMIT);
		}
		
		//Pasada 2 - Proceso
		cantidadPares = AlgoritmosArreglitos.cantidadPares(miVector);
		
		System.out.println("La cantidad de pares en el vector es:"+cantidadPares);
		
		//Pasada 3 - Visualización
		for(int i=0;i<miVector.length;i++)
		{
			System.out.println(miVector[i]);
		}
	}

}
