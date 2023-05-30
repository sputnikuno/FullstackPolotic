/* Escribir un programa en el cual se le pregunte al usuario su nombre. 
* A continuación, mostrar un mensaje que diga “Hola, ” completando el mensaje 
* con el nombre que ingresó el usuario.
*/

package guiaUno;

import java.util.Scanner;

public class EjercicioDos {
    public static void main(String[] args){
        
        Scanner lectorDeEntrada = new Scanner(System.in);
    
        System.out.println("Por favor, dime tu nombre");
        String nombreUsuario = lectorDeEntrada.nextLine();
        
        System.out.println("Hola " + nombreUsuario);
           
    }
}