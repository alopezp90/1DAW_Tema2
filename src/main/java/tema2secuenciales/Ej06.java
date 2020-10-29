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

public class Ej06 {
    public static void main(String[] args) {
        
        //Definimos constantes
        final double SERV=0.4, ALI=0.35, LAV=0.25;
        
        //Bucle para que la ventana inicial sea persistente
        while (true){
            
            //Ventana de entrada para presupuesto
            String texto;
            texto = JOptionPane.showInputDialog("Introduzca presupuesto",null);
            
            
            //Exigimos que la entrada de datos sea valida
            if (texto != null){
                
                //Sustituye entradas en blanco por 0
                if (texto.equals("")){
                    texto="0";
                }
                
                //Convierte a numero y permite comas
                double presupuesto = Double.parseDouble(texto.replace(",","."));
                
                //Si es positivo, calcula reparto
                if (presupuesto>=0){
                    JOptionPane.showMessageDialog(null,String.format(
                            "Servicio de habitaciones %.2f €, Alimentación y Bebidas %.2f € y Lavandería %.2f €",
                            presupuesto*SERV, presupuesto*ALI, presupuesto*LAV));
             
                 } else {      //Si es menor que cero, presenta error
                    JOptionPane.showMessageDialog(null, 
                            "ERROR. El presupuesto introducido es negativo");
                }
                
                //Ventana de eleccion para repetir o salir
                int seleccion = JOptionPane.showOptionDialog(null,
                        "¿Desea probar otro valor?", "Elige",
                        JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,
                        null, new Object[]{"Otra vez","Salir"}, null);
                
                //Si la eleccion NO es repetir, sale del bucle
                if (seleccion!=0){
                    break;
                }
                
            } else {    //Si la entrada en la primera ventana es cerrar o cancelar, sale del bucle
                break;
            }
        }
    }
}
