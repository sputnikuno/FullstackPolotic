/** Escribir un programa que ordene un arreglo de números enteros 
 * de manera ascendente.
 */
package guia2;

import java.util.Arrays;

public class Ejercicio3 {
    public static void main(String[] args) {
        int [] numeros = {5,65,8,12,3,24};
        
        Arrays.sort(numeros);
        
        for(int i : numeros) {
            System.out.println(i);
        }
    }
}
