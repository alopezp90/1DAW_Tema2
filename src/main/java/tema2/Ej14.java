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
import java.util.Scanner;

public class Ej14 {
    public static void main(String[] args) {
        
        System.out.println("Introduce cantidad de segundos:");
        
        //lectura de datos por teclado mediante Scanner
        Scanner sc = new Scanner(System.in);
        int tiempo = sc.nextInt();
        
        System.out.println("Son: "+tiempo/3600+" horas, "
                +(tiempo%3600)/60+" minutos y "
                +(tiempo%3600)%60+" segundos.");
    }
}
