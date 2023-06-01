/**
* Pedir al usuario que ingrese el valor del radio de una circunferencia. 
* Calcular y mostrar por pantalla el área y el perímetro. 
* Recordá que el área y el perímetro se calculan con las siguientes fórmulas:
* area = PI × radio² perimetro = 2 × PI × radio
*/

package guiaUno;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        
        Scanner lectorDeEntrada = new Scanner(System.in);
        
        System.out.println("Ingresa el valor del radio de una circunferencia");
        float radio = lectorDeEntrada.nextFloat();
        
 System.out.println("Esta es el área de la circunferencia:\n" + (Math.PI * Math.pow(radio, 2)));
        System.out.println("Este es el perímetro de la circunferencia:\n" + (2 * Math.PI * radio));
    }
    
}
