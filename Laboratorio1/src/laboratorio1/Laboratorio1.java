/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio1;

/**
 *
 * @author Estudiante
 */
public class Laboratorio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        String nombre = "Joel";
        Persona per = new Persona(nombre);
        per.setApellido("Quispe");
        per.setDni("12345678");
        per.setEdad(19);
        
        String nombre2 = "Darwin";
        String apellido = "Hilario";
        String dni = "11112222";
        Persona per2 = new Persona(
                nombre2, apellido, dni);
        
        System.out.println(per.getConsole());
        System.out.println("--------------");
        System.out.println(per2.getConsole());
        
        
    }
    
}
