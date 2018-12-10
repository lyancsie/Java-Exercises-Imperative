/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        float suma, resta, multi, div;
        String resp;

        do {
            System.out.println("Escribe una operacion:");
            System.out.println("1.Suma");
            System.out.println("2.Resta");
            System.out.println("3.Multiplicacion");
            System.out.println("4.Division");
            int opc = sc.nextInt();

            System.out.println("Introduzca el primer numero:");
            float valor1 = sc.nextFloat();
            System.out.println("Introduzca el segundo numero:");
            float valor2 = sc.nextFloat();
            switch (opc) {
                case 1:
                    suma = valor1 + valor2;
                    System.out.println("La suma de " + valor1 + " y " + valor2 + " es: " + suma);
                    break;
                case 2:
                    resta = valor1 - valor2;
                    if (resta < 0) {
                        resta *= -1;
                    }
                    System.out.println("La resta de " + valor1 + " y " + valor2 + " es: " + resta);
                    break;
                case 3:
                    multi = valor1 * valor2;
                    System.out.println("La multiplicacion de " + valor1 + " y " + valor2 + " es: " + multi);
                    break;
                case 4:
                    if (valor2 != 0) {
                        div = valor1 / valor2;
                        System.out.println("La division de " + valor1 + " y " + valor2 + " es: " + div);
                    } else {
                        System.out.println("Operacion matematica no posible");
                    }
                    break;

            }
            System.out.println("Quieres hacer otra operacion (si)o(no)?");
            resp = sc.next().toLowerCase();
        } while ("si".equals(resp));
        System.out.println("Feliz dia!");
    }

}
