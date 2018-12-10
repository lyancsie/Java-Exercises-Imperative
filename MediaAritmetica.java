/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediaaritmetica;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class MediaAritmetica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float media = 0,suma = 0, cantidad = 0;
        
        for (int i = 1; i <=3; i++) {
            System.out.println("Escribe un numero:");
            int numero = sc.nextInt();
            cantidad = i;
            suma += numero;
        }
        
        media = suma / cantidad;
        
        System.out.println("La media Aritmetica es: "+ media );
        
        
        
    }
    
}
