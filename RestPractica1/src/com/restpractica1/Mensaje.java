package com.restpractica1;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/mensaje")
public class Mensaje {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String diHola()
	{
		return "Hola Fulanito";
	}
	
	@POST
	@Produces(MediaType.TEXT_HTML)
	public String diHolaNombre(@QueryParam("nombre") String nombre)
	{
		return "<html><head></head><body>Hola "+nombre+"</body></html>";
	}

}
