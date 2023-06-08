//  ejercicio3 – Operadores Booleanos
// Analice el código a continuación y complete la tabla correspondiente. Luego realice la codificación 
// para confirmar que ha completado la tabla correctamente.
//  System.out.println("A");
//  int x = 10;
//  int y = 20;
//  boolean log1 = x==y;
//  boolean log2 = x!=y;
//  System.out.println(log1);
//  System.out.println(log2);
//  System.out.println("B");
//  log1 = (x+=5) == (y-=5);
//  log2 = x == y;
//  System.out.println(log1);
//  System.out.println(log2);
//  System.out.println("C");
//  log1 =! log1;
//  log2 =!! log2;
//  System.out.println(log1);
//  System.out.println(log2);
//  System.out.println("D");
//  log1 = log1 || log2;
//  log2 =!log1 && log2;
//  System.out.println(log1);
//  System.out.println(log2);
//  System.out.println("E");
//  log1 = log2 && x!=15;
//  log1 = y == 10+5;
//  System.out.println(log1);
//  System.out.println(log2);
//          Tabla para completar:
//           log1          log2
//     A         false          true
//     B         true           true
//     C         false          true
//     D         true           true
//     E         false          true



public class tarea3 {
     public static void main (String[] args) {

      boolean  A1,A2,B1,B2,C1,C2,D1,D2,E1,E2;
      
      int x = 10;
      int y = 20;

     A1= x==y;
     A2= x!=y;
   
     System.out.println(A1);
     System.out.println(A2);

     B1 = (x+=5) == (y-=5);
     B2= x == y;
     System.out.println(B1);
     System.out.println(B2);
    
     C1 =! B1;
     C2=!! B2;
     System.out.println(C1);
     System.out.println(C2);
    
     D1 = A1 || A2;
     D2 =!A1 && A2;
     System.out.println(D1);
     System.out.println(D2);
     
     E1 = D2 && x!=15;
     E2 = y == 10+5;
     System.out.println(E1);
     System.out.println(E2);
     }
  };


