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
public class Alumno extends Persona{
    private String nia;
    
    public Alumno(String nombre, String apellidos, String nia){
        super(nombre, apellidos);
        this.nia = nia;
    }
}
