/**
 * Declarar  una  clase  llamada  Circunferencia  que  tenga  como atributo  
 * privado  el  radio (de  tipo  real).  La  clase  debe  tener  los siguientes métodos:
 * a)  Un constructor que inicialice el radio recibido como parámetro.
 * b) Un getter y un setter para el atributo radio.
 * c)  Un método area() que calcule y devuelva el área
 * d) Un método perimetro() que calcule y devuelva el perímetro
 * Recordá  que  el  área  y  el  perímetro  se  calculan  con  las  
 * siguientes fórmulas:      
 * area = PI * radio² 
 * perimetro = 2 * PI * radio
 **/
package guia3;

public class Circunferencia {
    //atributo radio real
    private double radio; 
    
    //contructor que inicializa el radio
    Circunferencia(double radio) {
        this.radio = radio;
    }
    //getter
    public double getRadio() {
        return radio;
    }
    //setter
    public void setRadio(double radio) {
        this.radio = radio;
    }
    //calcula y devuelve el area
    public double area(double radio){
        return (Math.PI * Math.pow(radio, 2));
    }
    //calcule y devuelva el perímetro
    double perimetro(double radio){
        return (2 * Math.PI * Math.pow(radio, 2)); 
    }
}
