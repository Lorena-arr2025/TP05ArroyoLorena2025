package PUNTO04;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Pedimos un número
        System.out.print("Ingrese un número entre 1 y 9: ");
        int numero = scanner.nextInt();
        // Mostramos la tabla de multiplicar con un for
        System.out.println("Tabla de multiplicar del " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }

        scanner.close();
        }

}
