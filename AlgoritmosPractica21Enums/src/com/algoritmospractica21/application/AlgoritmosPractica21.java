package com.algoritmospractica21.application;

public class AlgoritmosPractica21 {

	public enum Temporada
	{
		PRIMAVERA,
		VERANO,
		OTOÑO,
		INVIERNO
	}
	public static void main(String[] args) {
		
		for(Temporada tempo : Temporada.values())
		{
			System.out.println(tempo);
		}
		Temporada miTemporada = Temporada.PRIMAVERA;
		System.out.println(miTemporada.name());
		System.out.println(miTemporada.ordinal());
		System.out.println(miTemporada.values());
	}

}
