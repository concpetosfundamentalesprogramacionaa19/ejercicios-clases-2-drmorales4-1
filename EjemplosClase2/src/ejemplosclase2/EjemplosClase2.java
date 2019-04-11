/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class EjemplosClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Este metodo es el principal de mi proyecto
        // hay q dejar un espacio para cada comentario
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Por favor Ingrese su Nombres:");
        nombre = entrada.next();
        
        System.out.println("Por favor Ingrese su Apellidos: ");
        apellido = entrada.next();
        
        System.out.println("\nSu nombre: "+nombre+"\n\n\tSu apellido es: "
                +apellido);
        
    }
    
}
