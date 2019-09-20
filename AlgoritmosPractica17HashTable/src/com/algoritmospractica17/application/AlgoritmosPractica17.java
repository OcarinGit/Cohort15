package com.algoritmospractica17.application;

import java.util.Hashtable;
import java.util.Map;

public class AlgoritmosPractica17 {
	public static void main(String[] args) {
		Hashtable<Integer, String> miHashTable = new Hashtable<Integer, String> ();
		
		miHashTable.put(1, "Papa");
		miHashTable.put(2, "Pepe");
		miHashTable.put(3, "Pipi");
		miHashTable.put(4, "Popo");
		miHashTable.put(5, "Pupu");
		
		for(Map.Entry<Integer, String> miEntry:miHashTable.entrySet())
		{
			System.out.println(String.format("Key:%d, Value:%s", miEntry.getKey(), miEntry.getValue()));
		}
		
	}

}
