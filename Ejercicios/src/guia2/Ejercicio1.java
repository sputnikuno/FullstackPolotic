/**
 * Escribir  un  programa  que  reciba  un  número  entero  
 * por  teclado.  A continuación, mostrar la tabla de multiplicar 
 * de ese número.
 */
package guia2;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Escribe un número");
        int numero = scanner.nextInt();
        
        for (int i = 2; i <=10; i++){
            System.out.println(numero * i);
        }
        System.out.println("Fin del ciclo");
    }
}
