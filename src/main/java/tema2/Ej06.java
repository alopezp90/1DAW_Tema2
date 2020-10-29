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
public class Ej06 {
    public static void main(String[] args) {
        
        //Declaramos 2 variables tipo int que seran nuestros números
        //y una tercera variable que nos hará de transición
        
        int a = -543;
        int b = 3487;
        int c;
        
        //Imprimimos por pantalla los números a intercambiar
        System.out.println("Los números que intercambiaremos son: "+a+" y "+b);
        
        //Hacemos el intercambio        
        c=a;a=b;b=c;
        
        //Imprimimor por pantalla los números intercambiados
        System.out.println("Los números intercambiados son: "+a+" y "+b);
        
      
    }
}
