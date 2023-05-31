/** 
* Escribir un programa que lea dos números y realice el cálculo de la suma, 
* la resta, la multiplicación y la división entre ambos valores. 
* Los resultados deben mostrarse por pantalla.
*/



package guiaUno;

import java.util.Scanner;

public class EjercicioTres {
    public static void main(String[] args){
        
        Scanner lectorDeEntrada = new Scanner(System.in);
        
        System.out.println("Por favor, dime un número");
        int numeroUno = lectorDeEntrada.nextInt();
        lectorDeEntrada.nextLine();
        
        System.out.println("Por favor, dime otro número");
        int numeroDos = lectorDeEntrada.nextInt();
        lectorDeEntrada.nextLine();
        
        System.out.println("La suma de los números es " + (numeroUno + numeroDos));
        System.out.println("La resta de los números es " + (numeroUno - numeroDos));
        System.out.println("La multiplicación de los números es " + (numeroUno * numeroDos));
        System.out.println("La división de los números es " + (numeroUno / numeroDos));
    }
}
