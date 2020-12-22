package com.educacionIT.digitalers.Clase01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Auto auto1 = new Auto();
        auto1.color = "Rojo";
        auto1.marca = "Ford";
        auto1.patente = "3bcd";
        auto1.precio = 500.20f;
        
        auto1.encender();
        auto1.mostrarAtributos();
        
        
    }
}