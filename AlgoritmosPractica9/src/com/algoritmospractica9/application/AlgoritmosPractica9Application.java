package com.algoritmospractica9.application;

import com.algoritmospractica9.model.Cadenitas;

public class AlgoritmosPractica9Application 
{

	public static void main(String[] args) 
	{
		String miCadenita = new String("Este es un texto de prueba para testear la clase cadena de la API de Java versión 12. Por lo tanto es un testo dummy que no sirve pa'nada. Está de más probarlo para otro uso. Este es otro texto dummy. Y este es otro texto dummy. No me gsuta desvelarme. Otro testo.");
		String[] miCadenita2 = {"Este es otro texto explicativo que no sirve pa'nada, sino para testear la clase cadena de la API de Java 12.","Este es otro texto explicativo que no sirve pa'nada, sino para testear la clase cadena de la API de Java 12.","Este es otro texto explicativo que no sirve pa'nada, sino para testear la clase cadena de la API de Java 12."};
		String miCadenita3 = new String("Este es un texto de prueba para testear la clase cadena de la API de Java versión 12. Por lo tanto es un testo dummy que no sirve pa'nada");
		String[] miCadenita4 = new String[10];
		miCadenita4[0]="Adan";
		miCadenita4[1]="y";
		miCadenita4[2]="Axel";
		miCadenita4[3]="Se";
		miCadenita4[4]="Aman XOXOXO";
		
		for(String elemento:miCadenita4)
		{
			System.out.println(elemento);
		}
		
		
		miCadenita2[0]="Hola";
		
		System.out.println(Cadenitas.dameCaracterIndice(miCadenita, 3));
		//System.out.println(miCadenita2[0]);
		System.out.println(miCadenita.codePointCount(7,14));
		String cadenita4="dddd";
		String cadenita5="dddd";
		System.out.println(cadenita4.compareTo(cadenita5));
		if(cadenita4.compareTo(cadenita5)==0)
		{
			System.out.println("Sí son iguales");
		}
		
		System.out.println(miCadenita.equals(miCadenita3));
		if(miCadenita.equals(miCadenita3))
		{
			System.out.println("Sí son iguales (equals)");
		}
		if(cadenita4.endsWith("dd"))
		{
			System.out.println("Si termina con dd");
		}
		int operador1=10;
		int operador2=20;
		int resultado=operador1+operador2;
		System.out.println("La sumatoria de "+operador1+" y "+operador2+" es igual a "+resultado);
		System.out.println(String.format("La sumatoria de %d y %d es igual a %d", operador1, operador2, resultado));
		
		byte[] numeritos = cadenita4.getBytes();
		for(int i=0;i<numeritos.length;i++)
		{
			System.out.println(numeritos[i]);
		}
		for(byte b:numeritos)
		{
			System.out.println(b);
		}
		
		System.out.println("La J mayúscula se encuentra en "+miCadenita.indexOf("API"));
		if(cadenita4.isEmpty())
		{
			System.out.println("La cadenita 4 está vacía");
		}
		else
		{
			System.out.println("La cadenita 4 NO está vacía");
		}
		
		System.out.println("Longitud de cadenita(String):"+miCadenita.length());
		System.out.println(String.format("Longitud de cadenita2(vector):%d", miCadenita2.length));
		
		String cadenaEvaluar="micorreo1@micorreo.coma";
		System.out.println(
		cadenaEvaluar.matches("[A-Za-z0-9]+@[A-Za-z]+.[A-Za-z]{3}"));
		
		System.out.println(miCadenita.replace('e', 'a'));
		
		String[] miTesto = miCadenita.split("[.]");
		for(String cadena:miTesto)
		{
			//System.out.println(cadena.strip());
		}
		
		System.out.println(miCadenita.startsWith("Este"));
		
		System.out.println(miCadenita.substring(10, 20));
		char[] miCadenaChars = miCadenita.toCharArray();
		int cont=0;
		for(int i=0;i<miCadenaChars.length;i++)
		{
			if(miCadenaChars[i]=='e')
			{
				cont++;
			}
		}
		System.out.println("La cantidad de e es:"+cont);
		System.out.println(miCadenita.toLowerCase());
		System.out.println(miCadenita.toUpperCase());
		System.out.println(String.valueOf('M'));
	}

}





