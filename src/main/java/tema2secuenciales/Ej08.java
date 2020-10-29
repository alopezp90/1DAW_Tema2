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

public class Ej08 {
    public static void main(String[] args) {
        
        //Solicitamos aceleracion del cuerpo
        String texto;
        texto = JOptionPane.showInputDialog(null,"Introduzca la aceleración del cuerpo");
        
        if (texto!=null){ //Solo continua si la entrada es valida,
                          //cerrando o cancelando, acaba
            //Si la entrada esta vacia ponemos 0
            if (texto.equals("")){
                texto = "0";
            }
            //Convertimos la entrada a numero (y sustituimos comas) 
            double aceleracion = Double.parseDouble(texto.replace(",", "."));
            
            //Solicitamos velocidad inicial
            texto = JOptionPane.showInputDialog(null,"Introduzca la velocidad inicial del cuerpo");
            
            if (texto!=null){   //Solo continua si la entrada es valida,
                                //cerrando o cancelando, acaba
                //Si la entrada esta vacia ponemos 0
                if (texto.equals("")){
                texto = "0";                            
                }
                //Convertimos la entrada a numero (y sustituimos comas) 
                double velocidad = Double.parseDouble(texto.replace(",", "."));
                
                //Solicitamos tiempo
                texto = JOptionPane.showInputDialog(null,"Introduzca tiempo");
                
                if (texto!=null){   //Solo continua si la entrada es valida,
                                    //cerrando o cancelando, acaba
                    //Si la entrada esta vacia ponemos 0
                    if (texto.equals("")){
                        texto = "0";
                    }
                    //Convertimos la entrada a numero (y sustituimos comas) 
                    double tiempo = Double.parseDouble(texto.replace(",", "."));
                    //Imprimimos en ventana el resultado
                    JOptionPane.showMessageDialog(null, String.format(
                            "La distancia recorrida serán %.2f unidades.",
                            velocidad*tiempo+aceleracion*Math.pow(tiempo,2)/2));
                }
                
            }

        }
     
    }
    
}
