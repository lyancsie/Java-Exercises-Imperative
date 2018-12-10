/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayumin;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class MayuMin {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] palabra = pedirPalabra();
        String palabraConvertida = convertir(palabra);
    }
    
    static public String[] pedirPalabra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe una palabra");
        String palabraU = sc.next();
        String[] palabra = palabraU.split("");
        return palabra;
    }
    
    static public String convertir( String[] palabra){
        for (int i = 0; i < palabra.length; i++) {
            
        }
        System.out.println(Arrays.toString(palabra));
        return "";
    }
    
    

}
