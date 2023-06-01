/**
 * Pedir al usuario que ingrese el precio de un producto y el porcentaje 
 * de  descuento.  A  continuación  mostrar  por  pantalla  el  importe 
 * descontado y el importe a pagar.
 */
package guiaUno;

import java.util.Scanner;

public class EjercicioSeis {
    public static void main(String [] args ){
        Scanner lectorDeEntrada = new Scanner(System.in);
        
        System.out.println("Ingresa el precio de un producto");
        float precio = lectorDeEntrada.nextFloat();    
      
        System.out.println("Ingresa el porcentaje de descuento");
        float porcentajeDescuento = lectorDeEntrada.nextFloat();
        
        float descuentoFinal = (porcentajeDescuento / 100) * precio;
        float importe = precio - descuentoFinal;
        
        System.out.println("El importe descontado es " + descuentoFinal + " y el importe a pagar es " + importe);
    }
}
