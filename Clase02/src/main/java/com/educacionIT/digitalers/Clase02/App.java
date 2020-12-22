package com.educacionIT.digitalers.Clase02;

import com.educacionIT.digitalers.Entidades.Alumno;
import com.educacionIT.digitalers.Entidades.Documento;
import com.educacionIT.digitalers.Entidades.Profesor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Profesor profe1 = new Profesor( "Federico",new Documento ("DNI","3746785"), (byte) 41, (byte) 200000);
    	System.out.println("Nombre: "+profe1.getRazonSocial());
    	System.out.println("Tipo: "+profe1.getDocumento().getTipo()+", Numero: "+profe1.getDocumento().getNum());
    }
}
