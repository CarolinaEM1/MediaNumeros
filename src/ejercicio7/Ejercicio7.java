/*
 Pedir números hasta que se introduzca uno negativo y calcular la media.
 */
package ejercicio7;

import javax.swing.JOptionPane;

/**
 *
 * @author Carolina EM
 */
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero, elementos=0, suma=0;
        float media;
        
        numero= Integer.parseInt(JOptionPane.showInputDialog("Digite un número"));
        
        while (numero>=0){
            suma += numero; //suma iterativa
            elementos++; //Aumentamos uno a elementos
            
            numero= Integer.parseInt(JOptionPane.showInputDialog("Digite otro número"));
        }
        if (elementos == 0){
            System.out.println("Error, la división entre 0 no existe");
        }
        else {
            media = (float) suma/elementos;
            System.out.println("La media es: "+media);
        }
               
    }
    
}
