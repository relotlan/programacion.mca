/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcamatematicas;

/**
 *
 * @author Lenovo Unee G40
 */
import java.math.BigInteger;
import java.util.*;

public class EratostenesNumPrim2 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        BigInteger mov = new BigInteger("0");

        System.out.println("Introduce el número de discos a acomodar"); 
        int discos = ob.nextInt();

        mov = (int) (Math.pow(2, discos)) - 1;
        System.out.println(mov);
    }
}
