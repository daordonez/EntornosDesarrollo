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
public class Persona {
    
    public static final String NIF_STRING_ASOCIATION = "TRWAGMYFPDXBNJZSQVHLCKE";

    private String nombre;
    private String apellido;
    private int altura;
    private int edad;
    private int peso;
    private char genero;
    private String nif;
    private String colorPelo;

    /* Método Constructor
     Se debe indicar si se desea crear un objeto persona sin o con atributos.
     Para ello se ha de indicar el número de atributos que si se desean sean obligatorios, en este caso
     Nombre apellidos.Estos serán los que se pasen en el momento de la construcción
    
     EL CONSTRUCTOR SIEMPRE SE LLAMA EXACTAMENTE IGUAL QUE LA CLASE
    
     NO SE PUEDEN TENER DOS METODOS INSTRUCTORES CON LA MISMA INTERFAZ, ES DECIR CON LOS MISMOS PARAMETROS 
     O NUMERO DE PARAMETROS.
    
    Los valores por defecto se pueden añadir tanto a los atributos como al constructor por defecto, de esta manera 
    cuando los demas metodos llamen al constructor serán los encargados de inicializarlo.
     */
    //Constructor por defecto
    public Persona(String nombre, String apellido) {
    //Uso del THIS para hacer referencia al propio nombre de la clase

        //Mediante esto se hace uso de los atributos arriba declarados, es decir los objetos que se creen
        //harán uso de dichos atributos.
        this.nombre = nombre;
        this.apellido = apellido;
        //A partir de este punto se inicializan los atributos que no se inicialicen explicitamente.
        this.edad = 0;
        this.altura = 0;
        this.peso = 0;
        this.genero = 'U';
        this.nif = "unknow";
        this.colorPelo = "unknow";
    }
    
    //Getters y setters
    
        public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre.length() <= 3) {
            
        }else{
            this.nombre = nombre;
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public String getColorPelo() {
        return colorPelo;
    }

    /*
    Para el uso de esta clase será necesario invocarlo desde el main donde se le pasa el nombre del nuevo objeto
    se le indica que va ser un nuevo objeto , y los atributos necesarios dependiendo del método empleado.
     */
    public void setColorPelo(String colorPelo) {
        this.colorPelo = colorPelo;
    }
     
    public void setNif (int nif){
        this.nif = String.valueOf(nif) + NIF_STRING_ASOCIATION.charAt(nif % 23);
    }
    public String getNif(){
        return this.nif;
    }
    
    //Segundo constructor
    public Persona(String nombre, String apellido, int edad) {
        //NO se pueden volver a declarar atributos anteriores SI estan ya existen en otro método
        this(nombre, apellido);
        // Si no se recibe el parametro se inicializa
        this.edad = edad;
    }
    //Tercer constructor
    //Este método recibe tres parametros pero de diferente tipo
    public Persona(String nombre, String apellido, char genero){
        //Se está haciendo uso mediante este parametro del primer método constructor
        this(nombre, apellido);
        //Se recibe el parametro de la función y se llama al atributo
        this.genero = genero;
    }
    
    //Metodos de la clase como mostrar su información
    public void mostrar() {
        System.out.println("Nombre:" + this.nombre);
        System.out.println("Apellido:" + this.apellido);
        System.out.println("Edad:"+this.edad);
        System.out.println("Altura:"+this.altura);
        System.out.println("Peso:"+this.peso);
        System.out.println("Genero:"+this.genero);
        System.out.println("NIF:"+this.nif);
        System.out.println("Color Pelo:"+this.colorPelo);
    }

}
