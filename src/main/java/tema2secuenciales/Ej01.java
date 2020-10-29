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

public class Ej01 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
                           
        //solicitamos cantidad por pantalla
        System.out.println("Introduzca cantidad a convertir: ");
        double cantidad = sc.nextDouble();
       
        //realizamos conversion e imprimimos en pantalla redondeando a 2 decimales               
        System.out.println(String.format("%.2f € son %.2f coronas suecas.", cantidad, cantidad*10.39));
        System.out.println(String.format("%.2f coronas suecas son %.2f €.", cantidad, cantidad/10.39));
    }
    
}
