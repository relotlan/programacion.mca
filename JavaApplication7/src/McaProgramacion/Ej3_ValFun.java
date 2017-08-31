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
public class Ej3_ValFun {
    
    public static double f(double x){
        
        return Math.exp((-0.5*x*x))/(Math.sqrt(2*Math.PI));
    }
    
    public static void main(String[] args) {
        //int num = 0;
        for (double x=-5.0; x <= 5.0; x+= 0.1) {
          System.out.println(x+"    "+f(x));
          //num++;
        }
    }
    
}
