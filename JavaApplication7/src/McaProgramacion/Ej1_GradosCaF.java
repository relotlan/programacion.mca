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
public class Ej1_GradosCaF {
    public static void main(String[] args) {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce los grados centigrados:");
        int C = lee.nextInt();
        double f = 0;
        
        //Ojo: Dos enteros divididos dan un entero
        f = ((9.0/5.0)*C) + 32;
        
        System.out.println(C +" grados centigrados equivale a "+f+" grados farenheit");
        
    }
}
