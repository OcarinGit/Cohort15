package com.algoritmospractica23.application;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AlgoritmosPractica23 {

	public static void main(String[] args) {
		File miArchivo = new File("c:\\a\\nombre.html");
		FileWriter miWriter = null;
		BufferedWriter buffer = null;
		Scanner entradaTeclado= new Scanner(System.in);
		String nombre;
		try {
			miWriter = new FileWriter(miArchivo);
			buffer = new BufferedWriter(miWriter);
			
			System.out.println("Dame tu nombre:");
			nombre=entradaTeclado.nextLine();
			
			buffer.write("<HTML>");
			buffer.write("<HEAD>");
			buffer.write("</HEAD>");
			buffer.write("<BODY>");
			buffer.write("<H2>");
			buffer.write(nombre);
			buffer.write("</H2>");
			buffer.write("</BODY>");
			buffer.write("</HTML>");
		} catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try {
				buffer.close();
				miWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
