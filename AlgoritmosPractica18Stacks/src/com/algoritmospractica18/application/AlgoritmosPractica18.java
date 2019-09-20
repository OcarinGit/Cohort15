package com.algoritmospractica18.application;

import java.util.Iterator;
import java.util.Stack;
public class AlgoritmosPractica18 {

	public static void main(String[] args) {
		Stack<String> miPila = new Stack<String>();
		
		miPila.push("Magda");
		miPila.push("Omar");
		miPila.push("Neltzy");
		miPila.push("Nicole");
		miPila.push("Jebus");
		miPila.push("Emma");
		
		/*
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		System.out.println(miPila.pop());
		*/
		/*
		Iterator<String> miIterator = miPila.iterator();
		while(miIterator.hasNext())
		{
			System.out.println(miIterator.next());
		}
		*/
		while(!miPila.empty())
		{
			System.out.println(miPila.pop());
		}
	}

}
