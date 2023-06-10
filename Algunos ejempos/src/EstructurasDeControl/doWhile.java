/**
 * Uno de los menos utilizados porque no existen muchas situaciones
 * donde usarlos.
 * Usualmente cuando tenemos que definir una variable para comenzar el ciclo.
 */
package EstructurasDeControl;

/**
 *
 * @author Georgina
 */
public class doWhile {
    public static void main(String[] args) {
    
    int opcion;
    //el codigo dentro de do se ejecuta sin tener que analizar la condicion, ANTES de hacerlo.
    do {
        System.out.println("Elija una opción");
        // inicializar
        opcion = 10;
        System.out.println("Eligió la opcion " + opcion);
        //termina la condicion
    } while(opcion !=110);
    
        System.out.println("Finalizó el programa");
    }
    
}
