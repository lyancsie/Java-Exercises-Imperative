/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int numero = sc.nextInt();
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
            factorial *= i;
        }
        System.out.println("El factorial es: "+factorial);
    }
    
}
