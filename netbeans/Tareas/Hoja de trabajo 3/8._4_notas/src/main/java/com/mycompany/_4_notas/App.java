/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany._4_notas;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author jm543
 */
public class App {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escriba la primera nota");
        int a= sc.nextInt();
        System.out.println("Escriba la segunda nota");
        int b= sc.nextInt();
        System.out.println("Escriba la tercera nota");
        int c= sc.nextInt();
        System.out.println("Escriba la cuarta nota");
        int d= sc.nextInt();
        
        int promedio=(int) (a*0.2+b*0.2+c*0.3+d*0.3);
        System.out.println("por lo tanto el promedio es "+promedio);
        if(promedio>0){
            if (promedio<=60) {
                System.out.println("perdida");       
            } else if(promedio <=70){
            System.out.println("decente");
            } else if(promedio <=80){
                System.out.println("aceptable");
            } else if(promedio <=100){
                System.out.println("excelente");
            }
            }
        else{
            System.out.println("datos invalidos");
        }
        }
        }
