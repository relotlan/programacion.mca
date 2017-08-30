/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mcamatematicas;

/**
 *
 * @author Lenovo Unete G40
 */
import java.math.BigInteger;
import java.util.*;
public class TorresDeHanoi {
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Dime cuantos discos quieres mover");
        int discos = ob.nextInt();
        BigInteger mov = new BigInteger("0");
        
        for (int i = 1; i <= discos; i++) {
            mov = (mov.multiply(new BigInteger(Integer.toString(2)))).add(new BigInteger(Integer.toString(1)));
            //mov = (mov*2)+1;            
        }
        System.out.println(mov);
    }
    
}
