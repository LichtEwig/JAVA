/**Ejercicio 1 - Asignación básica
Analice el código a continuación y complete la tabla correspondiente. Luego realice la codificación 
para confirmar que ha completado la tabla correctamente.
System.out.println("A");
int x = 10;
int y = 20;
System.out.println(x);
System.out.println(y);
System.out.println("B");
x = x + 5;
y = y + 10;
System.out.println(x);
System.out.println(y);
System.out.println("C");
x = x - 5;
y = y - 10;
System.out.println(x);
System.out.println(y);
System.out.println("D");
x = x * 3;
y = y * 5;
System.out.println(x);
System.out.println(y);
System.out.println("E");
x = x / 2;
y = y / 4;
System.out.println(x);
System.out.println(y);*/

public class practica {
    public static void main (String[] args) {
      int Bx,By,Cx,Cy,Dx,Dy,Ex,Ey;
      int x = 10;
      int y = 20;

      Bx=x + 5;
      By=y + 10;
      Cx=x - 5;
      Cy=y - 10;
      Dx=x * 3;
      Dy=y * 5;
      Ex=x / 2;
      Ey=y / 4;

      System.out.println(Bx);
      System.out.println(By);
      System.out.println(Cx);
      System.out.println(Cy);
      System.out.println(Dx);
      System.out.println(Dy);
      System.out.println(Ex);
      System.out.println(Ey);
    }
};


/**Tabla para completar:
       x                   y
A      10                 20
B      15                 30
C      5                  10
D      30                 100
E.     5                  5              */
/*
X Y
A
B
C
D
E
*/
/**Ejercicio 2 - Asignación compacta
Analice el código a continuación y complete la tabla correspondiente. Luego realice la codificación 
para confirmar que ha completado la tabla correctamente.
System.out.println("A");
int x = 10;
int y = 20;
System.out.println(x);
System.out.println(y);
System.out.println("B");
x += 5;
y -= 15;
System.out.println(x);
System.out.println(y);
System.out.println("C");
x++;
y--;
System.out.println(x);
System.out.println(y);
System.out.println("D");
x *= 4;
y *= -3;
System.out.println(x);
System.out.println(y);
System.out.println("E");
x /= 2;
y /= 4;
System.out.println(x);
System.out.println(y);*/
public class practica {
    public static void main (String[] args) {
      int Bx,By,Cx,Cy,Dx,Dy,Ex,Ey;
      int x = 10;
      int y = 20;

      Bx=x += 5;
      By=y -= 15;
      Cx=x++;
      Cy=y--;
      Dx=x *= 4;
      Dy=y *= -3;
      Ex=x /= 2;
      Ey=y /= 4;

      System.out.println(Bx);
      System.out.println(By);
      System.out.println(Cx);
      System.out.println(Cy);
      System.out.println(Dx);
      System.out.println(Dy);
      System.out.println(Ex);
      System.out.println(Ey);
    }
};
/*Tabla para completar:
       x             y
A      10           20
B      15           5
C      15           5
D      64          -12
E      32           -3
/*
X Y
A
B
C
D
E
*/
/**Ejercicio 3 - Operadores aritméticos
System.out.println("A");
int x = 10;
int y = 20;
System.out.println(x);
System.out.println(y);
System.out.println("B");
x = x + y;
y = y + x;
System.out.println(x);
System.out.println(y);
System.out.println("C");
x= x - y;
y= y - x;
System.out.println(x);
System.out.println(y);
System.out.println("D");
x=x * y;
y=x * x;
System.out.println(x);
System.out.println(y);
System.out.println("E");
x= y / x;
y= x / y;
System.out.println(x);
System.out.println(y);*/

