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
public class Profesor extends Persona{
    private String asignatura;
    private int codigoP = 0;
    
    //Constructor
    public Profesor(String nombre,String apellido, char genero,String asig, int codigoP){
        super(nombre, apellido, genero);
        this.asignatura = asig;
        this.codigoP = codigoP;
        
        //Inicializar
        asignatura = null;
    }
    
    //MUY IMPORTANTE
    //Mediante esta palabra es especifica que el metodo que existe en padre "mostrar" se va a mostrar
    @Override
    //1. Metodo
    public void mostrar(){
        //Mediante esta linea llama al metodo mostrar del padre
        super.mostrar();
        System.out.println("Asignatura: "+this.asignatura);
        System.out.println("Codigo Profesor: "+this.codigoP);
    }
}
