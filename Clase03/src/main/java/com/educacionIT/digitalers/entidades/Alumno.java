package com.educacionIT.digitalers.entidades;

import java.util.Arrays;



public class Alumno extends Persona {
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
	
	//Methods
	@Override
	public String toString() {
		return "Alumno " + super.toString() + ", cursos:" + Arrays.toString(cursos);
	}
	public String openArchive() {
		System.out.println("Abriendo...");
		return null;
	}
	
	public Boolean saveArchive() {
		System.out.println("Guardando...");
		return null;
	}

}
