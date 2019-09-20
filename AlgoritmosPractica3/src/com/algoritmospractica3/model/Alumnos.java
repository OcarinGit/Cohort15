package com.algoritmospractica3.model;

public class Alumnos 
{
	private String codigoAlumno;
	private String nombreAlumno;
	private double calificacionAlumno;
	
	public Alumnos()
	{}
	
	public Alumnos(String codigoAlumnoParametro, String nombreAlumnoParametro, double calificacionAlumnoParametro)
	{
		codigoAlumno = codigoAlumnoParametro;
		nombreAlumno = nombreAlumnoParametro;
		calificacionAlumno = calificacionAlumnoParametro;
	}
	
	public String getCodigoAlumno()
	{
		return codigoAlumno;
	}
	public void setCodigoAlumno(String codigoAlumno)
	{
		this.codigoAlumno = codigoAlumno;
	}
	public String getNombreAlumno()
	{
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno)
	{
		this.nombreAlumno = nombreAlumno;
	}
	public double getCalificacionAlumno()
	{
		return calificacionAlumno;
	}
	public void setCalificacionAlumno(double calificacionAlumno)
	{
		this.calificacionAlumno = calificacionAlumno;
	}
}
