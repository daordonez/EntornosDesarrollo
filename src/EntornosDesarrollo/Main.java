/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EntornosDesarrollo;

/**
 *
 * @author diegordonez
 */
public class Main {

    public static void main(String[] args) {
        
        //Creación de un nuevo objeto obedeciendo  a la clse persona
        Persona persona1 = new Persona("Diego", "Ordonez");
        
        //Mediante esta llamada se hace uso del segundo constructor
        Persona persona2 = new Persona("Alicia", "Fernandez", 24);
        
        //Uso del tercer constructor
        Persona persona3 = new Persona("Miguel", "Fernandez", 'M');
        
        //Crear objeto de tipo profesor
        
        Profesor profesor1 = new Profesor("Diego", "Ordonez", 'M', "PROG", 3456);
        
        profesor1.mostrar();
        System.out.println("-------------------");
        
        
        //Mostrar valores que se almacenan para los objetos
        persona1.mostrar();
        System.out.println("-------------------");
        persona2.mostrar();
        System.out.println("-------------------");
        persona3.mostrar();
    }
    
}
