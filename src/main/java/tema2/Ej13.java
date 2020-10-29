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
public class Ej13 {
    public static void main(String[] args) {
        
        int numero=2;           //faltaba ;
        int cuad=numero*numero; //variable no definida, tilde en numero
        //NUMERO estaba en mayuscula y no se correspondia con la variable numero
        System.out.println("EL CUADRADO DE "+numero+" ES: "+cuad);
    }
}
