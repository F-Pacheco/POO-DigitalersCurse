package com.educacionIT.digitalers.entidades;

import java.util.concurrent.atomic.AtomicInteger;

import com.educacionIT.digitalers.interfaces.DAO;

public abstract class Persona implements DAO{
	private Integer id;
	private String descripcion;
	private Documento documento;
	private Byte edad;
	
	// AtomicInteger permite trabajar con concurrencia, se usa para APLICACIONES WEB
	private static AtomicInteger contador = new AtomicInteger(1);
	
	//Constructors
	public Persona() {
		this.id = contador.getAndIncrement();
	}
	public Persona(String descripcion, Documento documento, Byte edad) {
		this.id = contador.getAndIncrement();
		this.descripcion = descripcion;
		this.documento = documento;
		this.edad = edad;
	}
	
	//Getters and Setters
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
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
		return "id: " + id + ", descripcion: " + descripcion + documento + ", edad: " + edad;
	}
		
}
