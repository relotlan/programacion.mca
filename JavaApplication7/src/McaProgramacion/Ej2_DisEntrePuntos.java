/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package McaProgramacion;

/**
 *
 * @author Lenovo Unete G40
 */
import java.util.*;
public class Ej2_DisEntrePuntos {
    
    public static  double f(double x1, double x2, double y1, double y2){
        double dis = 0;
        
        dis =Math.sqrt(Math.pow(x2-x1, 2) + (Math.pow(y2-y1, 2)));        
        return dis;
    }   
    
    public static void main(String[] args) {
        double x1, x2, y1, y2;
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Dame x1 ");
        x1= ob.nextInt();
        System.out.println("Dame x2 ");
        x2= ob.nextInt();
        System.out.println("Dame y1 ");
        y1= ob.nextInt();
        System.out.println("Dame y2 ");
        y2= ob.nextInt();
        
        System.out.println("la distancia entre los puntos es de: "+f(x1, x2, y1, y2));
    }   
    
}
