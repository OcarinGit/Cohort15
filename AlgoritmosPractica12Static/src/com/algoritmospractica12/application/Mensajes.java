package com.algoritmospractica12.application;

public class Mensajes {

	private String miMensaje;
	public static String mensajePaTodos="Bienvenidos";
	
	public Mensajes()
	{
		miMensaje="Sin Mensaje";
	}
	public Mensajes(String miMensaje)
	{
		this.miMensaje = miMensaje;
	}
	
	public String diHola()
	{
		return "Hola Tú";
	}
	public String diFriendzone()
	{
		return "Solo amigos";
	}
	public String getMiMensaje()
	{
		return miMensaje;
	}
	public void setMiMensaje(String miMensaje)
	{
		this.miMensaje=miMensaje;
	}
	
	
}
