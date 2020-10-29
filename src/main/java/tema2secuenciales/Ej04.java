/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2secuenciales;

/**
 *
 * @author alberto
 */
import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        
        //Definimosvariables y la constante
        Scanner sc = new Scanner(System.in);
        
        final double FIJO=150.34;
        double var=0.15;
        
        //Realizamos la entrada de datos
        System.out.println("Introduzca distancia en kilómetros:");
        double km = sc.nextDouble();
        
        //Imprimimos el calculo
        System.out.println(String.format("El precio del viaje serían %.2f €.", FIJO+km*var));
       
        
        
    }
    
}
