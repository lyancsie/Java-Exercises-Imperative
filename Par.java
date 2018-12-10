/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package par;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Par {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe un numero:");
        int numero = sc.nextInt();
        
        if (numero % 2 == 0) {
            System.out.println("El numero es par");
        }else{
            System.out.println("El numero es impar");
        }
    }
    
}
