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

public class Ej09 {
    public static void main(String[] args) {
        
        //Solicita radio
        String texto;
        texto = JOptionPane.showInputDialog("Introduzca Radio");
        
        //Exigimos que la entrada de datos sea valida
        if (texto!=null){
            if (texto.equals("")){ //Sustituye entrada vacia por 0
                texto="0";
            }
            //Convierte Radio a decimal
            double radio = Double.parseDouble(texto);
            if (radio<0){
                JOptionPane.showMessageDialog(null, "El radio no puede ser negativo");
                System.exit(0);
            }
            //Solicita hipotenusa
            texto = JOptionPane.showInputDialog("Introduzca Hipotenusa");
            
            //Exigimos que la entrada de datos sea valida
            if (texto!=null){
                if (texto.equals("")){
                    texto="0";
                }
                //Convierte Hipotenusa a decimal
                double hipotenusa = Double.parseDouble(texto);
                if (hipotenusa<radio){
                    JOptionPane.showMessageDialog(null,
                            "La hipotenusa no puede ser menor que el radio.");
                    System.exit(0);
                }
                
                //Imprime en ventana el Area
                JOptionPane.showMessageDialog(null,String.format(
                        "El área de la figura es de %.3f unidades cuadradas.", 
                        3.1416*Math.pow(radio,2)/2+
                        radio*Math.sqrt(Math.pow(hipotenusa,2)-Math.pow(radio, 2))/2));
            }
        }
    }
    
}
