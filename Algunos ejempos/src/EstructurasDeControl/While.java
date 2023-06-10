/*
para cuando no sabemos con exactitud cuántas veces se ejecutará el código
 */
package EstructurasDeControl;

/**
 * Se ejecutará durante una unica condicion, si nunca deja de 
 * cumplirse se quedará ejecutando
 */
public class While {
    public static void main(String[] args) {
        
        //condicion que debe tener cierta incertidumbre si se cumple
        int edad = 18;
        int dia = 20;
        int control = 10;
        while(control > 0 && edad > 18 && dia == 20) {
            System.out.println("Dentro del ciclo");
            //hace que se decremente el control para parar el ciclo
            control --;
        } 
        System.out.println("Finalizó el ciclo");
    }
    
}
