package com.educacionIT.digitalers.Clase02;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        
    	//CONSTRUCTOR POR DEFECTO
    	Alumno alumno1 = new Alumno();
        alumno1.nombre = "Federico";
        alumno1.apellido = "Pacheco";
        alumno1.documento = "22222222";
        String[] cursosAlumni = {"Java", "Sql"};
        alumno1.cursos = cursosAlumni;
        System.out.println(alumno1.mostrarAtributos());
       
        //CONSTRUCTOR DEFINIDO
        Alumno alumno2 = new Alumno("Juan", 			"Gilberto","2515794",cursosAlumni);
        System.out.println(alumno2.mostrarAtributos());
       
    }
}
