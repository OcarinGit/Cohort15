package com.algoritmospractica5.application;

import java.util.Random;

public class AlgoritmosPractica5 
{

	public static void main(String[] args) 
	{
		final int MAX_ELEMENTOS_VECTOR=100;
		
		int[] arregloEnteros = new int[MAX_ELEMENTOS_VECTOR];
		double[] arregloDouble = new double[MAX_ELEMENTOS_VECTOR];
		
		char[] arregloChar = {'P','e','r','r','o'};
		String arregloCadenas[] = {"Gato","Perro","Puerco","Pajaro"};
		boolean[] arregloBooleanos = {true, false, true, false, true,false};
		
		//Generación de número pseudoaleatorios
		Random rand = new Random(System.nanoTime());
		/*double miNumeroAleatorio=0.0;
		int miNumeroAleatorioEntero=0;
		miNumeroAleatorioEntero = rand.nextInt(100);
		miNumeroAleatorio = rand.nextDouble();
		System.out.println("Número psudoaleatorio generado:"+miNumeroAleatorio);
		System.out.println("Número psudoaleatorio entero generado:"+miNumeroAleatorioEntero);
		*/
		double mediaAritmetica=0;
		double sumatoria=0;
		//Pasada 1 - Llenado del vector
		for(int i=0;i<arregloEnteros.length;i++)
		{
			arregloEnteros[i] = rand.nextInt(20)+50;
		}
		//Pasada 2 - Proceso del vector
		for(int i=0;i<arregloEnteros.length;i++)
		{
			sumatoria=sumatoria+arregloEnteros[i];
		}
		mediaAritmetica = sumatoria/arregloEnteros.length;
		System.out.println("La media es:"+mediaAritmetica);
		//Pasada 3 - Visualización del vector
		/*for(int i=0;i<arregloEnteros.length;i++)
		{
			System.out.print(arregloEnteros[i]+" ");
		}*/
	}

}