public class practica {
    public static void main (String[] args) {
      int Bx,By,Cx,Cy,Dx,Dy,Ex,Ey;
      int x = 10;
      int y = 20;

      Bx=x + y;
      By=y + x;
      Cx=x - y;
      Cy=y - x;
      Dx=x * y;
      Dy=y * x;
      Ex=x / y;
      Ey=y / y;

      System.out.println(Bx);
      System.out.println(By);
      System.out.println(Cx);
      System.out.println(Cy);
      System.out.println(Dx);
      System.out.println(Dy);
      System.out.println(Ex);
      System.out.println(Ey);
    }
};
/*Tabla para completar:
/*         x           y
A          10          20
B          30          30
C         -10          10
D          200         200
E          0           1
/*
X Y
A
B
C
D
E
*/
/**Ejercicio 4- Operadores aritméticos con asignación compacta
System.out.println("A");
int x = 5;
int y = 10;
System.out.println(x);
System.out.println(y);
System.out.println("B");
x += y;
y += x;
System.out.println(x);
System.out.println(y);
System.out.println("C");
x -= y;
y -= x;
System.out.println(x);
System.out.println(y);
System.out.println("D");
x *= y;
y *= x;
System.out.println(x);
System.out.println(y);
System.out.println("E");
x /= y;
y /= y;
System.out.println(x);
System.out.println(y);
*/
public class practica {
    public static void main (String[] args) {
      int Bx,By,Cx,Cy,Dx,Dy,Ex,Ey;
      int x = 5;
      int y = 10;

      Bx=x -= y;
      By=y -= x;
      Cx=x -= y;
      Cy=y -= x;
      Dx=x *= y;
      Dy=y *= x;
      Ex=x /= y;
      Ey=y /= y;

      System.out.println(Bx);
      System.out.println(By);
      System.out.println(Cx);
      System.out.println(Cy);
      System.out.println(Dx);
      System.out.println(Dy);
      System.out.println(Ex);
      System.out.println(Ey);
    }
};
/*Tabla para completar:
   /*      x         y
A          5         10
B         -5          15
C         -20        35
D         -700       -24500
E           0          1
/*
X Y
A
B
C
D
E
*/
/**Ejercicio 5- Operadores Aritméticos con asignación múltiple (suma y resta)
System.out.println("A");
int x = 5;
int y = 10;
int suma = 0;
int resta = 0;
System.out.println(x);
System.out.println(y);
System.out.println(suma);
System.out.println(resta);
System.out.println("B");
suma = x + y;
resta = x - y;
System.out.println(x);
System.out.println(y);
System.out.println("C");
suma = x + x;
resta = y - y;
System.out.println(x);
System.out.println(y);
System.out.println("D");
suma = x + y + x;
resta = x – x - 20;
System.out.println(x);
System.out.println(y);
System.out.println("E");
suma = y + x + x;
resta = -x - y -y ;
System.out.println(x);
System.out.println(y);*/

public class practica {
    public static void main (String[] args) {
      int Ax,Ay,Bx,By,Cx,Cy,Dx,Dy,Ex,Ey,suma,resta;
      int x = 5;
      int y = 10;

      Ax=suma=0;
      Ay=resta=0;
      Bx=suma=x + y;
      By=resta= x - y;
      Cx=suma = x + x;
      Cy=resta = y - y;
      Dx=suma = x + y + x;
      Dy=resta = x - x - 20;
      Ex=suma = y + x + x;
      Ey=resta = -x - y -y ;
    

      System.out.println(Ax);
      System.out.println(Ay);
      System.out.println(Bx);
      System.out.println(By);
      System.out.println(Cx);
      System.out.println(Cy);
      System.out.println(Dx);
      System.out.println(Dy);
      System.out.println(Ex);
      System.out.println(Ey);
    }
};
/*Tabla para completar:
        x        y          suma         resta
A       5        10          0             0
B       15       -5
C       10        0
D       20       -20
E       20       -25
/*
X Y suma resta
A
B
C
D
E
*/
/**Ejercicio 6- Operadores Aritméticos con asignación múltiple (producto y división)
System.out.println("A");
int x = 5;
int y = 10;
int multi = 1;
int division = 1;
System.out.println(x);
System.out.println(y);
System.out.println(multi);
System.out.println(division);
System.out.println("B");
multi = x * y;
division = x / y;
System.out.println(multi);
System.out.println(division);
System.out.println("C");
multi = x * x;
division = y / y;
System.out.println(multi);
System.out.println(division);
System.out.println("D");
multi = x * y * x;
division = y / x;
System.out.println(multi);
System.out.println(division);
System.out.println("E");
multi= x * (-y);
division= y / (-x);
System.out.println(multi);
System.out.println(division);
 */
