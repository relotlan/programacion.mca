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
public class Tarea_RaizC {
    
    public static double raizC(int x){
        double con=0, ac=1.0;
        while(con==ac){
        con =x/ac;
        ac++;
        }
        
        return con;
    }
    
    public static void main(String[] args) {
        int numero;
        Scanner ob = new Scanner(System.in);
        System.out.println("Introduce un número entero para calcular su raiz cuadrada por favor");
        numero = ob.nextInt();
        
        System.out.println("Su raiz es: "+raizC(numero));
    }
    
}
