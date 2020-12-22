package com.educacionIT.digitalers.Clase03;

import com.educacionIT.digitalers.entidades.Documento;
import com.educacionIT.digitalers.utilidades.Calculos;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Calculos calcular = new Calculos();
    	calcular.imprimirVersion();
    	calcular.verVersion("524");
    	
    	Calculos.verVersion("23");
    	
    }
}
