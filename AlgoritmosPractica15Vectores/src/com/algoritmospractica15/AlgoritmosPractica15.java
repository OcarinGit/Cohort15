package com.algoritmospractica15;

import java.util.Iterator;
import java.util.Vector;

public class AlgoritmosPractica15 {

	public static void main(String[] args) {
		final int ELEMENTOS_VECTOR=100;
		Vector<Double> miVector = new Vector(ELEMENTOS_VECTOR);
		
		double cont=0.0;
		//System.out.println(miVector.size());
		for(int i=0;i<ELEMENTOS_VECTOR;i++)
		{
			miVector.addElement(cont);
			cont++;
		}
		Iterator<Double> miIterator =  miVector.iterator();
		while(miIterator.hasNext())
		{
			System.out.println(miIterator.next());
		}
	}

}
