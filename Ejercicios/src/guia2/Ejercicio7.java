/**
 * Del listado de abajo, determinar qué animal eligió el usuario mediante
 * la  realización  de  tres  preguntas  del  tipo  SI/NO  acerca
 * de  las  tres características elegidas (herbívoro, mamífero, doméstico).
 * Mostrar el resultado por pantalla.
 */
package guia2;

import java.util.Scanner;

public class Ejercicio7 {

    public static void main(String args[]) {
        Scanner lector = new Scanner(System.in);

        System.out.println("¿Es el animal hervíboro?\n" + "Ingresa 1 para SÍ y 2 para NO:");
        int respuesta = lector.nextInt();
        if (respuesta == 1) {
            System.out.println("¿Es el animal un mamífero?\n" + "Ingresa 1 para SÍ y 2 para NO:");
            int respuesta2 = lector.nextInt();
            if (respuesta2 == 1) {
                System.out.println("¿Es un animal doméstico?\n" + "Ingresa 1 para SÍ y 2 para NO:");
                int respuesta3 = lector.nextInt();
                if (respuesta3 == 1) {
                    System.out.println("Has elegido al caballo");
                } else {
                    System.out.println("Has elegido al alce");
                }
            } else {
                System.out.println("¿Es un animal doméstico?\n" + "Ingresa 1 para SÍ y 2 para NO:");
                int respuesta3 = lector.nextInt();
                if (respuesta3 == 1) {
                    System.out.println("Has elegido a la tortuga");
                } else {
                    System.out.println("Has elegido el caracol");
                }
            }
        } else {
            System.out.println("¿Es el animal un mamífero?\n" + "Ingresa 1 para SÍ y 2 para NO:");
            int respuesta2 = lector.nextInt();
            if (respuesta2 == 1) {
                System.out.println("¿Es un animal doméstico?\n" + "Ingresa 1 para SÍ y 2 para NO:");
                int respuesta3 = lector.nextInt();
                if (respuesta3 == 1) {
                    System.out.println("Has elegido al gato");
                } else {
                    System.out.println("Has elegido al león");
                }
            } else {
                System.out.println("¿Es un animal doméstico?\n" + "Ingresa 1 para SÍ y 2 para NO:");
                int respuesta3 = lector.nextInt();
                if (respuesta3 == 1) {
                    System.out.println("Has elegido a la pitón");
                } else {
                    System.out.println("Has elegido el cóndor");
                }
            }
        }
    }
}
