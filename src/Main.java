public class Main {
    public static void main(String[] args) {
        // Crea un objeto de tipo Persona usando la palabra clave new
        Persona persona1 = new Persona(); // Se llama al constructor por defecto
        Persona persona2 = new Persona(); // Se crea otra instancia


        // A través del objeto instanciado, asigna valor a sus atributos
        persona1.nombre = "Ana";
        persona1.edad = 30;
        persona1.profesion = "Ingeniera";

        persona2.nombre = "Carlos";
        persona2.edad = 25;
        persona2.profesion = "Estudiante";

        // Llama a sus métodos
        persona1.saludar();
        persona2.saludar();

        Persona persona3 = new Persona();
        System.out.println("\nObjeto creado con el constructor por defecto:");
        System.out.println("Nombre: " + persona3.nombre);
        System.out.println("Edad: " + persona3.edad);
        System.out.println("Profesión: " + persona3.profesion);
        persona3.saludar(); // Mostrará los valores por defecto
    }
}