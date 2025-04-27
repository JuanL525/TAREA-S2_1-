package Libros;

class Libro {
    String autor;
    String titulo;
    int paginas;

    //Constructor sin parametros
    public Libro() {
        System.out.println("Constructor sin parametros");
        this.titulo = "Desconocido";
        this.autor = "Anonimo";
        this.paginas = 0;
    }

    //Constructor con parametros
    public Libro(String autor, String titulo, int paginas){
        System.out.println("Constructor con parametros");
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    //Metodo para imprimir la informacion del libro
    public void imprimirInfo(){
        System.out.println("Informacion del Libro");
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Numero de paginas: " + this.paginas);
        System.out.println("-------------------------");
    }
}

public class PruebaLibros {
    public static void main(String[] args) {
        //Sin parametros
        System.out.println("Creando objeto Libro usando el constructor sin parámetros:");
        Libro libroPorDefecto = new Libro();
        libroPorDefecto.imprimirInfo();
        //Con parametros
        System.out.println("\nCreando objeto Libro usando el constructor con parámetros:");
        Libro libroEspecifico = new Libro("Cien años de soledad", "Gabriel García Márquez", 417);
        libroEspecifico.imprimirInfo();
    }
}