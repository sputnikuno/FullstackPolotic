/**
 * Pedir  al  usuario  que  ingrese  una  temperatura  en  grados  Celsius 
 * y mostrar por pantalla su equivalente en kelvin y grados Fahrenheit. 
 * Las fórmulas para conversiones son:
 * Kelvin = 273,15 + Celsius Fahrenheit = 1,8 × Celsius
 */
package guia1;

import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args){
        Scanner lectorDeEntrada;
        lectorDeEntrada = new Scanner(System.in);
        
        System.out.println("Por favor ingresa una temperatura en grados Celsius");
        float celsius = lectorDeEntrada.nextFloat(); 
        
        float kelvin = 273.15f + celsius;
        float fahrenheit = (1.8f * celsius) + 32;
        
        System.out.println("Equivalentes en:\n" + "Kelvin: " + kelvin + "\n" + "Fahrenheit: " + fahrenheit);
    }
    
}
