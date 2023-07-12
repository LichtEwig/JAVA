package tarea12;
import java.util.Scanner;

public class lab12 {
    public static void main(String[] args) {
        int nro1 = 100, nro2 = 500, nro3 = 250;

        if(nro1>nro2 && nro1>nro3){
            System.out.println("nro1 es el mayor");
        } else if(nro2>nro1 && nro2>nro3){
            System.out.println("nro2 es el mayor");
        } else {
            System.out.println("nro3 es el mayor");
        }
    }
}


public class MultipPositivos {
    public static void main(String[] args) {
        int a = 10, b=-2, c=5;
        int contador = 0;
        int multiplicacion = 1;

        if(a > 0){
            contador++;
            multiplicacion *= a;
        }

        if(b > 0){
            contador++;
            multiplicacion *= b;
        }

        if(c > 0){
            contador++;
            multiplicacion *= c;
        }

        if(contador == 2){
            System.out.println("La multiplicación de los dos números positivos es: " + multiplicacion);
        } else {
            System.out.println("No se encontraron dos números positivos para realizar la multiplicación");
        }
    }
}




public class Verificar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String usuario = "Pepito", clave = "1234";

        System.out.print("Ingrese el usuario: ");
        String usuarioIngresado = input.nextLine();

        System.out.print("Ingrese la clave: ");
        String claveIngresada = input.nextLine();

        if(usuarioIngresado.equalsIgnoreCase(usuario) && claveIngresada.equals(clave)){
            System.out.println("¡Bienvenido " + usuario.toLowerCase() + "!");
        } else if(usuarioIngresado.equalsIgnoreCase(usuario) && !claveIngresada.equals(clave)){
            System.out.println("Contraseña incorrecta");
        } else if(!usuarioIngresado.equalsIgnoreCase(usuario) && claveIngresada.equals(clave)){
            System.out.println("Usuario incorrecto");
        } else {
            System.out.println("Usuario y contraseña incorrectos");
        }
    }
}

