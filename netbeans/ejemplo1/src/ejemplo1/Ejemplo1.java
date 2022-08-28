/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplo1;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class Ejemplo1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo");
        Scanner sc  = new Scanner(System.in);
        int numero1 = sc.nextInt();
        int numero2 =300;
        int suma;
        suma = numero1 + numero2;
        double resultado = Math.sin(suma);
        System.out.println(resultado);
        System.out.println(suma);
    }
    
}
