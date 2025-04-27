package Pelota;

class Pelota {
    String color;
    String tamanio;

    //Constructor de los atributos de la pelota
    public Pelota(String color, String tamanio){
        this.color=color;
        this.tamanio=tamanio;
    }

    //Mostrar detalles de la pelota
    public void mostrarDetalles(){
        System.out.println("Detalles de la pelota:");
        System.out.println("Color: " + this.color);
        System.out.println("Tamaño: " + this.tamanio);
        System.out.println("-------------------------");
    }
}

public class PruebaPelota{
    public static void main(String[] args){
        //Objetos
        Pelota pelota1=new Pelota("Roja" , "Grande");
        Pelota pelota2=new Pelota("Azul" , "Mediana");
        Pelota pelota3=new Pelota("Amarilla" , "Pequeña");
        Pelota pelota4=new Pelota("Verde" , "Grande");

        System.out.println("Mostrando detalles:");
        pelota1.mostrarDetalles();
        pelota2.mostrarDetalles();
        pelota3.mostrarDetalles();
        pelota4.mostrarDetalles();
    }
}
