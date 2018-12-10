/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dado;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Dado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner sc = new Scanner(System.in);
        int numero1 = (int) (Math.random() * 6) + 1;
        int numero2 = (int) (Math.random() * 6) + 1;
        int numero3 = (int) (Math.random() * 6) + 1;
        int numero4 = (int) (Math.random() * 6) + 1;
        int numero5 = (int) (Math.random() * 6) + 1;
        int numero6 = (int) (Math.random() * 6) + 1;
        System.out.println("Escribe el numero de caras:");
        int numero = sc.nextInt();
        switch (numero) {
            case 1:
                System.out.println("Cara 1: " + numero1);
                break;
            case 2:
                System.out.println("Cara 1: " + numero1);
                System.out.println("Cara 2: " + numero2);
                break;
            case 3:
                System.out.println("Cara 1: " + numero1);
                System.out.println("Cara 2: " + numero2);
                System.out.println("Cara 3: " + numero3);
                break;
            case 4:
                System.out.println("Cara 1: " + numero1);
                System.out.println("Cara 2: " + numero2);
                System.out.println("Cara 3: " + numero3);
                System.out.println("Cara 4: " + numero4);
                break;
            case 5:
                System.out.println("Cara 1: " + numero1);
                System.out.println("Cara 2: " + numero2);
                System.out.println("Cara 3: " + numero3);
                System.out.println("Cara 4: " + numero4);
                System.out.println("Cara 5: " + numero5);
                break;
            case 6:
                System.out.println("Cara 1: " + numero1);
                System.out.println("Cara 2: " + numero2);
                System.out.println("Cara 3: " + numero3);
                System.out.println("Cara 4: " + numero4);
                System.out.println("Cara 5: " + numero5);
                System.out.println("Cara 6: " + numero6);
                break;
            default: System.out.println("cara invalida");;
                     break;
        }

    }

}
