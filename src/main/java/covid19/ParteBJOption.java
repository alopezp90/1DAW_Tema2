/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package covid19;

/**
 *
 * @author albertolopez
 */
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class ParteBJOption {
    public static void main(String[] args) {
        
        //Declaracion de variables y definicion de constantes
        int contagio=0, habitante=0;    //Las inicializamos a cero para usarlas con un if luego
        double tasa;
        final double AUX=100000;
        DecimalFormat tasaf = new DecimalFormat("####.###"); //para limitar decimales
        String texto; //para la entrada de JOptionPane
        
        //Solicitamos el primer dato mediante ventana
        texto = JOptionPane.showInputDialog("Introduzca número de PCR positivo "
                + "de los últimos 14 días:");
        
        if (texto!=null) {  //Esta condicion solo esta para evitar que salga un error
                            //si pulsamos 'cancelar' o cerramos la ventana de datos
            
            //Convertimos a entero la entrada de texto
            contagio = Integer.parseInt(texto);
        } else {
            System.exit(0);
        }
        //Solicitamos el segundo dato mediante ventana
        texto = JOptionPane.showInputDialog("Introduzca la población de la "
                + "localidad:");
        
        if (texto!=null) {  //Esta condicion solo esta para evitar que salga un error
                            //si pulsamos 'cancelar' o cerramos la ventana de datos
                
            //Convertimos a entero la entrada de texto
            habitante = Integer.parseInt(texto);
        } else {
            System.exit(0);
        }
        //Realizamos el calculo
        tasa=AUX*contagio/habitante;
        
        //Imprimimos en una ventana el resultado
        JOptionPane.showMessageDialog(null, "La tasa de contagios durante los "
                + "últimos 14 días fue de "+(tasaf.format(tasa))+" habitantes "
                + "por cada cien mil.");
        
        if (tasa>=500){
            JOptionPane.showMessageDialog(null,"La población debe estar "
                    + "confinada perimetralmente");
        } else {
            JOptionPane.showMessageDialog(null,"No es necesario confinar");
        }
    }
}
