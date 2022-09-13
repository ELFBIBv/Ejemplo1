/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg11._peso_en_kg;
import java.util.Scanner;
/**
 *
 * @author jm543
 */
public class _peso_en_kg {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //variables
        Scanner sc = new Scanner(System.in);
        double a = 0;
        int entre = 0;
        int mayor = 0;
        int menor = 0;
              
        System.out.println("ingrese el peso (en kilogramos) de la pieza");
        
        do {            
                    a= sc.nextDouble();
            if (a>=9.8 && a<=10.2) {
                entre++;
            } 
            if(a<9.8 && a>0){
                menor++;
            } 
            if(a>10.2 && a>0)
                mayor++;
            
        } while (a>0);
        System.out.println("las piezas con peso (en kilogramos) entre 9.8Kg y 10.2Kg son: "+entre);
        System.out.println("las piezas con peso (en kilogramos) con mas de 10.2Kg son: "+mayor);
        System.out.println("las piezas con peso (en kilogramos) con menos de 9.8Kg son: "+menor);
        
    }
    
}
