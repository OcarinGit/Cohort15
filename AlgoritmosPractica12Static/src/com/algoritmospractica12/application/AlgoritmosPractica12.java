package com.algoritmospractica12.application;

import java.util.Scanner;

public class AlgoritmosPractica12 {

	public static void main(String[] args) {
		Mensajes objMensaje1 = new Mensajes("Hola Mundo");
		Mensajes objMensaje2 = new Mensajes("Hola Loosers");
		Scanner entradaTeclado = new Scanner(System.in);
		String unaCadena;
		
		System.out.println("Introduce un Mensaje para todos los objetos");
		unaCadena = entradaTeclado.nextLine();
		
		Mensajes.mensajePaTodos=unaCadena;
		objMensaje1.setMiMensaje(unaCadena);
		System.out.println("ojbMensaje1:"+objMensaje1.diFriendzone());
		System.out.println("ojbMensaje1:"+objMensaje1.diHola());
		System.out.println("objMensaje1:"+objMensaje1.getMiMensaje());
		System.out.println("objMensaje1:"+objMensaje1.mensajePaTodos);
		
		System.out.println("ojbMensaje2:"+objMensaje2.diFriendzone());
		System.out.println("ojbMensaje2:"+objMensaje2.diHola());
		System.out.println("objMensaje2:"+objMensaje2.getMiMensaje());
		System.out.println("objMensaje2:"+objMensaje2.mensajePaTodos);
		Mensajes.mensajePaTodos="Perdedores";
		
		System.out.println("ojbMensaje1:"+objMensaje1.diFriendzone());
		System.out.println("ojbMensaje1:"+objMensaje1.diHola());
		System.out.println("objMensaje1:"+objMensaje1.getMiMensaje());
		System.out.println("objMensaje1:"+objMensaje1.mensajePaTodos);
		
		System.out.println("ojbMensaje2:"+objMensaje2.diFriendzone());
		System.out.println("ojbMensaje2:"+objMensaje2.diHola());
		System.out.println("objMensaje2:"+objMensaje2.getMiMensaje());
		System.out.println("objMensaje2:"+objMensaje2.mensajePaTodos);
	}

}
