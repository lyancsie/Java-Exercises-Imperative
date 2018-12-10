/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dadoampliado;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class DadoAmpliado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el numero de caras que quieres que tenga el dado:");
        int cara = sc.nextInt();
        int[] dado = new int[cara];
        int suma = 0;
        
        for (int i = 0; i < dado.length; i++) {
            dado[i] = (int) (Math.random() * 6) + 1;
            suma += dado[i];
        }
        
        System.out.println("Dado: "+Arrays.toString(dado));
        System.out.println("La suma de sus lados es: "+suma);
    }
    
}
