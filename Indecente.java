/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indecente;

import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Indecente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nombre:");
        String nombre = sc.nextLine();
        System.out.println("Escribe tu edad:");
        int edad = sc.nextInt();

        if (edad > 3 && edad <= 100) {
            if (edad > 3 && edad <= 10) {
                System.out.println(nombre + " no sabes que es vivir aun peque");
            } else if (edad > 10 && edad <= 20) {
                System.out.println(nombre + " vive tu juventud, no te comprometas");
            } else if (edad > 20 && edad <= 40) {
                System.out.println(nombre + " como se llama tu empresa, ya es hora de hacer algo levantate del sofa");
            } else if (edad > 40 && edad <= 60) {
                System.out.println(nombre + " ya tienes edad para hacer alguna actividad extrema");
            } else if (edad > 60 && edad <= 100) {
                System.out.println(nombre + " disfruta tu ultimos respiros");
            }
        } else {
            System.out.println("No es una edad valida");
        }
    }

}
