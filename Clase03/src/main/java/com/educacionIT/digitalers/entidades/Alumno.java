package com.educacionIT.digitalers.entidades;

public class Alumno extends Persona{
	private String[] cursos;
	
	//Constructors
	public Alumno() {
	}
	public Alumno(String razonSocial, Documento 	
	documento, Byte edad, String[] cursos) {
		super(razonSocial, documento, edad);
		this.cursos = cursos;
	}
	
	//Getters and Setters
	public String[] getCursos() {
		return cursos;
	}
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
}
