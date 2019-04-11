/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioclase;

import java.util.Scanner;

/**
 *
 * @author DAVID
 */
public class MiEjercicio {
    public static void main(String[] args) {
        String nombre;
        String apellido;
        int edad;
        String cuidad;
        String pais;
        int nota1;
        int nota2;
        int promedio;
    
        Scanner entrada = new Scanner(System.in);
    
        System.out.println("Por favor Ingrese sus Nombres:");
        nombre = entrada.nextLine();
    
        System.out.println("Por favor Ingrese sus Apellidos:");
        apellido = entrada.nextLine();
        
        System.out.println("Por favor Ingrese su edad:");
        edad = entrada.nextInt();
        
        entrada.nextLine(); // limpieza de buffer de entrada de datos
        
        System.out.println("Por favor Ingrese su Cuidad:");
        cuidad = entrada.nextLine();
        
        System.out.println("Por favor Ingrese su Pais:");
        pais = entrada.nextLine();
        
        System.out.println("Calcular el promedio");
        System.out.println("Ingrese Nota 1: ");
        nota1 = entrada.nextInt();
        
        System.out.println("Ingrese Nota 2: ");
        nota2 = entrada.nextInt();
        
        promedio = nota1+nota2;
        promedio = promedio/2;
        
        System.out.println("\nSu nombres y apellidos: "+nombre+" "+apellido+ 
                "\nEdad: "+edad+ "\nCuidad: "+cuidad+ "\nPais: "+pais+
                "\nNotas: "+nota1+", "+nota2+"\nPromedio: "+promedio);
    }
}
