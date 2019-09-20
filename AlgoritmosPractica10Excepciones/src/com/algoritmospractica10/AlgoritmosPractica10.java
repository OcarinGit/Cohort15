package com.algoritmospractica10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AlgoritmosPractica10 {

	public static void main(String[] args) {
		Scanner entradaTeclado = new Scanner(System.in);
		int numero;
		char respuesta='s';
		String res;
		
		do
		{
			try
			{
				System.out.println("Introduce un número entero:");
				numero=entradaTeclado.nextInt();
				System.out.println(String.format("El número introducio es: %d",numero*numero));
			}
			catch(InputMismatchException e)
			{
				System.out.println("Entrada NO Válida. Estás todo muppet");
				entradaTeclado.nextLine();
				//e.printStackTrace();
			}
			System.out.println("Deseas calcular otro número? (S para calcular otro número):");
			res=entradaTeclado.next();
			res=res.toLowerCase();
			respuesta =  res.charAt(0);
		}while(respuesta =='s');
	}

}
