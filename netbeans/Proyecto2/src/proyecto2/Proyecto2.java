/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto2;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class Proyecto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double piernas=15.0*2;
        double huevos=7.50*3;
        double mascota=150.00*1;
        double collar=10.00*1;
    double suma=piernas+huevos+mascota+collar;
        System.out.println(suma);
    double billetes = Math.floor(suma/20);
    System.out.println("billetes = "+ billetes);
    double extra=((suma/20)-billetes)*20;
    System.out.println("con = "+ extra +" monedas");
    }
    
}
