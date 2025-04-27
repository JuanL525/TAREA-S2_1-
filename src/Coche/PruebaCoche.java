package Coche;

class Coche {
    String marca;
    String modelo;
    String color;
    int anio;

    //Constructor sin parametros
    public Coche(){
        System.out.println("Constructor sin parametros");
        this.marca="Desconocida";
        this.modelo="Basico";
        this.color="Gris";
        this.anio=2023;
    }
    //Constructor con parametros
    public Coche(String marca, String modelo, String color, int anio){
        System.out.println("Constructor con parametros");
        this.marca=marca;
        this.modelo=modelo;
        this.color=color;
        this.anio=anio;
    }
    public void mostrarInfo(){
        System.out.println("Informacion del coche:");
        System.out.println("Marca: " + this.marca);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Color: " + this.color);
        System.out.println("Año: " + this.anio);
        System.out.println("---------------------------");
    }
}
public class PruebaCoche {
    public static void main(String[] args) {
        // Instancia un objeto Coche usando el constructor sin parámetros
        System.out.println("Creando coche con constructor sin parámetros:");
        Coche cocheSinParametros = new Coche();
        cocheSinParametros.mostrarInfo();

        // Instancia un objeto Coche usando el constructor con parámetros
        System.out.println("\nCreando coche con constructor con parámetros:");
        Coche cocheConParametros = new Coche("Toyota", "Corolla", "Azul", 2024);
        cocheConParametros.mostrarInfo();
    }
}
