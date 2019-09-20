package com.jsfcrud.beans;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
//import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import com.jsfcrud.dao.DatabaseOperations;

@ManagedBean
@RequestScoped
public class ClientBean {
	private String idClient;
	private String nameClient;
	private String addressClient;
	
	public ArrayList clientsListFromDB;
	
	public ClientBean() {}
	public ClientBean(String idClient, String nameClient, String addressClient) {
		super();
		this.idClient = idClient;
		this.nameClient = nameClient;
		this.addressClient = addressClient;
	}
	public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}
	public String getNameClient() {
		return nameClient;
	}
	public void setNameClient(String nameClient) {
		this.nameClient = nameClient;
	}
	public String getAddressClient() {
		return addressClient;
	}
	public void setAddressClient(String addressClient) {
		this.addressClient = addressClient;
	}
	@Override
	public String toString() {
		return "ClientBean [idClient=" + idClient + ", nombreClient=" + nameClient + ", addressClient="
				+ addressClient + "]";
	}
	
	@PostConstruct
	public void init()
	{
		clientsListFromDB = DatabaseOperations.getClientsListFromDB();
	}
	
	public ArrayList clientsList()
	{
		return clientsListFromDB;
	}
	
	public String saveClientDetails(ClientBean newClientObj)
	{
		return DatabaseOperations.saveClientDetailsInDb(newClientObj);
	}
	
	public String editClientRecord(String idClient)
	{
		return DatabaseOperations.editClientRecordInDb(idClient);
	}
}
