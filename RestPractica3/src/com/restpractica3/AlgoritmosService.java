package com.restpractica3;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/algoritmos")
public class AlgoritmosService {
	@GET
	public String diHolaMundo()
	{
		return "Hola Prro";
	}
}
