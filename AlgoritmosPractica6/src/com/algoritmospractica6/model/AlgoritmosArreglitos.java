package com.algoritmospractica6.model;

public class AlgoritmosArreglitos 
{
	public static int cantidadPares(int[] vector)
	{
		int nPares=0;
		for(int i=0;i<vector.length;i++)
		{
			if(vector[i]%2==0)
			{
				nPares++;
			}
		}
		return nPares;
	}
}
