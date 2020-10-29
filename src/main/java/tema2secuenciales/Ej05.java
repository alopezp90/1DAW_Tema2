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

public class Ej05 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        //Creamos variables y constante
        int grupos, horas, profesores;
        final int HSEMANA = 30;
        
        //Imprimimos mensaje para entrada de datos por scanner
        System.out.println("Introduzca número de grupos y de horas por profesor:");
        grupos=sc.nextInt();
        horas=sc.nextInt();
        
        if ((grupos*30)%horas==0) {     //Si es exacto hace la division
            profesores=grupos*HSEMANA/horas;                    
        } else {                        //Si no es exacto, suma un profesor mas
            profesores=1+grupos*HSEMANA/horas;
        }
        
        //Imprime el resultado
        System.out.println("El número de profesores necesarios es "+profesores);        
    }
    
}
