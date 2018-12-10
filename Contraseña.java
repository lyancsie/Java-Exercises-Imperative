/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contraseña;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Contraseña {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        String systemPassword = "clave";
        String userPassword = null;
        int intentos = 5;

        do {
            System.out.println("Escribe su contraseña:");
            userPassword = sc.next();
            if (!userPassword.equals(systemPassword)) {
                intentos--;
            }
        } while ((!userPassword.equals(systemPassword)) && intentos > 0);

        if (intentos == 0) {
            System.out.println("Usuario bloqueado");
        } else {
            System.out.println("Bienvenido al sistema");
        }
    }

}
