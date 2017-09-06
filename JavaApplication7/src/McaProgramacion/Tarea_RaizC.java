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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double aux = 0, aux2;
        Scanner ob = new Scanner(System.in);

        System.out.println("Introduce el numero que quieres calcular su raiz cuadrada");
        double num = ob.nextInt();

        while ((aux * aux) < num) {
            aux++;
        }

        if ((aux * aux) == num) {
            System.out.println(aux);
        } else {
            aux2 = aux - 1;
            while ((aux2 * aux2) < num) {
                aux2 += 0.0001;
            }
            System.out.println(aux2-0.0001);

        }
    }

}


