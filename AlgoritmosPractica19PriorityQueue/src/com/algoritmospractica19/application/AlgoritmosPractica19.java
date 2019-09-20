package com.algoritmospractica19.application;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class AlgoritmosPractica19 {

	public static void main(String[] args) {
		PriorityQueue<String> miColita = new PriorityQueue<String>();
		
		miColita.add("Magda");
		miColita.add("Omar");
		miColita.add("Neltzy");
		miColita.add("Nicole");
		miColita.add("Jebus");
		miColita.add("Emma");
		
		while(!miColita.isEmpty())
		{
			System.out.println(miColita.remove());
		}
		
		PriorityQueue<Integer> miColitaEnteros = new PriorityQueue<Integer>();
		miColitaEnteros.add(150);
		miColitaEnteros.add(36);
		miColitaEnteros.add(160);
		miColitaEnteros.add(1);
		miColitaEnteros.add(500);
		
		System.out.println();
		while(!miColitaEnteros.isEmpty())
		{
			System.out.println(miColitaEnteros.poll());
		}
		
		ArrayDeque<Integer> miDeque = new ArrayDeque<Integer>();
		miDeque.add(150);
		miDeque.add(36);
		miDeque.add(160);
		miDeque.add(1);
		miDeque.add(500);
		while(!miDeque.isEmpty())
		{
			System.out.println(miDeque.remove());
		}
	}

}
