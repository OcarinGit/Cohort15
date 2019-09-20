package com.crudrestclient.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

import com.crudrestclient.model.Productos;
import com.google.gson.Gson;

public class ClienteRestApp {

	public static void main(String[] args) {
		
		/*Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el id del Producto a Borrar:");
		String idProducto = entrada.next();
		*/
		/*System.out.println("Introduce el nombre del Producto a Crear:");
		String nombreProducto = entrada.next();
		System.out.println("Introduce el precio del Producto a Crear:");
		double precioProducto = entrada.nextDouble();
		System.out.println("Introduce las existencias del Producto a Crear:");
		
		int existencias = entrada.nextInt();
		*/
		//String uri = "http://localhost:8080/CRUDRest/productos/"+idProducto+"/"+nombreProducto+"/"+precioProducto+"/"+existencias;
		//String uri = "http://localhost:8080/CRUDRest/productos/"+idProducto;
		String uri = "http://localhost:8080/CRUDRest/productos";
		
		URL miURLEndpoint = null;
		
		try 
		{
			miURLEndpoint = new URL(uri);
			HttpURLConnection miConexion = (HttpURLConnection) miURLEndpoint.openConnection();
			miConexion.setRequestMethod("POST");
			miConexion.setRequestProperty("content-type", "application/json; charset=UTF-8");
			miConexion.setDoOutput(true);
			OutputStream os = miConexion.getOutputStream();
			OutputStreamWriter osw = new OutputStreamWriter(os, "UTF-8");
			Productos miProducto = new Productos("1","Papas",30.0,10);
			Gson miJson = new Gson();
			
			osw.write(miJson.toJson(miProducto));
			osw.flush();
			osw.close();
			os.close();
			//miConexion.setRequestMethod("DELETE");
			//miConexion.setRequestProperty("idProducto", "100");
			//miConexion.setRequestProperty("content-type", "text/xml; charset=UTF-8");
			
			//miConexion.setRequestProperty("Accept", "application/json; charset=UTF-8");
			
			
			if (miConexion.getResponseCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : "
						+ miConexion.getResponseCode());
			}
			BufferedReader br = new BufferedReader(new InputStreamReader(
					(miConexion.getInputStream())));

				String output;
				System.out.println("Output from Server .... \n");
				while ((output = br.readLine()) != null) {
					System.out.println(output);
				}

				miConexion.disconnect();
			
		} catch (MalformedURLException e) 
		{
			e.printStackTrace();
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
	}

}
