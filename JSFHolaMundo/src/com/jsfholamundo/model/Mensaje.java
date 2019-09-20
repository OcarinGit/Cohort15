package com.jsfholamundo.model;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="mensajitu")
@SessionScoped
public class Mensaje {
	private String msg;

	public String diHola(String nombre)
	{
		return "Mensajitu "+nombre;
	}
	
	public Mensaje()
	{}
	public Mensaje(String msg) {
		super();
		this.msg = msg;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	@Override
	public String toString() {
		return "Mensaje [msg=" + msg + "]";
	}
}
