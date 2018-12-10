/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cita;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Cita {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int suma = 0, persona1 = 0, persona2 = 0;
        String usuario1 = null, usuario2 = null;
        int[] aficiones = new int[5];
        int respuesta;

        for (int j = 1; j <= 2; j++) {

            System.out.println("Escribe tu nombre:");
            String nombre = sc.next();

            for (int i = 0; i < aficiones.length; i++) {
                int opc = i;
                switch (i) {
                    case 0:
                        System.out.println("---Genero de pelicula favorita---");
                        System.out.println("1.Animacion");
                        System.out.println("2.Terror");
                        System.out.println("3.Romantica");
                        System.out.println("4.Suspenso");
                        System.out.println("5.Accion");
                        System.out.println("Escribe una opcion:");
                        respuesta = sc.nextInt();
                        aficiones[i] = respuesta;
                        break;
                    case 1:
                        System.out.println("---Mascota---");
                        System.out.println("1.Gato");
                        System.out.println("2.Perro");
                        System.out.println("Escribe una opcion:");
                        respuesta = sc.nextInt();
                        aficiones[i] = respuesta;
                        break;
                    case 2:
                        System.out.println("---Hijos---");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        System.out.println("Escribe una opcion:");
                        respuesta = sc.nextInt();
                        aficiones[i] = respuesta;
                        break;
                    case 3:
                        System.out.println("---Deporte Favorito---");
                        System.out.println("1.Football");
                        System.out.println("2.Voleyball");
                        System.out.println("3.Basketball");
                        System.out.println("4.Golf");
                        System.out.println("Escribe una opcion:");
                        respuesta = sc.nextInt();
                        aficiones[i] = respuesta;
                        break;
                    case 4:
                        System.out.println("---Tatuajes---");
                        System.out.println("1.Si");
                        System.out.println("2.No");
                        System.out.println("Escribe una opcion:");
                        respuesta = sc.nextInt();
                        aficiones[i] = respuesta;
                        break;
                }
                suma = suma + aficiones[i];
            }

            if (j == 1) {
                usuario1 = nombre;
                persona1 = suma;
            } else {
                usuario2 = nombre;
                persona2 = suma;
            }
            suma = 0;

        }

        if (persona1 == persona2) {
            System.out.println(usuario1 + " y " + usuario2 + " tienen mucho en comun");
        } else {
            System.out.println(usuario1 + " y " + usuario2 + " lo lamento no tienen mucho en comun");
        }
    }

}
