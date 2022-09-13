/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg14._integral_simson;
import java.lang.Math;
/**
 *
 * @author jm543
 */
public class _integral_simson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    double a=0;
    double b=10;
    double n=10;
    double deltha=(b-a)/n;
    
    //valores de nx
    double n0=a+0*deltha;
    double n1=a+1*deltha;
    double n2=a+2*deltha;
    double n3=a+3*deltha;
    double n4=a+4*deltha;
    double n5=a+5*deltha;
    double n6=a+6*deltha;
    double n7=a+7*deltha;
    double n8=a+8*deltha;
    double n9=a+9*deltha;
    double n10=a+10*deltha;
    
    //valores de F(x)
    double fx= n0*n0+n0;
    double fx1= n1*n1+n1;
    double fx2= n2*n2+n2;
    double fx3= n3*n3+n3;
    double fx4= n4*n4+n4;
    double fx5= n5*n5+n5;
    double fx6= n6*n6+n6;
    double fx7= n7*n7+n7;
    double fx8= n8*n8+n8;
    double fx9= n9*n9+n9;
    double fx10= n10*n10+n10;
    
    //suma de los valores anteriormente encontrados
    double impares=fx1+fx3+fx5+fx7+fx9;
    double extremos=fx+fx10;
    
    //se usaran los pares sin contar los extremos
    double pares=fx2+fx4+fx6+fx8;
    //lo que multiplica con el deltha dividido 3
    double total2=extremos+2*pares+4*impares;
    //total
    double total = (deltha/3)*(total2);
        System.out.println(total);
    }
    
}
