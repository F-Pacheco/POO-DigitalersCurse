package com.educacionIT.digitalers.Clase04;

import com.educacionIT.digitalers.entidades.Alumno;
import com.educacionIT.digitalers.entidades.Documento;
import com.educacionIT.digitalers.entidades.Profesor;

public class App 
{
    public static void main( String[] args )
    {
    	
    	//CLASE04 TRABAJA CON JAVA 8
        Profesor profe1 = new Profesor("Lindo", new Documento ("DNI","4595782"), (byte) 25,500f);
        String[] cursoAl = {"Java","Sql"};
        Alumno alum1 = new Alumno("feo",new Documento("Dni","4568746"),(byte)19,cursoAl);
        System.out.println(profe1);
        System.out.println(alum1);

        alum1.save();
        profe1.save();
    }
}
