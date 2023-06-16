
package Entidad;


public class Persona {
   
    public String nombre;
    public String apellidos;
    public int edad;
    public String id;
    public String correo;

    //Metodo constructor

    public Persona(String nombre, int edad, String id) {
        this.nombre = nombre;
        this.edad = edad;
        this.id = id;
        
    }
    
//Getters
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getId() {
        return id;
    }
    
 //Setters

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Datos de la persona:{" + "nombre= " + nombre + ", edad= " + edad + ", id= " + id + '}';
    }
    
 
}
