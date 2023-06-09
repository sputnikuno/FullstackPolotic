/** Escribir un programa que lea una palabra por teclado 
 * y determine si es un palíndromo.
 * Tip: los  palíndromos  son  palabras  que  se  leen 
 * igual  de  izquierda  a derecha y viceversa. 
 * Por ejemplo, reconocer.
 */
package guia2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Escribe una palabra para saber si es palíndromo");
    String palabra= scanner.nextLine();
    String palabraReves = "";
    
   
        for (int i = palabra.length() - 1; i >= 0; i--) {
            palabraReves += palabra.charAt(i);
        }
        if (palabra.equals(palabraReves)) {    
            System.out.println("Es un palíndromo");
        } else {        
             System.out.println("No es un palíndromo");
        }
    }
}
