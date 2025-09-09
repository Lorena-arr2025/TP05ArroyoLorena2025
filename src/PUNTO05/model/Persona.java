package PUNTO05.model;
// Importamos librerías para trabajar con fechas
import java.time.LocalDate;
import java.time.Period;

public class Persona {
     // Atributos (características)
    private String dni;
    private String nombre;
    private LocalDate fechaNacimiento;
    private String provincia;

     // Constructor vacío: inicializa con valores por defecto
    public Persona() {
        this.dni = "";
        this.nombre = "";
        this.fechaNacimiento = LocalDate.now();
        this.provincia = "Jujuy";
    }
     // Constructor con todos los atributos
    public Persona(String dni, String nombre, LocalDate fechaNacimiento, String provincia) {
        this.dni = dni;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.provincia = provincia;
    }
     // Constructor sin provincia: usa "Jujuy" por defecto
    public Persona(String dni, String nombre, LocalDate fechaNacimiento) {
        this(dni, nombre, fechaNacimiento, "Jujuy");
    }
     // Métodos (acciones de la persona)
     // Calcula la edad actual a partir de la fecha de nacimiento
    public int calcularEdad() {
        return Period.between(fechaNacimiento, LocalDate.now()).getYears();
        }
     // Devuelve true si la persona tiene 18 años o más
    public boolean esMayorDeEdad() {
        return calcularEdad() >= 18;
    }
      // Muestra todos los datos en pantalla
    public void mostrarDatos() {
        System.out.println("DNI: " + dni);
        System.out.println("Nombre: " + nombre);
        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Provincia: " + provincia);
        System.out.println("Edad: " + calcularEdad());
        
        // Mostramos si es mayor de edad o no
        if (esMayorDeEdad()) {
            System.out.println("La persona es mayor de edad.");
        } else {
            System.out.println("La persona NO es mayor de edad.");
        }
    }

}
