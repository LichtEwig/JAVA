package tarea14;

public class lab14 {
  public static void main(String[] args) {
     int n = 1;

    while (n <= 10) {
      System.out.println(n);
      n++;
    }
  }
}

// ciclo   |   n
// --------------
//   1     |   1
//   2     |   2
//   3     |   3
//   4     |   4
//   5     |   5
//   6     |   6
//   7     |   7
//   8     |   8
//   9     |   9
//   10     |   10

public class ej2 {
  public static void main(String[] args) {
    double VP = 1000;
    double i = 0.02;
    int n = 12;

    int mes = 1;
    double dinero = VP;

    System.out.println("nro de ciclo\tmes\tdinero");
    System.out.println("--------------\t----\t-----");

    while (mes <= n) {
      dinero += dinero * i;
      System.out.println(mes + "\t\t" + mes + "\t" + dinero);
      mes++;
    }
  }
}
// nro de ciclo    mes     dinero
// --------------  ----    -----
// 1               1       1020.0
// 2               2       1040.4
// 3               3       1061.208
// 4               4       1082.43216
// 5               5       1104.0808032
// 6               6       1126.162419264
// 7               7       1148.6856676492798
// 8               8       1171.6593810022655
// 9               9       1195.0925686223109
// 10              10      1218.994419994757
// 11              11      1243.3743083946522
// 12              12      1268.2417945625452

public class Ejer3 {
  public static void main(String[] args) {
    int i = 1;
    int suma = 0;

    while (i <= 25) {
      if (i % 2 == 0) {
        suma += i;
      }
      i++;
    }

    System.out.println("La suma de los numeros pares del 1 al 25 es: " + suma);
  }
}
// número de ciclo  condición del if n   suma
// 1               F                   0
// 2               V                   2
// 3               F                   2
// 4               V                   6
// 5               F                   6
// 6               V                   12
// 7               F                   12
// 8               V                   20
// 9               F                   20
// 10              V                   30
// 11              F                   30
// 12              V                   42
// 13              F                   42
// 14              V                   56
// 15              F                   56
// 16              V                   72
// 17              F                   72
// 18              V                   90
// 19              F                   90
// 20              V                   110
// 21              F                   110
// 22              V                   132
// 23              F                   132
// 24              V                   156
// 25              F                   156
// La suma de los numeros pares del 1 al 25 es: 156