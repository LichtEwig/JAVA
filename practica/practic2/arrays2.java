package practica.practic2;

import java.util.Scanner;

public class arrays2 {
    public static void main(String[] args) {
        int[] tabla = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 8 números:");
        for (int i = 0; i < 8; i++) {
            tabla[i] = scanner.nextInt();
        }

        System.out.print("Ingrese el número a insertar: ");
        int numero = scanner.nextInt();
        System.out.print("Ingrese la posición de inserción (0-9): ");
        int posicion = scanner.nextInt();

        // Desplazamiento de números
        for (int i = 7; i >= posicion; i--) {
            tabla[i + 1] = tabla[i];
        }
        tabla[posicion] = numero;

        System.out.println("Tabla después de la inserción:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tabla[i] + " ");
        }

        scanner.close();
    }
}




public class Tabla {
    public static void main(String[] args) {
        int[] tabla = new int[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < 10; i++) {
            tabla[i] = scanner.nextInt();
        }

        int ultimo = tabla[9];

        for (int i = 9; i >= 1; i--) {
            tabla[i] = tabla[i - 1];
        }

        tabla[0] = ultimo;

        System.out.println("Tabla después del desplazamiento:");
        for (int i = 0; i < 10; i++) {
            System.out.print(tabla[i] + " ");
        }

        scanner.close();
    }
}


public class InsertArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] array = new int[10];
        
        // Leer 5 elementos numéricos ordenados de forma creciente
        System.out.println("Introduce 5 elementos numéricos ordenados de forma creciente:");
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Leer el número N a insertar
        System.out.print("Introduce el número a insertar (N): ");
        int N = scanner.nextInt();
        
        // Encontrar la posición adecuada para insertar N en el arreglo
        int insertIndex = 0;
        while (insertIndex < 5 && array[insertIndex] < N) {
            insertIndex++;
        }
        
        // Hacer espacio para el nuevo número moviendo los elementos hacia atrás
        for (int i = 4; i >= insertIndex; i--) {
            array[i + 1] = array[i];
        }
        
        // Insertar el nuevo número en la posición adecuada
        array[insertIndex] = N;
        
        // Imprimir el arreglo resultante
        System.out.println("Arreglo después de la inserción:");
        for (int i = 0; i < 6; i++) { // 6 elementos ahora (5 originales + 1 insertado)
            System.out.print(array[i] + " ");
        }

        scanner.close();
    }
}
