package EstructurasDeControl;

public class CondicionalesIfElse {
   public static void main(String[] args){       
       //variable
       int edad = 18;
       
        //estructura de if
        if (edad >=21) {
            System.out.println("Eres mayor de edad");
        //estructura else (solo se suma el else y su bloque posterior)
        } else {
            System.out.println("Eres menor de edad");
        }
   }
}
