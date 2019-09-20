package com.hibernatepractica2;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="clientes")
public class Clientes implements Serializable {
	@Id
	@Column
	private String idCliente;
	@Column
	private String nombreCliente;
	@Column
	private String domicilioCliente;
	@OneToMany //(mappedBy = "idCliente") //(cascade= {CascadeType.ALL, CascadeType.MERGE})
	@JoinColumn(name="idcliente", insertable=true, updatable=false)
	/*@JoinTable(
			//name="clientes",
			joinColumns = @JoinColumn(name="idCliente")
			//inverseJoinColumns = @JoinColumn(name="idTelefono")
			)*/
	private Set<Telefonos> listaTelefonos = new HashSet<Telefonos>();
	
	public Clientes()
	{}
	
	public Clientes(String idCliente, String nombreCliente, String domicilioCliente, Set<Telefonos> listaTelefonos) {
		super();
		this.idCliente = idCliente;
		this.nombreCliente = nombreCliente;
		this.domicilioCliente = domicilioCliente;
		this.listaTelefonos = listaTelefonos;
	}

	public String getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(String idCliente) {
		this.idCliente = idCliente;
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
	
	public Set<Telefonos> getListaTelefonos() {
		return listaTelefonos;
	}
	public void setListaTelefonos(Set<Telefonos> listaTelefonos) {
		this.listaTelefonos = listaTelefonos;
	}
	@Override
	public String toString() {
		return "Clientes [idCliente=" + idCliente + ", nombreCliente=" + nombreCliente + ", domicilioCliente="
				+ domicilioCliente + ", listaTelefonos=" + listaTelefonos + "]";
	}
	
}
