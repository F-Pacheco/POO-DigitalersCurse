package com.educacionIT.digitalers.interfaces;

import java.io.File;

//Todos los metodos y atributos son public static
public interface Print {
	final String DIRECCION_DEFECTO="C:\\";
	void printScreen();
	void printFile(File archive);
}
