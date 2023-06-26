// Realizar un programa que permita al usuario ingresar 
// por consola dos números y realice las siguientes 
// operaciones:
// 1. El usuario debe poder ingresar la cantidad de 
// decimales que desea ver en el resultado.
// 2. Sacar la potencia de los números ingresados.


package tarea8;

import java.util.Scanner;

public class lab8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = scanner.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.print("Ingresa la cantidad de decimales para el resultado: ");
        int decimales = scanner.nextInt();

       
        double potencia1 = Math.pow(num1, num2);
        double potencia2 = Math.pow(num2, num1);

        String formato = "%." + decimales + "f";
        String resultado1 = String.format(formato, potencia1);
        String resultado2 = String.format(formato, potencia2);


        System.out.println("El resultado de " + num1 + " elevado a " + num2 + " es: " + resultado1);
        System.out.println("El resultado de " + num2 + " elevado a " + num1 + " es: " + resultado2);
    }
}
