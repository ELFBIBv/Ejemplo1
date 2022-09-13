/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._casino_de_juegos;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class App {

    public static void main(String[] args) {
    //declaracion de variables
    Scanner sc= new Scanner(System.in);
    int a;
    int b;
    int c; 
    int a1;
    int b1;
    int c1;
    int total;
    //valor de losdados
        System.out.println("ingresar la cantidad del primer dado");
    a=sc.nextInt();
        System.out.println("ingresar la cantidad del segundo dado");
    b=sc.nextInt();
        System.out.println("ingresar la cantidad del tercer dado");
    c=sc.nextInt();
    //convertir los dados a un 0 o a un 1 
    a1= a/6;
    b1= b/6;
    c1= c/6;
    //dato que se escaneara en el switch
    total=a1+b1+c1;
    //la magia xd
        if (a>0 && a<=6 && b>0 && b<=6 && c>0 && c<=6) {        
    switch(total){
        case 0 -> System.out.println("pesimo");
        case 1 -> System.out.println("regular");
        case 2 -> System.out.println("Muy bien");
        case 3 -> System.out.println("Excelente");
        default -> System.out.println("datos invalidos");
    }
        } else {
            System.out.println("datos invalidos");
        }
    }
}
