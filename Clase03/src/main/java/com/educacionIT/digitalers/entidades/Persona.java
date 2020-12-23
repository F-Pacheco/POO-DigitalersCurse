package com.educacionIT.digitalers.entidades;

import com.educacionIT.digitalers.interfaces.Archivo;

public abstract class Persona implements Archivo{
	private String razonSocial;
	private Documento documento;
	private Byte edad;

	//Constructors
	public Persona() {
	}
	public Persona(String razonSocial, Documento documento, byte edad) {
		this.razonSocial = razonSocial;
		this.documento = documento;
		this.edad = edad;
	//Getters and Setters
	
	}
	public String getRazonSocial() {
		return razonSocial;
	}
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	public Documento getDocumento() {
		return documento;
	}
	public void setDocumento(Documento documento) {
		this.documento = documento;
	}
	public Byte getEdad() {
		return edad;
	}
	public void setEdad(Byte edad) {
		this.edad = edad;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Persona Nombre: " + razonSocial + ", documento: " + documento + ", edad: " + edad;
	}
	

	
	
}
