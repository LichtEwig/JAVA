package tarea5;

import java.util.Scanner;

public class laboratorio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer nombre y primer apellido: ");
        String nombreApellido = scanner.nextLine();

        String[] partes = nombreApellido.split(" ");
        String nombre = partes[0];
        String apellido = partes[1];

        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Iniciales: " + Character.toUpperCase(nombre.charAt(0)) +
                Character.toUpperCase(apellido.charAt(0)));

        scanner.close();
    }
}




public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de decimales para el resultado: ");
        int decimales = scanner.nextInt();

        double resultado = Math.pow(numero1, numero2);
        System.out.printf("El resultado de la potencia es: %.2f\n", resultado);

        scanner.close();
    }
}




public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la primera letra: ");
        char letra1 = scanner.nextLine().charAt(0);

        System.out.print("Ingrese la segunda letra: ");
        char letra2 = scanner.nextLine().charAt(0);

        System.out.println("Representación ASCII:");
        System.out.println(letra1 + " - Minúscula: " + (int) letra1);
        System.out.println(Character.toUpperCase(letra1) + " - Mayúscula: " + (int) Character.toUpperCase(letra1));
        System.out.println(letra2 + " - Minúscula: " + (int) letra2);
        System.out.println(Character.toUpperCase(letra2) + " - Mayúscula: " + (int) Character.toUpperCase(letra2));

        scanner.close();
    }
}



public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la base del triángulo rectángulo: ");
        double base = scanner.nextDouble();

        System.out.print("Ingrese la altura del triángulo rectángulo: ");
        double altura = scanner.nextDouble();

        double hipotenusa = Math.sqrt(base * base + altura * altura);
        double perimetro = base + altura + hipotenusa;
        double superficie = (base * altura) / 2;

        System.out.println("Largo de la hipotenusa: " + hipotenusa);
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Superficie del triángulo: " + superficie);

        scanner.close();
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        double resultado = 10000000.0 / 3.0;
        System.out.printf("Valor: %.2f\n", resultado);
    }
}

public class Ejercicio6 {
    public static void main(String[] args) {
        System.out.println("Aprendiendo programación!!");
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        System.out.println("\u001B[31m");
        System.out.println("     _____");
        System.out.println("   .'/L|__`\\.");
        System.out.println("  / =[_]O|`/ \\");
        System.out.println("  |\"+_____\":|");
        System.out.println("  |\"+_____\":|");
        System.out.println("  j__|_____|__l");
        System.out.println(" /\"+. \\_|_|_/ \\");
        System.out.println(" \\'='|     |='//");
        System.out.println("  '   |[ I ]|   '");
        System.out.println("      |_ _|_");
        System.out.println("     [_____]");
    }
}





