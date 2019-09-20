package com.crudrestclient.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class ClimaApp {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce el nombre del país:");
		//String nombre = entrada.next();
		//woeid de Mexico=116545
		
		/*System.out.println("Introduce el nombre del Producto a Crear:");
		String nombreProducto = entrada.next();
		System.out.println("Introduce el precio del Producto a Crear:");
		double precioProducto = entrada.nextDouble();
		System.out.println("Introduce las existencias del Producto a Crear:");
		
		int existencias = entrada.nextInt();
		*/
		//String uri = "http://localhost:8080/CRUDRest/productos/"+idProducto+"/"+nombreProducto+"/"+precioProducto+"/"+existencias;
		//String uri = "https://www.metaweather.com/api/location/search/?query="+nombre;
		String uri = "https://www.metaweather.com/api/location/44418/";
		
		URL miURLEndpoint = null;
		
		try 
		{
			miURLEndpoint = new URL(uri);
			HttpURLConnection miConexion = (HttpURLConnection) miURLEndpoint.openConnection();
			miConexion.setRequestMethod("GET");
			//miConexion.setRequestProperty("idProducto", "100");
			//miConexion.setRequestProperty("content-type", "text/xml; charset=UTF-8");
			miConexion.setRequestProperty("Accept", "application/json; charset=UTF-8");
			
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
