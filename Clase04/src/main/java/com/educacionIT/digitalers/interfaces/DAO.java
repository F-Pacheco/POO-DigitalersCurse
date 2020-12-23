package com.educacionIT.digitalers.interfaces;

//Data Access Object

public interface DAO {
	void save();
	Boolean insert();
	Boolean delete();
	
	//En JAVA 8 se puede definir un metodo
	//como default para que las clases que 
	//implementen esta clase
	//lo hereden y se aplique polimorfismo
		
	default String[] listar() {
		String[] lista = {"uno","dos"};
		return lista;
	}
}
