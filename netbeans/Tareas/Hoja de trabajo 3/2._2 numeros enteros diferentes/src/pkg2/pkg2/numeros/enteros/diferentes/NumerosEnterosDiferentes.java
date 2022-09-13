/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2.pkg2.numeros.enteros.diferentes;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class NumerosEnterosDiferentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("escribir primera cantidad");
        int n1 = sc.nextInt();
        System.out.println("escribir segunda cantidad");
        int n2 = sc.nextInt();
        
        if (n1>n2) {
            System.out.println(n1+" es mayor que "+n2);
          }     else if(n2>n1) {
            System.out.println(n2+" es mayor que "+n1);
          }     else {
            System.out.println(" ");
            System.out.println("ERROR");
            System.out.println(" ");
            System.out.println("los numeros son iguales");
        }
        
    }
    
}
