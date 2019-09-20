package com.hibernatepractica1.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Productos")
public class Productos {
	
	@Id
	@Column(name="idProducto")
	private String idProducto;
	@Column(name="nombreProducto")
	private String nombreProducto;
	@Column(name="precioProducto")
	private double precioProducto;
	@Column
	private int existencias;
	
	public Productos() {
	}
	public Productos(String idProducto, String nombreProducto, double precioProducto, int existencias) {
		this.idProducto = idProducto;
		this.nombreProducto = nombreProducto;
		this.precioProducto = precioProducto;
		this.existencias = existencias;
	}
	public String getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombreProducto() {
		return nombreProducto;
	}
	public void setNombreProducto(String nombreProducto) {
		this.nombreProducto = nombreProducto;
	}
	public double getPrecioProducto() {
		return precioProducto;
	}
	public void setPrecioProducto(double precioProducto) {
		this.precioProducto = precioProducto;
	}
	public int getExistencias() {
		return existencias;
	}
	public void setExistencias(int existencias) {
		this.existencias = existencias;
	}
	@Override
	public String toString() {
		return "Productos [idProducto=" + idProducto + ", nombreProducto=" + nombreProducto + ", precioProducto="
				+ precioProducto + ", existencias=" + existencias + "]";
	}
	
}
