package com.educacionIT.digitalers.entidades;

public class Profesor extends Persona{
	private Float pago;
	
	//Constructors
	public Profesor() {
	}
	public Profesor(String razonSocial, Documento documento, byte edad, float pago) {
		super(razonSocial, documento, edad);
		this.pago = pago;
	}
	//Getters and Setters
	public float getPago() {
		return pago;
	}
	public void setPago(Float pago) {
		this.pago = pago;
	}
	
	@Override
	public String toString() {
		return "Profesor Nombre: " + getRazonSocial() + " " + getDocumento() + ", edad: "
				+ getEdad() + ", pago: " + pago;
	}

	public Boolean saveArchive() {
		System.out.println("Guardando...");
		return null;
	}

	public String openArchive() {
		System.out.println("Abriendo...");
		return null;
	}
	
	
}
