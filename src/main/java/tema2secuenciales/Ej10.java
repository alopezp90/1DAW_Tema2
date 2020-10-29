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
import javax.swing.JOptionPane;

public class Ej10 {
    public static void main(String[] args) {
        
        //Declaramos las variables
        double x1=0,x2=0,y1=0,y2=0;
        double dx, dy;
        String texto; 
        
        //Solicita primera coordenada
        texto = JOptionPane.showInputDialog("Introduzca primera coordenada. Tipo(±12.34,±56.78)");
        
        //Exigimos que la entrada de datos sea valida
        if (texto!=null){ 
            //Divide el texto por la coma y sustituye texto en blanco por 0,0
            if (texto.equals("")){
                texto = "0,0";
            }
            //Quita parentesis y posibles espacios
            texto=texto.replace("(","");
            texto=texto.replace(")","");
            texto=texto.replace(" ", "");
            
            String[] parte = texto.split(",");

            //Guarda la primera coordenada como decimal
            x1 = Double.parseDouble(parte[0]);
            y1 = Double.parseDouble(parte[1]); 
                
        } else {    //Cierra al pulsar cancel o x en la ventana 
            System.exit(0);
        }   
        //Solicita segunda coordenada
        texto = JOptionPane.showInputDialog("Introduzca segunda coordenada. Tipo (±12.34,±56.78)");
        
        //Exigimos que la entrada de datos sea valida
        if (texto!=null){ 
            //Divide el texto por la coma y sustituye texto en blanco por 0,0
            if (texto.equals("")){
                texto = "0,0";
            }
            //Quita parentesis y posibles espacios
            texto=texto.replace("(","");
            texto=texto.replace(")","");
            texto=texto.replace(" ", "");
            
            String[] parte = texto.split(",");                

            //Guarda la primera coordenada como decimal
            x2 = Double.parseDouble(parte[0]);
            y2 = Double.parseDouble(parte[1]);              
                
        } else {    //Cierra al pulsar cancel o x en la ventana 
            System.exit(0);
        }        
        //Calcula distancia entre los puntos
        dx=x1-x2;
        dy=y1-y2;
       
        //Imprime en ventana el resultado
        JOptionPane.showMessageDialog(null,String.format(
                "La distancia entre las coordenadas es de %.3f unidades.", 
                Math.sqrt(Math.pow(dx,2)+Math.pow(dy,2))));
               
    }
    
}
