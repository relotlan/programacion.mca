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
import java.util.*;

public class EratostenesNumPrim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        System.out.println("Introduce hasta que número quieres calcular los número primos");
        int n = ob.nextInt();   //Se almacena el número hasta donde se calcularán los número primos
        int cuadrado = 0;        //Variable que se utiliza para almacenar hasta donde se eliminarán los multiplos
        int contador = 2;       //Variable que me servirá para calcular cuadrado
        int p = 0;              //Variable para trabajar con la posición de la lista
        ArrayList<Integer> matriz = new ArrayList();

        while (cuadrado < n) { //Se calculá hasta que número se caldularán los multiplos
            cuadrado = (int) Math.pow(contador, 2); //Calculó el cuadrado de contador
            contador++; //Incremento contador
        }

        for (int i = 2; i <= n; i++) { //Genero una lista del 2 hasta n numeros
            matriz.add(i);
        }

        for (int j = 2; j <= contador; j++) {   //Empiezo a generar los números de los cuales buscare sus multiplos
            for (int k = 0; k < matriz.size(); k++) {   //Inicio la busqueda en la lista de números primos para eliminarlos
                if (matriz.get(k) % j == 0) {   //Calculo si es o no un número primo
                    if (matriz.get(k) != j) {   //Descarto la eliminación del primer número que coincida con j, ya que si sería primo. Ej: 2, 3, 5 etc...
                        matriz.remove(k);   //Elimino el elemento multiplo de j de la matriz
                    }
                }
            }
        }
        //matriz.add(0,2);

        for (int r = 0; r < matriz.size(); r++) { //Recorro e imprimo los elementos que quedaron en la lista
            System.out.print(matriz.get(r)+" ");            
        }
        System.out.println("");

    }

}