public class practica {
    public static void main (String[] args) {
      int Ax,Ay,Bx,By,Cx,Cy,Dx,Dy,Ex,Ey,multi,division;
      int x = 5;
      int y = 10;

      Ax=multi=1;
      Ay=division=1;
      Bx=multi=x * y;
      By=division= x / y;
      Cx=multi = x * x;
      Cy=division = y / y;
      Dx=multi = x * y * x;
      Dy=division = y / x ;
      Ex=multi = x * (-y);
      Ey=division = y / (-x);
    

      System.out.println(Ax);
      System.out.println(Ay);
      System.out.println(Bx);
      System.out.println(By);
      System.out.println(Cx);
      System.out.println(Cy);
      System.out.println(Dx);
      System.out.println(Dy);
      System.out.println(Ex);
      System.out.println(Ey);
    }
};
/*Tabla para completar:
/**        x        y        multi         división
A          5        10        1              1
B          50       0
C          25       1
D          250      2
E         -50      -2
/*
X Y multi división
A
B
C
D
E
*/
/**Ejercicio 7- Operador Resto
System.out.println("A");
int n1 = 20;
int n2 = 2;
int n3 = n1 % n2;
System.out.println(n3);
System.out.println("B");
int n1 = 15;
int n2 = 2;
int n3 = n1 % n2;
System.out.println(n3);
System.out.println("C");
int n1 = 3;
int n2 = 20;
int n3 = n2 % n1;
System.out.println(n3);
System.out.println("D");
int n1 = 3;
int n2 = 15;
int n3 = n2 % n1;
System.out.println(n3);
Tabla para completar:*/
 
public class practica {
    public static void main (String[] args) {
      int  A1,A2,A3,B1,B2,B3,C1,C2,C3,D1,D2,D3;

      A1= 20;
      A2= 2;
      A3 = A1 % A2;
      B1=15;
      B2=2;
      B3= B1 % B2;
      C1=3;
      C2=20;
      C3= C1% C2;
      D1=3;
      D2=15;
      D3=D1 % D2;

      System.out.println(A1);
      System.out.println(A2);
      System.out.println(A3);
      System.out.println(B1);
      System.out.println(B2);
      System.out.println(B3);
      System.out.println(C1);
      System.out.println(C2);
      System.out.println(C3);
      System.out.println(D1);
      System.out.println(D2);
      System.out.println(D3);
      
    }
};
/**          n1             n2             n3
A            20              2              0
B            15              2              1
C             3             20              3
D             3             15              3
/*
n1 n2 n3
A
B
C
D
E
*/
/**
System.out.println("A");
String palabra_1 = "Hola";
String palabra_2 = "Mundo";
String frase = "";
System.out.println(palabra_1);
System.out.println(palabra_2);
System.out.println(frase);
System.out.println("B");
String frase = palabra_1 + palabra_2;
System.out.println(palabra_1);
System.out.println(palabra_2);
System.out.println(frase);
System.out.println("C");
String frase = palabra_1 + " \ t " + palabra_2;
System.out.println(palabra_1);
System.out.println(palabra_2);
System.out.println(frase);
System.out.println("D");
String frase = palabra_1 + " \ n " + palabra_2;
System.out.println(palabra_1);
System.out.println(palabra_2);
System.out.println(frase);
System.out.println("E");
String frase = palabra_1 + " \ n \ t " + palabra_2;
System.out.println(palabra_1);
System.out.println(palabra_2);
System.out.println(frase);
Tabla para completar:*/

public class practica {
    public static void main (String[] args) {
      String A1,A2,A3,B1,B2,B3,C1,C2,C3,D1,D2,D3,E1,E2,E3;

      A1= "Hola";
      A2= "Mundo";
      A3 = A1 + A2;
      B1="mi";
      B2="nombre";
      B3= B1 + B2;
      C1="Licht";
      C2="Ewig";
      C3= C1 + C2;
      D1="que";
      D2="tal?";
      D3=D1 + D2;
      E1="probando";
      E2="1,2,3";
      E3=E1 + E2;

      System.out.println(A1);
      System.out.println(A2);
      System.out.println(A3);
      System.out.println(B1);
      System.out.println(B2);
      System.out.println(B3);
      System.out.println(C1);
      System.out.println(C2);
      System.out.println(C3);
      System.out.println(D1);
      System.out.println(D2);
      System.out.println(D3);
      System.out.println(E1);
      System.out.println(E2);
      System.out.println(E3);
      
    }
};
/**    palabra_1       palabra_2             frase
A       hola            mundo              HolaMundo
B       mi               nombre            minombre
C       Licht            Ewig              LichtEwig
D        que            tal?               quetal?
E      probando         1,2,3              probando1,2,3
/*
palabra_1 palabra_2 frase
A
B
C
D
E
*/
/**Ejercicio 9 - Operadores Lógicos
System.out.println("A");
boolean n1 = true;
boolean n2 = false;
boolean n3 = !n1;
boolean n4 = !n2;
System.out.println(n3);
System.out.println(n4);
System.out.println("B");
boolean n3 = n1 & n2;
boolean n4 = n1 | n2;
System.out.println(n3);
System.out.println(n4);
System.out.println("C");
boolean n3 = !(n1 & n2);
boolean n4 = !(n1 | n2);
System.out.println(n3);
System.out.println(n4);
System.out.println("D");
boolean n3 = !n1 & n2;
boolean n4 = !n1 | n2;
System.out.println(n3);
System.out.println(n4)
Tabla para completar:*/

