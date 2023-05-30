/**
* Escribir un programa que lea la estatura de tres personas, 
* calcule el promedio de la altura de ellos y lo informe.
*/ 

package guiaUno;

public class EjercicioCuatro {
  
     public static void main(String[] args){
        
        float personaUno = 1.52f;
        float personaDos = 1.73f;
        float personaTres = 1.80f;
        
        float valor = (personaUno + personaDos + personaTres) / 3;
        System.out.println(valor);
    }
    
}
