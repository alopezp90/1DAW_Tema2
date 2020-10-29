/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author alberto
 */
public class Ej09 {
    public static void main(String[] args) {
        
        //Declaramos e inicializamos las variables
        int a=10, b=20;
        boolean logico1, logico2, logico3, logico4;
        
        logico1= a<b;
        logico2= a>b;
        logico3= a==b;
        logico4= a!=b;
        
        //Imprimimos por pantalla las variables booleanas
        System.out.println("a<b: "+logico1);
        System.out.println("a>b: "+logico2);
        System.out.println("a==b: "+logico3);
        System.out.println("a!=b: "+logico4);
              
        
    }
}
