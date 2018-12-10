/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroprimo;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumnos
 */
public class NumeroPrimo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto = JOptionPane.showInputDialog("Escribe el numero:");
        int numero = Integer.parseInt(texto);
        boolean primo = false;
        if (esPrimo(numero)) {
            System.out.println("El numero " + numero + " es primo");
        } else {
            System.out.println("El numero " + numero + " no es primo");
        }
    }

    public static boolean esPrimo(int numero) {
        //numero menor o igual que uno no es primo
        if (numero <= 1) {
            return false;
        }
        // contabiliza las veces que es divisibel, si es mas de una vez quiere decir que no es primo
        int cont = 0;
        for (int divisor = (int) Math.sqrt(numero); divisor > 1; divisor--) {
            if (numero % divisor == 0) {
                cont += 1;
            }
           
        }
         if (cont >= 1) {
                return false;
            } else {
                return true;
            }
    }

}
