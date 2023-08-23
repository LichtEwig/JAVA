package arrays;

/*Queremos desarrollar una aplicación que nos ayude a gestionar las notas de un centro educativo. Cada grupo
(o clase) está compuesto por 5 alumnos. Se pide leer las notas del primer, segundo y tercer trimestre de un
grupo. Debemos mostrar al final: la nota media del grupo en cada trimestre, y la media del alumno que se
encuentra en la posición N (N se lee por teclado).*/

import java.util.Scanner;

public class aplicacion {
    public static void main(String[] args) {
        double[][] notas = new double[5][3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Notas del alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Trimestre " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
            System.out.println();
        }

        double[] mediasTrimestres = new double[3];

        for (int j = 0; j < 3; j++) {
            double suma = 0;
            for (int i = 0; i < 5; i++) {
                suma += notas[i][j];
            }
            mediasTrimestres[j] = suma / 5;
        }

        System.out.println("Media del grupo en cada trimestre:");
        for (int j = 0; j < 3; j++) {
            System.out.println("Trimestre " + (j + 1) + ": " + mediasTrimestres[j]);
        }

        System.out.print("Ingrese la posición del alumno (N): ");
        int posicionN = scanner.nextInt();

        if (posicionN >= 1 && posicionN <= 5) {
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                suma += notas[posicionN - 1][j];
            }
            double mediaAlumnoN = suma / 3;
            System.out.println("Media del alumno en la posición " + posicionN + ": " + mediaAlumnoN);
        } else {
            System.out.println("Posición inválida");
        }
        scanner.close();
    }
}
