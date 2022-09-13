/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simulacion.de.inicio.de.sesion;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author jm543
 */
public class SimulacionDeInicioDeSesion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nombre de usuario");
      String a = sc.nextLine();
        System.out.println("Ingrese su contraseña");
      String b = sc.nextLine();
      double c = Math.random()*10;
      int d= (int) c;
      
        if (d%2==0) {
            System.out.println("el usuario "+a+" o la contraseña es incorrecta");
        } else {
            System.out.println("datos correctos");
        }
    }
}
