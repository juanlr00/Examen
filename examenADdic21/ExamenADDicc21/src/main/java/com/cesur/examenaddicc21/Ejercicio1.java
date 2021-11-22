package com.cesur.examenaddicc21;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

class Ejercicio1 {

    /**
     * Enunciado:
     * 
     * Completar el método estadísticasDeArchivo de manera que lea el archivo
     * de texto que se le pasa como parámetro, lo analice y muestre por consola 
     * el número de caracteres, palabras y líneas total.
     * 
     * Modificar solo el código del método.
     * 
     */
    
    static void solucion() {

        estadísticasDeArchivo("pom.xml");
    }

    private static void estadísticasDeArchivo(String archivo) {
        
        /* añadir código */
        //Con el BufferedReader y FileReader leemos el archivo de texto
       try (BufferedReader br = new BufferedReader(new FileReader("pom.xml"))){
            String linea;
            while ((linea = br.readLine()) != null){
                archivo += linea + "\n";
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.println(archivo);
        archivo = archivo.replaceAll("[\\.\\,\\(\\)]", "");
        String[] palabrasTexto = archivo.split(" ");
        
        
        
        
        System.out.println("Texto leido correctamente");
    }
  
}
