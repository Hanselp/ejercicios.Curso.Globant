
package pooej01;

import Entidad.Persona;
import PersonaService.PersonaService;


public class POOEj01 {
    public static void main(String[] args) {
        
        PersonaService muestra = new PersonaService();
        
        Persona primeraPersona = new Persona("Hansel", 31, "1098729736");
        Persona segundaPersona = new Persona("Tatiana", 28, "1098766695");
        Persona terceraPersona = new Persona("Juana", 9, "109800029");
        
        muestra.mostrarPersona(primeraPersona);
        System.out.println();
        muestra.mostrarPersona(segundaPersona);
        
    
        //System.out.println(segundaPersona.nombre + " " + primeraPersona.getEdad());
    }
                   
}
