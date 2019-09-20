package com.algoritmospractica8.application;

import com.algoritmospractica8.model.Vehicle;
import com.algoritmospractica8.model.Auto;
import com.algoritmospractica8.model.Plane;

public class AlgoritmosPractica8 {

	public static void main(String[] args) {
		Vehicle miVehiculo;
		miVehiculo = new Auto();
		
		
		Vehicle miSegundoVehiculo = new Plane();
		/*miVehiculo.setMaxFuel(100);
		miVehiculo.setMaxNroPasajeros(5);
		miVehiculo.setVelocidad(100);
		System.out.println(miVehiculo.toString());
		*/
		Auto miAuto = new Auto();
		Plane miPlane = new Plane();
		
		//Características del auto
		miAuto.setMaxFuel(200);
		miAuto.setMaxNroPasajeros(3);
		miAuto.setVelocidad(80);
		miAuto.setModelo(2015);
		System.out.println(miAuto.toString());
		
		//Características del avión
		miPlane.setMaxFuel(2000);
		miPlane.setMaxNroPasajeros(150);
		miPlane.setVelocidad(1500);
		miPlane.setMaxAltitud(10000);
		miPlane.setNumeroMotores(4);
		System.out.println(miPlane.toString());
	}

}
