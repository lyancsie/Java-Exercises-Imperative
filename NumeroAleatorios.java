/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroaleatorios;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumnos
 */
public class NumeroAleatorios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String texto = JOptionPane.showInputDialog("Introduce el limite:");
        int limite = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog("Introduce el numero uno:");
        int numeroUno = Integer.parseInt(texto);
        texto = JOptionPane.showInputDialog("Introduce el segundo numero");
        int numeroDos = Integer.parseInt(texto);
        for (int i = 0; i < limite; i++) {
            System.out.print("["+generaNumero(numeroUno,numeroDos)+"]");
        }
    }
    public static int generaNumero(int numeroUno,int numeroDos){
        return ((int)Math.floor(Math.random()*(numeroDos-numeroUno)+numeroUno)) ;
    }
}
