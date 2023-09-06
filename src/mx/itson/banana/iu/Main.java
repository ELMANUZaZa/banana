/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mx.itson.banana.iu;

import java.util.Scanner;

/**
 *
 * @author manub
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         System.out.println("Ingrese los datos alumnos: ");
        
        Scanner entrada = new Scanner(System.in);
        String oracion = entrada.nextLine();
        
        String [] alumnos = oracion.split(",");
        
        for(String a : alumnos){
            String [] alumno = a.split(" ");
            String id = alumno[0];
           String Primer_nombre = alumno[3];
           String Primer_apellido = alumno[1];
           
            System.out.println("ID: "+id+" -"+Primer_nombre+" "+Primer_apellido);
           
           
           
        }
    }
    
}
