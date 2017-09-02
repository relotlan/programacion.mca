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

    public static double f() {
        double res;
        int ent, k, col;
        String graf[][] = new String[400][101];
        
        for (int j = 0; j < 400; j++) {//Filas
            //System.out.println("---------------------"+j+"--------------------------");
            col=0;
            for (double i = -5; i <= 5; i += 0.1) {//columnas                
                k = (int) (50 + (i * 10)); //Se pasan a enteros i para acomodar las columnas
                res = (Math.exp((-0.5 * i * i)) / (Math.sqrt(2 * Math.PI))) * 1000; //Generá la función
                ent = (int) res; //Se toman los enteros del resultado de la función para acomodar las filas
//                System.out.println(ent+"  "+j+" "+col);
                if (j == ent) {
                    
                   graf[j][col] = "*";
               } else {
                   graf[j][col] = " ";
                }
                col++;
            }
            
        }

       for (int m = 0; m < 400; m++) {
            for (int n = 0; n < 101; n++) {
                    System.out.print(graf[m][n]);
                } 
            System.out.println("");
        }

        return 0;
    }

    public static void main(String[] args) {
        f();

    }

}
