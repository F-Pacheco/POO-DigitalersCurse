package com.educacionIT.digitalers.interfaces;

public interface Archivo {
	
	//Hasta Java 7 los metodos deben ser public abstract
	
	public abstract Boolean saveArchive();
	
	//Si no tienen public abstract, es porque esta implicito
	
	String openArchive();
	
}
