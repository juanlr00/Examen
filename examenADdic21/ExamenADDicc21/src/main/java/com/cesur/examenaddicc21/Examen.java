package com.cesur.examenaddicc21;

/**
 *
 * @author FranciscoRomeroGuill
 */
public class Examen {

    static final String AUTOR = "TU NOMBRE AQUI";
    static final String DNI = "TI DNI AQUI";
    
    public static void main(String[] args) {
        System.out.println("-------------------------------------------");
        System.out.println("EXAMEN ACCESO A DATOS");
        System.out.println("Diciembre 2021");
        System.out.println("Alumno: Juan Lamas Rubio " + AUTOR);
        System.out.println("DNI: 77443593V "+DNI);
        System.out.println("-------------------------------------------\n");

        System.out.println("\nEJERCICIO 1: Archivos");
        System.out.println("-------------------------------------------\n");
        
        Ejercicio1.solucion();
        
        System.out.println("\nEJERCICIO 2: JDBC");
        System.out.println("-------------------------------------------\n");
        
        Ejercicio2.solucion();

        System.out.println("\nEJERCICIO 3: Hibernate");
        System.out.println("-------------------------------------------\n");
        
        Ejercicio3.solucion();

        
    }
    
}
