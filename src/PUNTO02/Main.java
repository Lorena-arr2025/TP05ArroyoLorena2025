package PUNTO02;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
        // Creamos un objeto Scanner para leer desde teclado
        Scanner scanner = new Scanner(System.in);

        // Pedimos al usuario que escriba un número
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt(); // guardamos el número en la variable "numero"

        // Si el número es par
        if (numero % 2 == 0) {
            int triple = numero * 3; // calculamos el triple
            System.out.println("El número es par. Su triple es: " + triple);
        } else {
            // Si el número es impar
            int doble = numero * 2; // calculamos el doble
            System.out.println("El número es impar. Su doble es: " + doble);
        }

        scanner.close(); // cerramos el scanner
    }

}

