/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortilla;

import java.util.Scanner;

/**
 *
 * @author Miguel
 */
public class Tortilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe cuanto huevos vas agregar:");
        int huevos = sc.nextInt();
        System.out.println("Escribe cuanto huevos vas agregar:");
        int patatas = sc.nextInt();

        if (huevos == 6 && patatas == 3) {
            System.out.println("Porcion perfecta para una buena tortilla.");
        } else if ((huevos != 6 && huevos < 6) && patatas == 3) {
            System.out.println("Porcion casi perfecta, le falta huevo");
        }else if ( huevos == 6 && (patatas != 3 && patatas <3)){
            System.out.println("Porcion casi perfecta, le falta patatas");
        }else if ( huevos == 6 && (patatas != 3 && patatas >3) ){
            System.out.println("Colocaste muchas patatas");
        }else if ( (huevos != 6 && huevos>6) && patatas == 3){
            System.out.println("Colocaste mucho huevo");
        }else{
            System.out.println("Porcion de huevo y de patata inexactas,esa tortilla no va estar rica");}
        }

    }
