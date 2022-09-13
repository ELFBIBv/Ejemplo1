/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg12._factorial_de_un_numero;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class _factorial_de_un_numero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //varibles
        Scanner sc = new Scanner(System.in);
        double n= sc.nextDouble();
        double c=1;
        
        //si el numero es mayor a 1
        if (n>=1) {
        do {
            
            c=n*c;
            n=n-1;
        } while (n>1);
        }
        //si el numero es 0
        if(n==0) {
            c=1;
        } 
        if(n<0){
            System.out.println("valor no existente");
            return;
        }
        System.out.println(c);
    }   
}