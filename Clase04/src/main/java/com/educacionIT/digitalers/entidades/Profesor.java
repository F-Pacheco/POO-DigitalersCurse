package com.educacionIT.digitalers.entidades;

public class Profesor extends Persona {
	private Float pago;

	
	//Constructors
	public Profesor() {
	}
	public Profesor(String descripcion, Documento documento, Byte edad, Float pago) {
		super(descripcion, documento, edad);
		this.pago = pago;
	}

	//Getters and Setters
	public Float getPago() {
		return pago;
	}

	public void setPago(Float pago) {
		this.pago = pago;
	}
	
	//Methods
	@Override
	public String toString() {
		return "Profesor " + super.toString() + ", pago:" + pago;
	}
	
	public void save() {
		System.out.println("Saving profesor...");
		
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
