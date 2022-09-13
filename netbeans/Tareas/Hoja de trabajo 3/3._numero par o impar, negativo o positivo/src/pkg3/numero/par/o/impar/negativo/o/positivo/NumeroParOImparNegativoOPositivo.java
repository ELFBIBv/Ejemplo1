/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg3.numero.par.o.impar.negativo.o.positivo;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class NumeroParOImparNegativoOPositivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero entero");
       int a = sc.nextInt();
       
        if (a%2==1 && a>=0) {
            System.out.println("el numero es impar y positivo");
        } else if (a%2==-1 && a<0){
            System.out.println("el numero es impar y negativo");
        } else if (a%2==0 && a>0){
            System.out.println("el numero es par y positivo");
        } if (a%2==0 && a<0) {
            System.out.println("el numero es par y negativo");
        } else {
        }
        
    }
    
}
