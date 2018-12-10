/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mayorarray;

import java.util.Arrays;

/**
 *
 * @author Alumnos
 */
public class MayorArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array ={9,2,8,4,10};
        int mayor = calcularMayor(array);
        System.out.println("El mayor de los numero en el array :"+ Arrays.toString(array) + " es "+mayor);
    }
    
    public static int calcularMayor(int[] array){
        int mayor =array[0];
        for (int i = 0; i < array.length; i++) {
            if (mayor<=array[i]) {
                mayor =array[i];
            }
            
        }
        return mayor;
        
    }
    
}
