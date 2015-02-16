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
public class EntityED {
    
    private float x;
    private float y;
    
    private boolean isStatic;
    private boolean isKinematic;
    private long id;
    private boolean isVisible;
    
    //Este atributo hace referencia a la clase y no a la instanciación de objetos, es decir 
    //se trata de un atributo de clase y no de objeto
    private static long nObjetos = 0;
    
    //Constructor por defecto
    public EntityED(){
        this.x = 0;
        this.y = 0;
        this.isStatic = true;
        this.isKinematic = true;
        //Contador de objetos creados con esta clase
        EntityED.nObjetos = EntityED.nObjetos++;
        this.id = EntityED.nObjetos;
    }
    
    public void mostrar(){
        System.out.println("x = "+this.x+", y="+this.y+" id ="+this.id);
    }
    
}
