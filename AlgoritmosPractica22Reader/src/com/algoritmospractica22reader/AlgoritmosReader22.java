package com.algoritmospractica22reader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class AlgoritmosReader22 {

	public static void main(String[] args) throws Exception {
		File miArchivo = new File("C:\\a\\a.txt");
		FileReader reader = null;
		BufferedReader buffer = null;
		String linea;
		try 
		{
			reader = new FileReader(miArchivo);
			buffer = new BufferedReader(reader);
			
			while((linea=buffer.readLine())!= null)
			{
				System.out.println(linea);
			}
		} catch (FileNotFoundException e)
		{
			System.out.println("Eh We, el archvio no existe");
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		finally
		{
			try 
			{
				buffer.close();
				reader.close();
			} catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
	}

}
