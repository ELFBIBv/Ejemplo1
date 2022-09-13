/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg4.ordenar.pkg3.numeros.de.mayor.a.menor;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class Ordenar3NumerosDeMayorAMenor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
Scanner sc = new Scanner(System.in);
        System.out.println("ingrese primera cantidad");
double a = sc.nextDouble();
        System.out.println("ingrese segunda cantidad");
double b = sc.nextDouble();
        System.out.println("ingrese tercera cantidad");
double c = sc.nextDouble();
        if (a>b && b>c) {
            System.out.println(a+" "+b+" "+c);
        } else if (a>c && c>b){
            System.out.println(a+" "+c+" "+b);
        } else if(b>a && a>c){
            System.out.println(b+" "+a+" "+c);
        } else if(b>c && c>a){
            System.out.println(b+" "+c+" "+a);
        } else if(c>a && a>b){
            System.out.println(c+" "+a+" "+b);
        } else if(c>b && b>a){
            System.out.println(c+" "+b+" "+a);
        }
        System.out.println("cantidad inexistente");
    }
    
}
