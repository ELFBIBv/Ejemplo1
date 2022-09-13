/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.matriculasdelauniversidad;
import java.util.Scanner;

/**
 *
 * @author jm543
 */
public class MatriculasDeLaUniversidad {

    public static void main(String[] args) {
            
        String b;
        String x1;
        String x2;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("ingrese el nombre del postulante");
        String a= sc.nextLine();
        System.out.println("a continuacion ingrese la facultad que se desea");
        b = sc.nextLine();
       
        x1 = "importe de la matricula";
        x2 = "mensualidad";
        
        System.out.println("ingrese el numero 1 si los datos son correctos, si no presione 0");
        x= sc.nextInt();
        if (x==1) {
            
            switch (b){
                case ("Ing. de Sistemas"):
                    System.out.println(x1+" Q350");
                    System.out.println(x2+" Q650");
                    break;
                case ("Derecho"):
                    System.out.println(x1+" Q300");
                    System.out.println(x2+" Q550");
                    break;
                case ("Ing. Naviera"):
                    System.out.println(x1+" Q300");
                    System.out.println(x2+" Q500");
                    break;
                case ("Ing. Pesquera"):
                    System.out.println(x1+" Q310");
                    System.out.println(x2+" Q460");
                    break;
                case ("Contabilidad"):
                    System.out.println(x1+" Q280");
                    System.out.println(x2+" Q490");
                    break;
                case ("Administración"):
                    System.out.println(x1+" Q360");
                    System.out.println(x2+" Q520");
                    break;
                default:
                        System.out.println("datos erroneos");
                        break;
                }
            System.out.println("si desea asignarse presione 1");
            int z = sc.nextInt();
            
            if (z==1){
            System.out.println(a+" sera asignado a la carrera de "+b);        
                    }
        } else if (x==0){
            System.out.println(a+" no sera asignado a la carrera de "+b);
        }
        
    }
}
