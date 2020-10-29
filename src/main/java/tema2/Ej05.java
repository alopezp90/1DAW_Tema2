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
public class Ej05 {
    public static void main(String[] args) {
        
        //Variables número entero
        byte entero1;
        int entero2;
        short entero3;
        long entero4;
        
        //Veriables número decimal
        float decimal1;
        double decimal2;
        
        //Variable logica
        boolean logico;
        
        //Variable caracter
        char caracter;
        
        //Declaracion de constantes con el prefijo final
        final double constante1=3.14159;
        final int constante2=5;
        
        //Declaracion de un objeto de tipo String
        String texto1 ="Hola mundo";
        
        //Inicializamos variables
        entero1 = 10;
        entero2 = -670;
        entero3 = -8740;
        entero4 = 8273273;
        
        decimal1 = (float)4.54;
        decimal2 = 0.000000077854;
        
        logico = true;
        
        caracter = 97;
        
        
       //Imprimimos por pantalla todas las variables y constantes y la memoria que usan
       
        System.out.println(entero1+" es byte y ocupa 8 bits");
        System.out.println(entero2+" es int y ocupa 32 bits");
        System.out.println(entero3+" es short y ocupa 16 bits");
        System.out.println(entero4+" es long y ocupa 64 bits");
        
        System.out.println(decimal1+" es float y ocupa 32 bits");
        System.out.println(decimal2+" es double y ocupa 64 bits");
        
        System.out.println(logico+" es boolean y ocupa 1 bit");
        
        System.out.println(caracter+" es char y ocupa 16 bits");
        
        System.out.println(constante1+" es constante float");
        System.out.println(constante2+" es constante double");
        
        System.out.println("'"+texto1+"'"+" es un objeto tipo String");
        
    }
    
}
