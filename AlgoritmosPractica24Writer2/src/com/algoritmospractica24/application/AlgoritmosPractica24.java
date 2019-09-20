package com.algoritmospractica24.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AlgoritmosPractica24 
{

	public static void main(String[] args) 
	{
		File miArchivo=null;
		FileWriter miWriter=null;
		BufferedWriter miBuffer=null;
		Scanner entradaTeclado = new Scanner(System.in);
		int tabla=1;
		try {
			 miArchivo = new File("c:\\a\\tablas.txt");
			 miWriter = new FileWriter(miArchivo);
			 miBuffer = new BufferedWriter(miWriter);
			 
			 System.out.println("Introduce la tabla de multiplicar a mostrar:");
			 tabla = entradaTeclado.nextInt();
			 for(int i=1;i<=20;i++)
			 {
				 miBuffer.write(String.format("%d x %d = %d \n", i, tabla, i*tabla));
			 }
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try
			{
				entradaTeclado.close();
				miBuffer.close();
				miWriter.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	

}
