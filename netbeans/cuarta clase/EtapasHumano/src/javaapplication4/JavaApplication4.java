/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication4;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class JavaApplication4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //etapas del ser humano;
    Scanner a= new Scanner(System.in);
    int etapa= a.nextInt();
        System.out.println("escribe la etapa");
        switch (etapa) {
            case 1:
                  System.out.println("bebe"); 
                break;
            case 2:
                System.out.println("niño");
                break;
            case 3:
                System.out.println("adolecente");
                break;
            case 4:
                System.out.println("adulto");
                break;
            case 5:
                System.out.println("adulto mayor");
            default:
                System.out.println("no existe la etapa "+etapa);
                break;
        }
    }
    
}
