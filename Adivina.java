/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adivina;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Adivina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int adivina = (int) (Math.random() * 10) + 1;
        int numero;

        do {
            System.out.println("Escribe un numero:");
            numero = sc.nextInt();
            if (numero != adivina) {
                System.out.println("Siguen intentando");
            }
        } while (numero != adivina);
        
        System.out.println("Felicidades encontraste la clave");
    }

}
