package com.educacionIT.digitalers.entidades;

import com.educacionIT.digitalers.interfaces.DAO;

public class Documento implements DAO{
	private String tipo;
	private String num;
	
	//Constructors
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
	
	//Methods
	@Override
	public String toString() {
		return " "+tipo + " num: " + num;
	}
	
	public void save() {
		// TODO Auto-generated method stub
		
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
