/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

/**
 *
 * @author albertolopez
 */
import java.util.Scanner;

public class ParteAScanner {
    public static void main(String[] args) {
        
        //Declaracion de variables y definicion de constantes
        int contagio, habitante;
        double tasa;
        final int LIMITE=500;
        final double AUX=100000;        
        Scanner sc = new Scanner(System.in);
        
        //Entrada de datos mediante scanner, previa peticion por pantalla
        System.out.println("Introduzca número de PCR positivo de los últimos "
                + "14 días:");
        contagio=sc.nextInt();
        
        System.out.println("Introduzca la población de la localidad:");
        habitante=sc.nextInt();
        
        //Realizamos el calculo
        tasa=AUX*contagio/habitante;
        
        //Imprimimos en pantalla el resultado, limitando los resultados con printf
        System.out.printf("La tasa de contagios durante los últimos 14 dias fue "
                + "de %.3f habitantes por cada cien mil. ",tasa);     
        
        if (tasa>LIMITE){
            System.out.println("La población debe estar confinada perimetralmente.");
        } else {
            System.out.println("No es necesario confinar.");
        }
    }
    
}
