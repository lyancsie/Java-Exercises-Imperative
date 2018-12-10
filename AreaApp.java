/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areaapp;

import javax.swing.JOptionPane;

/**
 *
 * @author Alumnos
 */
public class AreaApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto = "";
        double resultado = 0;
        String eleccion = JOptionPane.showInputDialog("Introduce una figura: circulo, triangulo o cuadrado");
        switch (eleccion) {
            case "circulo":
                texto = JOptionPane.showInputDialog("Introduce el valor del radio:");
                int radio = Integer.parseInt(texto);
                resultado = areaCirculo(radio);
                break;
            case "triangulo":
                texto = JOptionPane.showInputDialog("Introduce el valor de la base:");
                int base = Integer.parseInt(texto);
                texto = JOptionPane.showInputDialog("Escribe la altura:");
                int altura =Integer.parseInt(texto);
                resultado = areaTriangulo(base,altura);
                break;
            case "cuadrado":
                texto = JOptionPane.showInputDialog("Introduce el valor del lado:");
                int lado = Integer.parseInt(texto);
                resultado = areaCuadrado(lado);
                break;
            default:
                System.out.println("No has introducido una opcion valida");

        }
        System.out.println("El area del "+eleccion+" es "+resultado);

    }

    public static double areaCirculo(int radio) {
        return Math.pow(radio, 2) * Math.PI;
    }

    private static double areaTriangulo(int base, int altura) {
        return (base * altura)/2;
    }
    private static double areaCuadrado (int lado){
            return lado * lado;
    }

}
