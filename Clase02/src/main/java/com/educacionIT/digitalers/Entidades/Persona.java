package com.educacionIT.digitalers.Entidades;

/**
 * 
 * @author Federico
 *@version 1.0
 */
public class Persona {
	private String razonSocial;
	private Documento documento;
	private byte edad;
	
	//Constructors
	public Persona() {
		
	}
	public Persona(String razonSocial, Documento documento, byte edad) {
		this.razonSocial = razonSocial;
		this.documento = documento;
		this.edad = edad;
	}
	
	// Getters and Setters
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
	public byte getEdad() {
		return edad;
	}
	public void setEdad(byte edad) {
		this.edad = edad;
	}
	
	
}
