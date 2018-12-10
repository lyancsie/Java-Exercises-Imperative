/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora2;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Calculadora2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float resultado = 0;
        String operacion = null;
        float numero1 = 0,numero2 =0;
        System.out.println("Indique que operacion quieres hacer:");
        System.out.println("1.suma");
        System.out.println("2.resta");
        System.out.println("3.multiplicacion");
        System.out.println("4.Division");
        System.out.println("5.Factorial");
        System.out.println("6.Media");
        int opc = sc.nextInt();
        switch (opc) {
            case 1:
                numero1 = llenarNumero();
                numero2 = llenarNumero();
                resultado = suma(numero1, numero2);
                operacion = "suma";
                break;
            case 2:
                numero1 = llenarNumero();
                numero2 = llenarNumero();
                resultado = resta(numero1, numero2);
                operacion = "resta";
                break;
            case 3:
                numero1 = llenarNumero();
                numero2 = llenarNumero();
                resultado = multiplicacion(numero1, numero2);
                operacion = "multiplicacion";
                break;
            case 4:
                numero1 = llenarNumero();
                numero2 = llenarNumero();
                resultado = division(numero1, numero2);
                operacion = "division";
                break;
            case 5:
                resultado = factorial();
                operacion = "factorial";
                break;
            case 6:
                resultado = media();
                operacion = "media";
                break;
            default:
                System.out.println("Opcion no valida");
        }

        System.out.println("El resultado de la " + operacion + " es " + resultado);
    }

    public static float llenarNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el numero:");
        float numero = sc.nextFloat();
        return numero;
    }

    public static float resta(float numero1, float numero2) {
        float resultado = numero1 - numero2;
        if (resultado < 0) {
            resultado = resultado * (-1);
        }
        return resultado;
    }

    public static float multiplicacion(float numero1, float numero2) {
        float resultado = numero1 * numero2;
        return resultado;
    }

    public static float division(float numero1, float numero2) {
        float resultado = 0;
        if (numero2 != 0) {
            resultado = numero1 / numero2;

        } else {
            System.out.println("Operacion matematica no posible");
        }
        return resultado;
    }

    public static float suma(float numero1, float numero2) {
        float resultado = numero1 + numero2;
        return resultado;
    }

    public static float factorial() {
        int numero = (int) llenarNumero();
        float resultado = 1;
        for (int i = 1; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static float media() {
        int[] Array = llenarArray();
        int cantidad = Array.length;
        int suma = 0;
        for (int i = 0; i < Array.length; i++) {
            suma += Array[i];
        }
        float resultado = (suma/cantidad);
        return resultado;
    }

    public static int[] llenarArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("cuantos numero va a meter:");
        int cantidad = sc.nextInt();
        int[] array = new int [cantidad];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Indique el numero:");
            array[i]= sc.nextInt();
        }
        return array;
    }

}
