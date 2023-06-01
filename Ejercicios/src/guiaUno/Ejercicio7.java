/**
 * Escribir un programa que reciba el valor de dos edades y las guarde 
 * en dos variables. Luego el programa debe intercambiar los valores de ambas 
 * variables y mostrarlas por pantalla. Por ejemplo, si el usuario ingresó  
 * los  valores  edad1  =  24  y  edad2  =  35,  el  programa  deberá 
 * mostrar edad1 = 35 y edad2 = 24
 */
package guiaUno;

import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args){
        Scanner lectorDeEntrada = new Scanner(System.in);
        
        System.out.println("Dime una edad");
        int edad1 = lectorDeEntrada.nextInt();
        
        System.out.println("Dime otra edad");
        int edad2 = lectorDeEntrada.nextInt();
        
        edad1 = edad1 ^ edad2;
        edad2 = edad1 ^ edad2;
        edad1 = edad1 ^ edad2;
        
        System.out.println("El valor de la edad 1 es " + edad1 + " y el valor de la edad 2 es " + edad2);
    }
}
