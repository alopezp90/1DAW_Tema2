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

public class Ej07 {
    public static void main(String[] args) {
        
        //Solicitamos numero de trabajadores
        String texto;
        texto = JOptionPane.showInputDialog(null,"Introduzca número de trabajadores");
        
        //Exigimos que la entrada de datos sea valida
        if (texto!=null){
            //Si la entrada esta vacia ponemos 0
            if (texto.equals("")){
                texto = "0";
            }
            //Convertimos la entrada a numero entero
            int trabajadores = Integer.parseInt(texto);
            
            //Solicitamos numero de mascarillas
            if (trabajadores>=0){
                texto = JOptionPane.showInputDialog(null,"Introduzca número de mascarillas");
                
                //Exigimos que la entrada de datos sea valida
                if (texto!=null){
                    //Si la entrada esta vacia ponemos 0
                    if (texto.equals("")){
                    texto = "0";
                }
                //Convertimos la entrada a numero entero
                int mascarillas = Integer.parseInt(texto);
                
                //Realizamos el reparto de mascarillas si es positiva
                if (mascarillas>=0){
                    JOptionPane.showMessageDialog(null,
                            "Hay "+mascarillas/trabajadores+" mascarillas para cada trabajador y "
                            +mascarillas%trabajadores+" sobrantes.");                
                
                } else { //Si la entrada de datos de mascarillas es negativa, error
                    JOptionPane.showMessageDialog(null,"Número de mascarillas no válido.");
                    System.exit(0);
                }           

                } else { //Si la entrada de datos de mascarilas es nula (cerramos o cancelamos)
                    System.exit(0);
                }
            } else { //Si la entrada de datos de trabajadores es negativa
                JOptionPane.showMessageDialog(null,"Número de trabadores no válido.");
            }           
        }
    }  
}