public class practica {
    public static void main (String[] args) {
      Boolean n1,n2,n3,n4,B1,B2,C1,C2,D1,D2;


      n1= true;
      n2= false;
      n3= !n1;
      n4= !n2;
      B1=n3 = n1 & n2;;
      B2=n4 = n1 | n2;
      C1=n3 = !(n1 & n2);
      C2=n4 = !(n1 | n2);
      D1=n3 = !n1 & n2;
      D2=n4 = !n1 | n2;   

      System.out.println(n3);
      System.out.println(n4);
      System.out.println(B1);
      System.out.println(B2);
      System.out.println(C1);
      System.out.println(C2);
      System.out.println(D1);
      System.out.println(D2);
     
    }
};
/**         n1        n2       n3           n4
A         true        false    false      false
B                              false      true
C                              true        false
D                              false       false
E
/*
n1 n2 n3 n4
A
B
C
D
E
*/
/**RESOLVER LOS SIGUIENTES ENUNCIADOS, DESARROLLANDO EL CÓDIGO
Ejercicio 10
Dados n1=5, n2=10 y n3=20. Informar:
a) n1+n2
b) n3-n1
c) n1*n3
d) n3/n2

Ejemplo:
int n1=5;
int n2=10;
System.out.println(n1+n2);
*/

public class practica {
    public static void main (String[] args) {
     int n1,n2,n3,n4,a,b,c,d;
       n1=5;
       n2=10;
       n3=20;

       a= n1+n2;
       b= n3-n1;
       c= n1*n3;
       d= n3/n2;

       System.out.println(a);//15
       System.out.println(b);//15
       System.out.println(c);//100
       System.out.println(d);//2

    }
};

/* 
Ejercicio 11
Dados n1=10, n2=20 y n3=30. Informar :
a) El total
b) El promedio
c) El resto entre n2 y n1
*/


public class practica {
    public static void main (String[] args) {
     int n1,n2,n3,n4,a,b,c;
       n1=10;
       n2=20;
       n3=30;

       a= n1+n2+n3;
       b= (n1+n2+n3)/3;
       c= n2 % n1;
      
       System.out.println(a);//60
       System.out.println(b);//20
       System.out.println(c);//0

    }
};

/*
Ejercicio 12
Dados n1=true, n2=false y n3=true. Informar :
a) n1 ^ n2
b) (n1 & !n2) | n3
c) (n1 | n2) & !n3
*/

public class practica {
    public static void main (String[] args) {
     Boolean n1,n2,n3,n4,a,b,c;
       n1=true;
       n2=false;
       n3=true;

       a= n1 ^ n2;
       b= (n1 & !n2) | n3;
       c= (n1 | n2) & !n3;
      
       System.out.println(a);//true
       System.out.println(b);//true
       System.out.println(c);//false

    }
};
/*Ejercicio 13
Declarar dos variables n1=5 y n2=10.
Utilizando concatenación entre las variables y los literales, mostrar en pantalla la siguiente 
expresión:
n1 es igual a 5,n2 es igual a 10 y n1 más n2 es igual a 15.
*/

public class practica {
    public static void main (String[] args) {
      int n1,n2,n3;
       n1= 5;
       n2=10;
       n3= n1 + n2;
      
       System.out.println("el numero 1 es igual a: ");
       System.out.println(n1);
       System.out.println("el numero 2 es igual a: ");
       System.out.println(n2);
       System.out.println("y la suma de numero 1 mas numero 2 es igual a: ");
       System.out.println(n3);

    }
};

/* 
Ejercicio 14 - Uso de constantes
Haciendo uso de la constante IVA=21,calcular el precio con iva de los siguientes productos e 
informar:
a) remera:59.90$
b) pantalón:99.90$
c) campera:149.90
*/

public class practica {
    public static void main (String[] args) {
     float a,b,c,d;
       int IVA=21;
       a= 59.90f;
       b= 99.90f;
       c= 149.90f;
       d=(a+b+c)+IVA;
      
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       System.out.println(d);

    }
};
