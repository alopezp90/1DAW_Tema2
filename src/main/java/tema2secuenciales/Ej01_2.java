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

public class Ej01_2 {
    public static void main(String[] args) {
        
        //Definimos las variables
        double cantidad, cambio=10.40;
        String texto;
        
        //Bucle para que la ventana de seleccion sea parsistente
        while (true) {
            //Definimos la ventana para elegir las opciones   
            int seleccion = JOptionPane.showOptionDialog(
            null, 
            "Tipo de cambio:", 
            "Elige",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            new Object[] { "€ a Corona", "Corona a €", "cambio","Fin" },null);
            
            //Condicion para salir del bucle si se pulsa cerrar o Fin
            if (seleccion==-1 || seleccion==3){
                break;
            }
                        
            if (seleccion==0){ //cambio €-corona
                
                //Ventana de entrada
                texto = JOptionPane.showInputDialog(null,"Cantidad de Euros:");
                
                if (texto!=null){   //Si la entrada es valida sigue
                    if (texto.equals("")){  //Si la entrada esta vacia pone 0
                        texto="0";
                    }
                    //Convertimos la entrada a numero decimal y permitimos uso de comas
                    cantidad = Double.parseDouble(texto.replace(",","."));
                    
                    //Si es positiva, hace el cambio
                    if (cantidad>=0){
                        JOptionPane.showMessageDialog(null,String.format(
                                "%.2f € son %.2f Coronas suecas",
                                cantidad, cantidad*cambio));
                    } else {    //Si la cantidad es negativa, lanza un error
                        JOptionPane.showMessageDialog(null,"Cantidad no válida");
                    }
                      
                }
            }
            
            if (seleccion==1){  //cambio corona-€
                
                //Ventana de entrada
                texto = JOptionPane.showInputDialog(null,"Cantidad de Coronas suecas:");
                
                if (texto!=null){   //Si la entrada es valida sigue
                    if (texto.equals("")){  //Si la entrada esta vacia pone 0
                        texto="0";
                    }
                    //convertimos la entrada a numero decimal y permitimos uso de comas
                    cantidad = Double.parseDouble(texto.replace(",","."));
                    
                    //Si es positiva,hace el cambio
                    if (cantidad>=0){
                        JOptionPane.showMessageDialog(null,String.format(
                                "%.2f € son %.2f Coronas suecas",
                                cantidad, cantidad/cambio));
                    } else {    //Si la entrada es negativa lanza un error
                        JOptionPane.showMessageDialog(null,"Cantidad no válida");
                    }
                       
                }
            }
            
            if (seleccion==2){  //Si se elige "cambio"
                
                //Ventana de entrada, informa de cambio actual y permite cambiarlo
                texto = JOptionPane.showInputDialog(null,
                        String.format("El cambio esta fijado a %.2f coronas por €, introduce nuevo cambio:",cambio));
                
                if (texto!=null){   //Si la entrada es valida, sigue
                    if (texto.equals("")){  //Si la entrada esta vacía pone valor por defecto
                        texto="10.40";                      
                    }
                    //convierte la entrada a numero decimal y permite el uso de coma
                    cambio = Double.parseDouble(texto.replace(",","."));   
                }           
            }
        }           
    }
}
