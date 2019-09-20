package com.algoritmosrestservice;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;

@Path("/algoritmos")
public class AlgoritmosService {

	@GET
	@Path("/VectorZeros")
	@Produces(MediaType.TEXT_HTML)
	public String ordenaVectorZeros() throws IOException
	{
		ArrayList<Integer> miArray = new ArrayList<Integer>();
		ArrayList<Integer> miArrayOrdenado = new ArrayList<Integer>();
		String resultado="";
		
		Properties props = new Properties();
		String miArchivoProps = "config.properties";
		InputStream miArchivoStream = null;
		miArchivoStream = getClass().getClassLoader().getResourceAsStream(miArchivoProps);
		if(miArchivoStream!=null)
		{
			props.load(miArchivoStream);
		}
		else
		{
			throw new FileNotFoundException("Archivo Props no se encuentra"); 
		}
		int cantidadElementos=Integer.parseInt(props.getProperty("CANTIDAD_ELEMENTOS"));
		int limiteSuperior = Integer.parseInt(props.getProperty("LIMITE_SUPERIOR_NUMEROS_ALEATORIOS"));
		int numeroAleatorio=0;
		for(int i=0;i<cantidadElementos;i++)
		{
			numeroAleatorio= (int) (Math.random()*limiteSuperior);
			System.out.println("Item:"+numeroAleatorio);
			if(numeroAleatorio<80)
			{
				miArray.add(numeroAleatorio);
			}
			else
			{
				miArray.add(0);
			}
		}
		
		/*Iterator miIterador = miArray.iterator();
		while(miIterador.hasNext())
		{
			resultado+=miIterador.next();
			resultado+=",";
		}*/
		for(Integer i:miArray) 
		{
			if(i!=0)
				miArrayOrdenado.add(i);
		}
		int nZeros = miArray.size()-miArrayOrdenado.size();
		for(int i=0;i<nZeros;i++)
		{
			miArrayOrdenado.add(0);
		}
		Iterator miIterador = miArrayOrdenado.iterator();
		while(miIterador.hasNext())
		{
			resultado+=miIterador.next();
			resultado+=",";
		}
		Gson miGson = new Gson();
		resultado = miGson.toJson(miArrayOrdenado);
		return resultado;
	}
}
