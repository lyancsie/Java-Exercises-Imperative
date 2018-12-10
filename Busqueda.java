/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busqueda;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Alumnos
 */
public class Busqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] oracion = llenarArray();
        String palabra = escribirPalabra();
        int palabraFinal = busquedaPalabra(oracion, palabra);
        if (palabraFinal != -1) {
            System.out.println("La Posicion de la palabra es: "+ (palabraFinal+1));
        }else{
            System.out.println("La posicion de la palabra no se encuentra en la oracion");
        }
    }

    public static String[] llenarArray() {
        String texto = JOptionPane.showInputDialog("Escribe los nombres (separados por (,)");
        String oracion = String.valueOf(texto).toLowerCase();
        String[] vect = oracion.split(" ");
        return vect;
    }

    public static String escribirPalabra() {
        String texto = JOptionPane.showInputDialog("Escriba la palabra:");
        String palabra = String.valueOf(texto);
        return palabra;
    }

    public static int busquedaPalabra(String[] oracion, String palabra) {
        int position = -1;
        int oracionTotal = oracion.length;
        for (int i = 0; i < oracionTotal; i++) {
            if (oracion[i].equals(palabra)) {
                position = i;
            }
        }
        return position;
    }

}
