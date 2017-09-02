/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package McaProgramacion;

import java.util.ArrayList;

/**
 *
 * @author Lenovo Unete G40
 */
public class Ej3_Mayor {

    public static double f() {
        double res, acom = 0, fm=0;
        for (double i = -5; i <= 5; i += 0.1) {
            res = (Math.exp((-0.5 * i * i)) / (Math.sqrt(2 * Math.PI))) * 1000;
            if (acom < res) {
                acom = res; 
                fm = i;
            }
        }
        System.out.println("El valor máximo es "+acom+" en donde x vale "+fm);
        return 0;
    }

    public static void main(String[] args) {
        f();

    }

}
