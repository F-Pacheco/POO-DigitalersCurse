package com.educacionIT.digitalers.Entidades;

/**
 * 
 * @author Federico
 * @version 1.0
 *
 */
public class Profesor extends Persona {
	private float pago;

// Constructors	
	public Profesor() {
	}
	public Profesor(String razonSocial, Documento documento, byte edad, float pago) {
		super(razonSocial, documento, edad);
		this.pago = pago;
	}

// Getters and Setters
	public float getPago() {
		return pago;
	}

	public void setPago(float pago) {
		this.pago = pago;
	}
 
}
