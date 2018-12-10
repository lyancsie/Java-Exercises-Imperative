/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinadispensadora;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class MaquinaDispensadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        float precio = 0, total = 0;
        String producto = null;
        float dinero;
        boolean permiso = false;
        int arreglo[][] = new int[2][2];

        arreglo[0][0] = (int) 1;
        arreglo[0][1] = (int) 2;
        arreglo[1][0] = (int) 3;
        arreglo[1][1] = (int) 4;

        String mostrar[][] = new String[2][2];

        mostrar[0][0] = (String) "--1.Agua--";
        mostrar[0][1] = (String) "--2.Coca Cola--";
        mostrar[1][0] = (String) "--3.Sprite--";
        mostrar[1][1] = (String) "--4.Cerveza--";

        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();
        System.out.println("----MAQUINA DISPENSADORA-----");

        //Mostramos el arreglo
        for (int n = 0; n < mostrar.length; n++) //Columnas
        {
            for (int i = 0; i < mostrar[0].length; i++) //Filas
            {
                System.out.print("[" + mostrar[n][i] + "]");
            }
            System.out.println();
        }

        for (int i = 0; i < 29; i++) {
            System.out.print("-");
        }
        System.out.println();

        System.out.println("Que opcion vas a meter?");
        int opc = sc.nextInt();

        for (int n = 0; n < arreglo.length; n++) //Columnas
        {
            for (int i = 0; i < arreglo[0].length; i++) //Filas
            {
                if (opc == arreglo[n][i]) {
                    int escogencia = arreglo[n][i];
                    switch (escogencia) {
                        case 1:
                            producto = "Agua";
                            precio = (float) 0.50;
                            System.out.println("El valor del producto es: " + precio);
                            System.out.println("Cuanto dinero vas a meter?");
                            dinero = sc.nextFloat();
                            if (dinero > precio) {
                                total = dinero - precio;
                                permiso = true;
                            } else {
                                permiso = false;
                            }
                            break;
                        case 2:
                            producto = "Coca Cola";
                            precio = (float) 1.25;
                            System.out.println("El valor del producto es: " + precio);
                            System.out.println("Cuanto dinero vas a meter?");
                            dinero = sc.nextFloat();
                            if (dinero > precio) {
                                total = dinero - precio;
                                permiso = true;
                            } else {
                                permiso = false;
                            }
                            break;
                        case 3:
                            producto = "Sprite";
                            precio = (float) 1.50;
                            System.out.println("El valor del producto es: " + precio);
                            System.out.println("Cuanto dinero vas a meter?");
                            dinero = sc.nextFloat();
                            if (dinero > precio) {
                                total = dinero - precio;
                                permiso = true;
                            } else {
                                permiso = false;
                            }
                            break;
                        case 4:
                            producto = "Cerveza";
                            precio = (float) 1.75;
                            System.out.println("El valor del producto es: " + precio);
                            System.out.println("Cuanto dinero vas a meter?");
                            dinero = sc.nextFloat();
                            if (dinero > precio) {
                                total = dinero - precio;
                                permiso = true;
                            } else {
                                permiso = false;
                            }
                            break;
                    }
                }
            }
        }
        if (permiso == true) {
            System.out.println("El producto escogido fue " + producto + " el precio a pagar fue " + precio + " el cambio " + total);
        } else {
            System.out.println("El dinero no te alcanza para comprar este producto");
        }
    }
}

