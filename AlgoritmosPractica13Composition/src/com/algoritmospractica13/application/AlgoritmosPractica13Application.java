package com.algoritmospractica13.application;

import com.algoritmospractica13.model.Domicilio;
import com.algoritmospractica13.model.Empleado;

public class AlgoritmosPractica13Application {

	public static void main(String[] args) 
	{
		Domicilio miDomicilio = new Domicilio();
		miDomicilio.setCalle("Periferico");
		miDomicilio.setNumero(60);
		miDomicilio.setCodigoPostal(48601);
		
		Empleado miEmpleado = new Empleado();
		miEmpleado.setIdEmpleado(101);
		miEmpleado.setNombreEmpleado("Jani");
		miEmpleado.setDomicilioEmpleado(miDomicilio);
		
	}

}
