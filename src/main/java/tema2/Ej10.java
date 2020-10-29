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
public class Ej10 {
    public static void main(String[] args) {
        
        //declaramos e inicializamos las variables booleanas
        boolean verdadero=true, falso=false;
        
        //imprimimos en pantalla las tablas de verdad
        System.out.println("verdadero && verdadero: "+(verdadero&&verdadero));
        System.out.println("verdadero && falso: "+(verdadero&&falso));
        System.out.println("falso && falso: "+(falso&&falso));
        System.out.println("verdadero || verdadero: "+(verdadero||verdadero));
        System.out.println("verdadero || falso: "+(verdadero||falso));
        System.out.println("falso || falso: "+(falso||falso));
        
        System.out.println("!verdadero: "+!verdadero);
        System.out.println("!falso: "+!falso);
    }
    
}
