/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sueldo;
import java.util.Scanner;

/**
 *
 * @author Alumnos
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe el sueldo neto:");
        float sueldoB = sc.nextFloat();
        if (sueldoB >= 0) {
          float retencionSS = calculoSS(sueldoB);
        float porcentajeIRPF = CalculoIRPF(sueldoB);
        float seguridadS = CalculoSueldo(sueldoB,retencionSS);
        float IRPF= CalculoSueldo(sueldoB,porcentajeIRPF);
        System.out.println("Descontado:"+6.4+porcentajeIRPF+"%");
            System.out.println("SS:"+seguridadS);
            System.out.println("IRPF:"+IRPF);
        float sueldoN = (seguridadS+IRPF)-sueldoB;
        System.out.println("Sueldo Total:"+sueldoN/12);  
        }else{
            System.out.println("Sueldo negativo no admitido");
        }
        
    }
    
    public static float CalculoSueldo( float sueldoB, float retencion){
    return sueldoB - retencion;
    }
    
    public static float calculoSS( float sueldoB){
    return (float) (((6.4)*sueldoB)/100);
    }
    
    public static float CalculoIRPF( float sueldoB){
    float calculo = 0;
        if (sueldoB < 12450) {
            calculo = (float) ((sueldoB*19)/100);
        }
        else if(sueldoB>=12450 && sueldoB <= 20000){
        calculo = (float) ((sueldoB*24)/100);
        }
        else if(sueldoB>=20001 && sueldoB <= 35200){
        calculo = (float) ((sueldoB*30)/100);
        }
        else if(sueldoB>=35201 && sueldoB <= 60000){
        calculo = (float) ((sueldoB*37)/100);
        }
        else if(sueldoB>=60001){
        calculo = (float) ((sueldoB*45)/100);
        } 
    return calculo;
    }
    
    
    
    
    
    
    
}
