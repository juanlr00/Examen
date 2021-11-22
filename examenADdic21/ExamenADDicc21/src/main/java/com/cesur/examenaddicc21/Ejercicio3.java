package com.cesur.examenaddicc21;

import dao.BibliotecaDAO;
import models.Ejemplar;
import models.Libro;

class Ejercicio3 {

    /**
     * Enunciado:
     * 
     * Queremos gestionar los libros en la biblioteca teniendo en cuenta que no
     * es lo mismo un libro que un ejemplar.
     * De un mismo libro podemos tener varios ejemplares, cada uno en un estado
     * diferente, o de una edición diferente.
     * Por ello vamos a utilizar Hibernate para realizar la gestión.
     * 
     * Modificar esta clase para poder probar el correcto funcionamiento del 
     * programa, la clase BibliotecaDAO para implementar los métodos, las 
     * clases POJO para añadir la relación y el archivo de configuración 
     * de hibernate.
     */

    static void solucion() {
        
        var daoh = new BibliotecaDAO();
        
        var ej1 = new Ejemplar("bueno",2018);
        var ej2 = new Ejemplar("mal",2019);
        var ej3 = new Ejemplar("excelente",2021);
        
        Libro libro = new Libro();
        libro.setTitulo("Atrápame si puedes");
        libro.setAutor("José Luis");
        
        /* aqui faltaría asociar los ejemplares a este libro */
        
        daoh.saveLibro(libro);
        
        daoh.printInfo();
        
        
        
    }
    
}
