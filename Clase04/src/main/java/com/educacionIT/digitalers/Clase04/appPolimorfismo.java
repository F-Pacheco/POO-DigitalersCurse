package com.educacionIT.digitalers.Clase04;

import com.educacionIT.digitalers.entidades.Alumno;
import com.educacionIT.digitalers.entidades.Persona;
import com.educacionIT.digitalers.entidades.Profesor;

public class appPolimorfismo {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno();
		Profesor profe1 = new Profesor();
		
		Persona perso1 = new Alumno();
		perso1.save();
		profe1.delete();
		
	}

}
