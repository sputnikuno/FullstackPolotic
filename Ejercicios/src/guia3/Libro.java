/**
 * Crear una clase llamada Libro que contenga los siguientes atributos:
 * a)  ISBN
 * b) Título
 * c)  Autor
 * d) Número de páginas
 * La clase debe tener:
 * e)  Un constructor con todos los atributos pasados por parámetro
 * f)   Un constructor vacío
 * Crear un método para cargar un libro pidiendo los datos al usuario
 * y luego informar mediante otro método el número de ISBN, el título,
 * el autor del libro y el número de páginas.
 */
package guia3;

import java.util.Scanner;

public class Libro {

    //atributos
    private String titulo, autor;
    private int paginas, isbn;

    //constructor vacio
    public Libro() {
    }

    //constructor con parametros
    public Libro(String titulo, int isbn, String autor, int paginas) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.paginas = paginas;
    }
    
    //metodo de la clase para cargar un libroinofrma
    public void cargarLibro() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingresa los siguientes datos:\nTítulo:");
        titulo = scanner.nextLine();
        System.out.println("Autor/a:");
        autor = scanner.nextLine();
        System.out.println("Numero de páginas:");
        paginas = scanner.nextInt();
        System.out.println("ISBN:");
        isbn = scanner.nextInt();
    }

    //metodo de la clase para para devolver datos del libro
    public void mostrarDatos() {
        System.out.println("Título:" + titulo);
        System.out.println("Autor/a:" + autor);
        System.out.println("Cantidad de páginas:" + paginas);
        System.out.println("ISBN:" + isbn);
        
    }
    
        public static void main(String[] args) {
        
    }
}
