/**Escribir  un  algoritmo  que  lea  un  valor  n por  teclado  
 * y  muestre  los primeros n términos de la sucesión de Fibonacci.
 * Tip: la sucesión de Fibonacci comienza con 0, luego 1 y a partir 
 * de allí cada nuevo número es la suma de los dos anteriores.
 */
package guia2;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        System.out.println("Ingresa un número: ");
        int valor = lector.nextInt();
        
        int a = 0, b = 1, c;
        
        for (int i = 0; i < valor; i++){
            System.out.println(a);
            c = a + b;
            a = b;
            b = c;
                    
        }
        
    }
}
