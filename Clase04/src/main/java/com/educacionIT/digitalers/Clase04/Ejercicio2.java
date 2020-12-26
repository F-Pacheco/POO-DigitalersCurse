package com.educacionIT.digitalers.Clase04;

import javax.swing.JOptionPane;

import com.educacionIT.digitalers.entidades.Alumno;
import com.educacionIT.digitalers.entidades.Persona;
import com.educacionIT.digitalers.entidades.Profesor;

public class Ejercicio2 {

	public static void main(String[] args) {
		Profesor profe1 = new Profesor();
		Alumno alum1 = new Alumno();
		mostrarTipo(profe1);
		mostrarTipo(alum1);
		setAdicionales(alum1);
		setAdicionales(profe1);
	}
	
	public static void mostrarTipo(Persona persona) {
		//return type of the object
		if (persona instanceof Profesor) {
			System.out.println("Profesor");
		} else if (persona instanceof Alumno){
			System.out.println("Alumno");
		}
	}
	
	public static void setAdicionales(Object obj) {
		if (obj instanceof Alumno) {
			String[] cursos = {"Java", "Js"};
			Alumno alumno = (Alumno) obj;  //Casteo el parametro
			alumno.setCursos(cursos);
			JOptionPane.showMessageDialog(null, alumno);
		}else if (obj instanceof Profesor) {
			Profesor profe = (Profesor) obj;
			profe.setPago(25000f);
			JOptionPane.showMessageDialog(null, profe);
		}
		
	}

}
