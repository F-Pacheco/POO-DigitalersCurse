package com.educacionIT.digitalers.Clase04;

import java.util.Iterator;

import javax.swing.JOptionPane;

import com.educacionIT.digitalers.entidades.Alumno;
import com.educacionIT.digitalers.entidades.Documento;
import com.educacionIT.digitalers.entidades.Persona;
import com.educacionIT.digitalers.entidades.Profesor;

public class Ejercicio {

	public static void main(String[] args) {
		Persona[] personas;
		int cantPersonas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad"));
		personas = new Persona[cantPersonas];
		
		for (int i = 0; i < personas.length; i++) {
			String tipoPersona= JOptionPane.showInputDialog("Tipo de persona");
			String descripcion = JOptionPane.showInputDialog("Nombre y apellido");
			String tipo = JOptionPane.showInputDialog("tipo dni");
			String numero = JOptionPane.showInputDialog("numero dni");
			Byte edad = Byte.parseByte(JOptionPane.showInputDialog("edad"));
			
			if (tipoPersona.equalsIgnoreCase("profesor")) {
				Float pago = Float.parseFloat(JOptionPane.showInputDialog("Pago"));
				personas[i] = new Profesor(descripcion, new Documento(tipo, numero), edad, pago);
		
			}else if (tipoPersona.equalsIgnoreCase("alumno")) {
				String[] cursos;
				int cantCursos = Integer.parseInt(JOptionPane.showInputDialog("cantidad de cursos"));
			    cursos = new String [cantCursos];
				for (int j = 0; j < cursos.length; j++) {
					cursos[j] = JOptionPane.showInputDialog("Curso"+(j+1));
				}
				personas[i] = new Alumno(descripcion, new Documento(tipo, numero), edad, cursos);
			}
		}
		
		for (int i = 0; i < personas.length; i++) {
			System.out.println(personas[i]);
		}
		
	}

}
