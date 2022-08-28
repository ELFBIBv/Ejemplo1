/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication2;
import java.lang.Math;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner aa = new Scanner(System.in);
        Scanner ab= new Scanner(System.in);
        System.out.println("escribir la primer cantidad");
        int numero1= aa.nextInt();
        System.out.println("escribir la segunda cantidad");
        int numero2= ab.nextInt();
        int suma= numero1+numero2;
        int resta= numero1-numero2;
        int multiplicacion= numero1*numero2;
        int division= numero1/numero2;
        System.out.println("primera operacion, la suma "+suma);
        System.out.println("segunda operacion, la resta "+resta);
        System.out.println("tercera operacion, la multiplicacion "+multiplicacion);
        System.out.println("cuarta operacion, la division "+division);
        //ahora de tipo flotante
        System.out.println(" ");
        System.out.println("ahora las de decimales");
        System.out.println(" ");
        //
        Scanner bb = new Scanner(System.in);
        Scanner bc= new Scanner(System.in);
        System.out.println("escribir la primer cantidad");
        float numero3= bb.nextFloat();
        System.out.println("escribir la segunda cantidad");
        float numero4= bc.nextFloat();
        float suma1= numero3+numero4;
        float resta1= numero3-numero4;
        float multiplicacion1= numero3*numero4;
        float division1= numero3/numero4;
        System.out.println("primera operacion, la suma "+suma1);
        System.out.println("segunda operacion, la resta "+resta1);
        System.out.println("tercera operacion, la multiplicacion "+multiplicacion1);
        System.out.println("cuarta operacion, la division "+division1);
        
    }
    
}
