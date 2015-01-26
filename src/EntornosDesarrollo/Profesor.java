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
    private String asignatura = null ;
    private int codigoP = 0;
    
    //Constructor
    public Profesor(String nombre,String apellido, char genero, String asig, int codigoP){
        super(nombre, apellido, genero);
        this.asignatura = asig;
        this.codigoP = codigoP;  
    }
    /*
        SETERS
        Normalmente los seters no devuelven nada, sino que simplemente reciben el parametro que se 
        desea modificar. En el caso de devolver algo simplmente para confirmar que se ha modificado
        Los setters son especialmente utiles para establecer las reglas de modificado de un objeto,
        pudiendo establecer parametros como cantidad de caractres, manera de introducir...
    */
    public void setAsignatura(String asig){
        this.asignatura = asig;
    }
    /*
        GETTERS
        Mediante estos métodos es como se recogen los datos desde los objetos, con caracteristicas similares 
        a los setters.
        El retorno debe ser , normalmente, del mismo tipo que el parametro que se pasa
    */
    public String getAsignatura(String asig){
        return this.asignatura;
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
