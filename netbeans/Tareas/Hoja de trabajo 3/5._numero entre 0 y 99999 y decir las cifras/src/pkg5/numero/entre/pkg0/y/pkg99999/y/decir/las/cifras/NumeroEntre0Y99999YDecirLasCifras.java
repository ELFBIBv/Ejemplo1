/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg5.numero.entre.pkg0.y.pkg99999.y.decir.las.cifras;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class NumeroEntre0Y99999YDecirLasCifras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        System.out.println("ingresar la cantidad");
    int numero= sc.nextInt();

        if (numero<10 && numero>=0) {
            System.out.println("una cifra");
        } else if(numero<100 && numero>=0){
            System.out.println("dos cifras");
        } else if(numero<1000 && numero>=0){
            System.out.println("tres cifras");
        } else if(numero<10000 && numero>=0){
            System.out.println("cuatro cifras");
        } else if (numero<100000 && numero>=0){
            System.out.println("cinco cifras");
        } else{
            System.out.println("numero fuera del rango");}
        }
            
}
