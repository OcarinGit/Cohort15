package com.springpractica1.beans;

public class ClienteBean {
	private String idcliente;
	private String nombreCliente;
	private String domicilioCliente;
	public ClienteBean()
	{
		System.out.println("----- Objeto Construído -----");
	}
	public ClienteBean(String idcliente, String nombreCliente, String domicilioCliente) {
		super();
		this.idcliente = idcliente;
		this.nombreCliente = nombreCliente;
		this.domicilioCliente = domicilioCliente;
	}
	public String getIdcliente() {
		return idcliente;
	}
	public void setIdcliente(String idcliente) {
		this.idcliente = idcliente;
	}
	public String getNombreCliente() {
		return nombreCliente;
	}
	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}
	public String getDomicilioCliente() {
		return domicilioCliente;
	}
	public void setDomicilioCliente(String domicilioCliente) {
		this.domicilioCliente = domicilioCliente;
	}
	@Override
	public String toString() {
		return "ClienteBean [idcliente=" + idcliente + ", nombreCliente=" + nombreCliente + ", domicilioCliente="
				+ domicilioCliente + "]";
	}

}
