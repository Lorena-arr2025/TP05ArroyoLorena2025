package PUNTO05.main;

import java.time.LocalDate;
// Importamos la clase Persona que está en otro paquete
import PUNTO05.model.Persona;

public class Main {public static void main(String[] args) {
        // PRIMER OBJETO: constructor vacío 
        System.out.println("=== Persona 1 ===");
        Persona p1 = new Persona();
        p1.mostrarDatos();
        // SEGUNDO OBJETO: constructor con todos los atributos
        System.out.println("\n=== Persona 2 ===");
        Persona p2 = new Persona("12345678", "Adriana Arrueta", LocalDate.of(1984, 3, 10), "Salta");
        p2.mostrarDatos();
        // TERCER OBJETO: constructor sin provincia (queda "Jujuy" por defecto)
        System.out.println("\n=== Persona 3 ===");
        Persona p3 = new Persona("87654321", "Ana Lopez", LocalDate.of(2010, 7, 20));
        p3.mostrarDatos();
    }

}
