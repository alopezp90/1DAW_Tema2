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

public class Ej02 {
    public static void main(String[] args) {
        
        //Definimos las variables
        Scanner sc = new Scanner(System.in);
        
        int lado, altura;
        
        //Realizamos la entrada de datos
        System.out.println("Introduzca lado de la base (cm):");
        lado=sc.nextInt();
        
        System.out.println("Introduzca altura de la pirámide (cm):");
        altura=sc.nextInt();
        
        //Imprimimos el resultado de calcular el volumen
        System.out.println(String.format("El aljibe tiene una capacidad de %.0f litros",
                Math.pow(lado,2)*altura/3000)); 
    }
}