package com.educacionIT.digitalers.entidades;

import java.util.Arrays;

public class Alumno extends Persona{
	private String[] cursos;

	//Constructors
	public Alumno() {
	}
	public Alumno(String descripcion, Documento documento, Byte edad, String[] cursos) {
		super(descripcion, documento, edad);
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
	
	public void save() {
		System.out.println("Saving student...");
		
	}
	
	public Boolean insert() {
		// TODO Auto-generated method stub
		return null;
	}

	public Boolean delete() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
	
	
}
