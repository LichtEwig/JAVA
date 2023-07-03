// 1. Pedir los coeficientes de una ecuación se 2º grado, y muestre sus soluciones reales. Si no existen, debe indicarlo.
// 2. Pedir tres números y mostrarlos ordenados de mayor a menor.
// 3. Pedir dos números y mostrarlos ordenados de mayor a menor o si son iguales
// 4. Pedir tres números . calcular la multiplicación de los dos mayores. dividir el mayor por el menor
// 5. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
// 6. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Suponiendo todos los meses de 30 días.
// 7. Pedir el radio de un círculo y calcular su área. A=PI*r^2. el perimetro

import java.util.Scanner;

public class labnueve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese los coeficientes (a, b, c) de la ecuación de segundo grado:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminante = b * b - 4 * a * c;

        if (discriminante > 0) {
            double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
            double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
            System.out.println("Las soluciones reales son x1 = " + x1 + " y x2 = " + x2);
        } else if (discriminante == 0) {
            double x = -b / (2 * a);
            System.out.println("La solución real es x = " + x);
        } else {
            System.out.println("No existen soluciones reales");
        }
    }
}



public class OrdenarNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese tres números:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        if (b > c) {
            double temp = b;
            b = c;
            c = temp;
        }

        if (a > b) {
            double temp = a;
            a = b;
            b = temp;
        }

        System.out.println("Los números ordenados de mayor a menor son: " + c + ", " + b + ", " + a);
    }
}

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese dos números:");
        double a = input.nextDouble();
        double b = input.nextDouble();

        if (a == b) {
            System.out.println("Los números son iguales: " + a + " y " + b);
        } else if (a > b) {
            System.out.println("Los números ordenados de mayor a menor son: " + a + " y " + b);
        } else {
            System.out.println("Los números ordenados de mayor a menor son: " + b + " y " + a);
        }
    }
}



public class MultiplicacionDivision {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese tres números:");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double mayor = a;

        if (b > mayor) {
            mayor = b;
        }

        if (c > mayor) {
            mayor = c;
        }

        double menor = a;

        if (b < menor) {
            menor = b;
        }

        if (c < menor) {
            menor = c;
        }

        double multiplicacion = 0;

        if (a == mayor) {
            multiplicacion = b * c;
        } else if (b == mayor) {
            multiplicacion = a * c;
        } else {
            multiplicacion = a * b;
        }

        double division = mayor / menor;

        System.out.println("La multiplicación de los dos mayores es " + multiplicacion);
        System.out.println("El mayor dividido por el menor es " + division);
    }
}

public class NumeroAlReves {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese un número entre 0 y 9.999:");
        int numero = input.nextInt();

        int inverso = 0;

        while (numero != 0) {
            int digito = numero % 10;
            inverso = inverso * 10 + digito;
            numero /= 10;
        }

        System.out.println("El número al revés es: " + inverso);
    }
}

public class ValidarFecha {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el día, mes y año de una fecha (en ese orden):");
        int dia = input.nextInt();
        int mes = input.nextInt();
        int anio = input.nextInt();

        if (mes < 1 || mes > 12) {
            System.out.println("El mes ingresado no es válido");
        } else if (dia < 1 || dia > 30) {
            System.out.println("El día ingresado no es válido");
        } else {
            System.out.println("La fecha ingresada es válida: " + dia + "/" + mes + "/" + anio);
        }
    }
}

public class Circulo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ingrese el radio del círculo:");
        double radio = input.nextDouble();

        double pi = 3.1416;
        double area = pi * Math.pow(radio, 2);
        double perimetro = 2 * pi * radio;

        System.out.println("El área del círculo es: " + area);
        System.out.println("El perímetro del círculo es: " + perimetro);
    }
}