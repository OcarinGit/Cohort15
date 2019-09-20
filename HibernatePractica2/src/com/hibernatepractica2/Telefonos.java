package com.hibernatepractica2;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Telefonos implements Serializable{
	@Id
	@Column
	private String idTelefono;
	@Column
	private String telefono;
	@Column
	private String horario;
	@ManyToOne
	@JoinColumn(name="idcliente", insertable=true, updatable=false)
	/*@JoinTable(
			name="telefonos",
			joinColumns = @JoinColumn(name="idCliente")
			//inverseJoinColumns = @JoinColumn(name="idTelefono")
			)*/
	private Clientes idCliente;
	
	public Telefonos()
	{}
	
	public Telefonos(String idTelefono, String telefono, String horario) {
		super();
		this.idTelefono = idTelefono;
		this.telefono = telefono;
		this.horario = horario;
	}

	public String getIdTelefono() {
		return idTelefono;
	}

	public void setIdTelefono(String idTelefono) {
		this.idTelefono = idTelefono;
	}

	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Clientes getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Clientes idCliente) {
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return "Telefonos [idTelefono=" + idTelefono + ", telefono=" + telefono + ", horario=" + horario + "]";
	}
	
}
