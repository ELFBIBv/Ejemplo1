/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dos_numeros_enteros;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class Dos_numeros_enteros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    Scanner b= new Scanner(System.in);
        System.out.println("escribir primer cantidad");
    double numero1=a.nextDouble();
        System.out.println("escribir segunda cantidad");
    double numero2=b.nextDouble();
        System.out.println("la cantidad mas grande es");
        if (numero1>numero2) {
            System.out.println(numero1);
        
        } else if (numero2>numero1){
            System.out.println(numero2);
        } else if (numero1==numero2){
            System.out.println("no hay numero mayor");
        }
        else System.out.println("valor innexistente");
    }
}
