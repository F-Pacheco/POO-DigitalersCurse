package com.educacionIT.digitalers.Clase02;

import java.util.Arrays;

;

public class Alumno {
	String nombre;
	String apellido;
	String documento;
	String[] cursos;
	
	Alumno(){
		//SI DEFINIMOS UN CONSTRUCTOR DISTINTO, DEBEMOS
		//DEFINIR EL CONSTRUCTOR POR DEFECTO
	}
	Alumno(String nombre, String apellido, String documento, String[] 			cursos){
		this.nombre = nombre;
		this.apellido = apellido;
		this.documento = documento;
		this.cursos = cursos;
	}
	
	String mostrarAtributos(){
		String mensaje = "Nombre "+ nombre + ", Apellido " + apellido 			+". DNI "+ documento +"\n"+ Arrays.toString(cursos); 
		return mensaje;
	}

}