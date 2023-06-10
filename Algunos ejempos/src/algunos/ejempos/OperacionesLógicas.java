package algunos.ejempos;

public class OperacionesLógicas {

    public static void main(String[] args) {
        /* 
        ! Negación
        == Comparación
        ¡= No igual
        > Mayor estricto
        < Menor estricto
        >= Mayor o igual
        <= Menor o o igual
        && Operación lógica Y
        || Operación lógica O
          XOR Operación lógica si uno no
        */
        EsMayor esMayor = new EsMayor();
        boolean resultado = esMayor.esMayor();
        System.out.println("El resultado es: " + resultado);
    }
}
//no entiendo bien como funciona, volver acá.
class EsMayor {
    public boolean esMayor() {
        float numero1 = 5f;
        float numero2 = 10.5f;
        boolean operacion = numero1 > numero2;
        return operacion;
    }
}
        