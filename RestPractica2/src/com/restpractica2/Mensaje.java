package com.restpractica2;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

@Path("/mensaje")
public class Mensaje {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String diHola()
	{
		return "Ola Camello";
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	public String diHola2()
	{
		return "Ola Camellou";
	}
	
	@PUT
	@Produces(MediaType.TEXT_PLAIN)
	public String diHola3()
	{
		return "Ola Camellito";
	}
	
	@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	public String diHola4()
	{
		return "Ola Camellitou";
	}
	
	@POST
	@Consumes(MediaType.TEXT_PLAIN)
	public int suma(@QueryParam("num1") int num1, @QueryParam("num2") int num2)
	{
		return num1+num2;
	}
	
	@POST
	@Path("/manejocadenas/{cadena}")
	@Consumes(MediaType.TEXT_PLAIN)
	public String reversado(@PathParam("cadena") String cadena)
	{
		String cad = "";
		for(int i=cadena.length()-1;i>=0;i--)
		{
			cad+=cadena.charAt(i);
		}
		return cad;
	}
}
