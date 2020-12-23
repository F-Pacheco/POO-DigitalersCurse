package com.educacionIT.digitalers.Clase03;

import com.educacionIT.digitalers.entidades.Alumno;
import com.educacionIT.digitalers.entidades.Documento;
import com.educacionIT.digitalers.entidades.Profesor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String[] cursos1 = {"Java","sql"};
    	Alumno alumno1 = new Alumno("Federico",new Documento("Dni","3484597"),(byte)25,cursos1);
    	Profesor profe1 = new Profesor("Octavio", new Documento("Dni","4525879"),(byte)42,45000f);
    		
    	System.out.println(alumno1);
    	System.out.println(profe1);
    	
    	
    }
}
