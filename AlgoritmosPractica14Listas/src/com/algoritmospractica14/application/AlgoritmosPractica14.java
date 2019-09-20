package com.algoritmospractica14.application;

import java.util.ArrayList;
import java.util.Iterator;

public class AlgoritmosPractica14 {

	public static void main(String[] args) {
		ArrayList<String> miLista=new ArrayList<String>();
		miLista.add("Miguel Angel");
		miLista.add("Gerardo");
		miLista.add("Magda");
		miLista.add("Jannni");
		
		Iterator<String> miIterador = miLista.iterator();
		while(miIterador.hasNext())
		{
			System.out.println(miIterador.next());
		}
		
		ArrayList<Integer> miLista2 = new ArrayList<Integer>();
		for(int i=1;i<=1000000;i++)
		{
			miLista2.add(i);
		}
		/*
		miLista2.add(1);
		miLista2.add(2);
		miLista2.add(100);
		miLista2.add(256);
		miLista2.add(356);
		*/
		//foreach (integer miEntero in miLista2)
		/*for(Integer miEntero:miLista2)
		{
			System.out.println(miEntero);
		}*/
		Iterator<Integer> miIterator2 = miLista2.iterator();
		while(miIterator2.hasNext())
		{
			System.out.println(miIterator2.next());
		}
	}

}
