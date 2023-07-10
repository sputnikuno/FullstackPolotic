/*
Realizar  una  clase  llamada  CuentaBancaria que  debe  tener  estos atributos:
a)  numero (entero)
b) dni del cliente (entero largo)
c)  saldo actual (doble)
La clase debe contar con los siguientes métodos:
d) Constructor por defecto
e)  Constructor con DNI, saldo y número de cuenta.
f)   Métodos getters y setters correspondientes.
g) Método  ingresar(double ingreso) que  recibe  una  cantidad positiva de 
dinero a ingresar y la suma al saldo actual. Si el importe a ingresar 
es negativo, el método no debe hacer nada.
h)  Método  extraccionRapida()  que  retira  el  20%  del  saldo  y devuelve 
el importe retirado.
i)   Método consultarSaldo() que permitirá consultar el saldo.
j)   Método  consultarDatos() que mostrará todos los datos de la cuenta
 */
package guia3;

public class CuentaBancaria {

    private int numero, dni;
    private double saldo;

    CuentaBancaria() {
    }

    CuentaBancaria(int numero, int dni, double saldo) {
        this.numero = numero;
        this.dni = dni;
        this.saldo = saldo;
    }

    //getters y setters
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //metodo ingresar saldo
    public double ingresarSaldo(double ingreso) {
        if (ingreso > 0) {
            saldo += ingreso;
        } return saldo;
    }
    
    //metodo extracción del 20%
    public double extraccionRapida() {
        double porcentaje = (saldo * 20) / 100;
        saldo -= porcentaje;

        return porcentaje;
    } 
    
    //metodo consulta de saldo
    public void consultarSaldo() {
        System.out.println("Saldo disponible:" + getSaldo());
    }
    
    //mostrará todos los datos de la cuenta
    public void consultarDatos() {
        System.out.println("Número de cuenta" + getNumero());
        System.out.println("DNI:" + getDni());
        System.out.println("Saldo disponible:" + getSaldo());        
    }
}
