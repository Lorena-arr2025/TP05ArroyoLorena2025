package PUNTO03;

import java.util.Scanner;

public class Main {public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedimos un número al usuario
        System.out.print( "Ingrese un número entre 0 y 10: ");
        int numero = scanner.nextInt();

        // Inicializamos variables
        int i = numero;       // contador que va bajando
        int factorial = 1; // valor inicial (caso base)

        // Caso especial: 0! = 1
        if (numero == 0) {
            factorial = 1;
        } else {
            // Mientras i sea mayor que 0, multiplicamos
            while (i > 0) {
                factorial = factorial * i;
                i--; // bajamos el contador
            }
        }

        // Mostramos el resultado
        System.out.println("El factorial de un numero " + numero + "! es: "+ factorial );

        scanner.close(); // cerramos el scanner
    }

}
