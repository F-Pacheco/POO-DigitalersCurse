package com.educacionIT.digitalers.Entidades;

public final class Documento {
	private String tipo;
	private String num;
	
	//Constructor
	public Documento() {
	}
	public Documento(String tipo, String num) {
		this.tipo = tipo;
		this.num = num;
	}
	
	//Getters and Setters
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNum() {
		return num;
	}
	public void setNum(String num) {
		this.num = num;
	}
	
	
	
	
}
