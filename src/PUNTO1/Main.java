package PUNTO1;

public class Main {public static void main(String[] args) {
         String pais = "Argentina";
         String numeroTelefono = "388 3313748";
        int edad = 30;                            
        double alturaEdificio = 45.7;            
        double precioProducto = 128.50;
        double coseno05 = Math.cos(0.5);           

        // Declaramos cinco enteros y les asignamos valores
        int v1 = 8;
        int v2 = 5;
        int v3 = 1;
        int v4 = 20;
        int v5 = 9;

        // Calculamos el promedio: sumamos y dividimos por 5.0
        double promedio = (v1 + v2 + v3 + v4 + v5) / 5.0;

        // Salida por consola (mostramos lo que hicimos)
        System.out.println("Pais: " + pais);
        System.out.println("Edad: " + edad);
        System.out.println("Altura del edificio (m): " + alturaEdificio);
        System.out.println("Precio del producto: $" + precioProducto);
        System.out.println("Número de teléfono: " + numeroTelefono);
        System.out.println("Coseno de 0.5 (rad): " + coseno05);

        System.out.println();
        System.out.printf("Valores enteros: " + v1 + ", " + v2 + ", " + v3 + ", " + v4 + ", " + v5);
        System.out.println(" Promedio calculado: " + promedio);
      
    }
}
