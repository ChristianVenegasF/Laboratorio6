
package idat.laboratorio06.Encapsulamiento;


public class PruebaPerson {
    
    public static void main(String[] args) {
        
    
    Person persona = new Person("Juan Carlos");
   // persona.name = "Su nombre Modificado: ";
    System.out.println(persona);
    persona.setName("Nombre Modificado: ");
    System.out.println(persona);
}
}
