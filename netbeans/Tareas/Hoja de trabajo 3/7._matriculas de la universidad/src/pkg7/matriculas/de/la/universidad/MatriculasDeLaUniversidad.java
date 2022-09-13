/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg7.matriculas.de.la.universidad;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class MatriculasDeLaUniversidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String b;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del postulante");
        String a= sc.nextLine();
        System.out.println("a continuacion ingrese la facultad que se desea");
        b = sc.nextLine();
        
        
        
        switch (b){
                case ("ing. de sistemas"):
                    System.out.println("importe de matricula Q350");
                    System.out.println("mansualidad 650");
                    break;
                case ("Derecho"):
                    System.out.println("si");
                    break;
                default:
                        System.out.println("si");
                }
        System.out.println(a);
    }
    
}
