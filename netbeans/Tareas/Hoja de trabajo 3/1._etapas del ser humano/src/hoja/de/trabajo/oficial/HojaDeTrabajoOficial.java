/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hoja.de.trabajo.oficial;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class HojaDeTrabajoOficial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("ingrese un numero del 1 al 5");
int numero = sc.nextInt();

switch(numero) {
    case 1:
        System.out.println("la persona es un bebe");
        break;
    case 2:
        System.out.println("la persona es un niño");
        break;
    case 3:
        System.out.println("la persona es un adolecente");
        break;
    case 4:
        System.out.println("la persona es un adulto");
        break;
    case 5:
        System.out.println("la persona es un adulto mayor");
        break;
    default:
            System.out.println("la cantidad "+numero+" es invalida");
    }
}
}