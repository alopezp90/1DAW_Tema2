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

public class Ej03 {
    public static void main(String[] args) {
        
        //Definimos las variables
        Scanner sc = new Scanner(System.in);
        
        float nota1,nota2,nota3,nota4,nota5;
        
        //Solicita las notas y as guarda como float
        System.out.println("Introduzca 5 notas (0-10) con las que hacer la media.");
        System.out.println("Primera:");        
        nota1=sc.nextFloat();
        
        System.out.println("Segunda:");
        nota2=sc.nextFloat();
        
        System.out.println("Tercera:");
        nota3=sc.nextFloat();
        
        System.out.println("Cuarta:");
        nota4=sc.nextFloat();
        
        System.out.println("Quinta:");
        nota5=sc.nextFloat();
        
        //Calculamos e imprimimos la nota media
        System.out.println(String.format("La nota media es %.2f", 
                (nota1+nota2+nota3+nota4+nota5)/5));             

    }
    
}
