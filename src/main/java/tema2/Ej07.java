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
public class Ej07 {
    public static void main(String[] args) {
        
        //Declaramos e inicializamos las variables int
        int a=1, b=2, c=3;        
        double d=4.5, e=5.7, f=6.9;
        
        //Imprimimos por pantalla las variables
        System.out.println("Los enteros son: "+a+", "+b+" y "+c);
        System.out.println("Los 'double' son: "+d+", "+e+" y "+f);
        
        //Realizamos los intercambios usando un int auxiliar 'z'
        int z = c;
        c = a; a = b; b = z;
        
        //Imprimimos por pantalla los nuevos valores
        System.out.println("Los valores intercambiados son:");
        System.out.println("a: "+a+", b: "+b+" y c: "+c);
        
        //Realizamos los intercambios usando un double auxiliar'y'
        double y = e;
        e = f; f = d; d = y;
        
        //Imprimimos por pantalla los nuevos valores
        System.out.println("d: "+d+", e: "+e+" y f: "+f);
                
        
        
    }
    
}
