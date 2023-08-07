package practica;

import java.util.Scanner;

public class lab15 {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int[] numeros = new int[10];

            System.out.println("Ingrese los 10 números enteros:");

            // Leer los números ingresados por teclado
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = scanner.nextInt();
            }

            boolean creciente = true;
            boolean decreciente = true;
            boolean iguales = true;

            // Verificar si los números están ordenados de forma creciente, decreciente o si son iguales
            for (int i = 1; i < numeros.length; i++) {
                if (numeros[i] > numeros[i - 1]) {
                    decreciente = false;
                    iguales = false;
                } else if (numeros[i] < numeros[i - 1]) {
                    creciente = false;
                    iguales = false;
                } else {
                    creciente = false;
                    decreciente = false;
                }
            }

            // Mostrar el resultado
            if (creciente) {
                System.out.println("Los números están ordenados de forma creciente.");
            } else if (decreciente) {
                System.out.println("Los números están ordenados de forma decreciente.");
            } else if (iguales) {
                System.out.println("Todos los números son iguales.");
            } else {
                System.out.println("Los números están desordenados.");
            }
        }
    }
}
