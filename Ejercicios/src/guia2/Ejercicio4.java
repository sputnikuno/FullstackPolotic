/** Escribir un algoritmo que calcule el factorial de un número ingresado por teclado.
 * Tip: el factorial de un número  n es el resultado de multiplicar 
 * todos los números enteros desde 1 hasta n.
 * Por ejemplo, el factorial de 5 es 1 × 2 × 3 × 4 × 5 = 120.
 */
package guia2;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Dime un número");
        int numero = scanner.nextInt();
        
        int factorial = 1;
        
        for (int i = 1; i <= numero; i++) {
           factorial = factorial * i;
        }System.out.println("El factorial de " + numero + " es " + factorial);
    }
}
