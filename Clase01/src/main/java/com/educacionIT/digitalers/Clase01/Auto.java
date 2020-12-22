package com.educacionIT.digitalers.Clase01;

import javax.swing.JOptionPane;

public class Auto {
	String patente;
	String marca;
	String color;
	float precio;
	boolean encendido;
	
	void encender() {
		encendido = true;
	}
	void apagar() {
		encendido = false;
	}
	void mostrarAtributos() {
		JOptionPane.showMessageDialog(null,"color: "+color+", marca: "+ 			marca + ", patente: "+ patente +", precio: "+ precio);
	}
}