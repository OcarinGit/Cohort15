package com.junitpractica1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junitpractica1.model.Operaciones;

class OperacionesTest {

	@Test
	void testSumaEnteros() {
		Operaciones objOperaciones = new Operaciones();
		
		int resultadoReal;
		int resultadoEsperado=20;
		
		resultadoReal=objOperaciones.sumaEnteros(10, 10);
		assertEquals(resultadoEsperado, resultadoReal,0.01);
	}

	@Test
	void testSumaDobles()
	{
Operaciones objOperaciones = new Operaciones();
		
		double resultadoReal;
		double resultadoEsperado=20.001;
		
		resultadoReal=objOperaciones.sumaDobles(10.0, 10.0);
		assertEquals(resultadoEsperado, resultadoReal,0.01);
	}
}
