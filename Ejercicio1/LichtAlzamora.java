/**Ejercicio 1
- Crear un programa en que se declare una variable de tipo boolean, otra de tipo byte, otra de tipo int 
otra de tipo long, otra de tipo float, y otra de tipo String. Luego asignarle valor a cada variable e 
imprimirlas.
Nota: usar identificadores de solo dos letras.
Ejemplo: int in=8;
System.out.println(in);*/

 public class clase1 {
    public static void main(String[] args){
        byte En= 110;
     System.out.println(En);
    
        String Sh="hola";
     System.out.println(Sh);
    

        long Lo= 400000000;
     System.out.println(Lo);
    
 
        float Fl= 8.2f;
     System.out.println(Fl);
    

         int In= 3000000;
     System.out.println(In);
    
 

         boolean bo= true;
     System.out.println(bo);
    
 

 


/**- Agregar al programa 5 variables de tipo var (JDK 10 o sup.) y asignarle valores boolean, int, float, 
long, String y luego imprimirlas.
Nota: tener en cuenta en las variables var la literal infiere en el tipo de datos.
Ejemplo: var var1=8;
System.out.println(var1);*/

      var var1 = "hi";
      System.out.println(var1);//string

     var var2= 100000000;
     System.out.println(var2);//long

     var var3 = 15.6;
     System.out.println(var3);//float

      var var4 = 100;
     System.out.println(var4);//int

     var var5 = false;
     System.out.println(var5);//boleano
    

    


/**- Reasignar valor a 4 de las variables y luego reimprimirlas.
Ejemplo: in=26;
System.out.println(in);
- Comentariar cada una de las declaraciones de variables indicando el tipo de datos de la misma.
Ejemplo: in=26; //variable entera*/

     var var6 = "hi";
     var6 = "hello";
     System.out.println(var1);//string

     var var7= 100000000;
     var7 = 700000000;
     System.out.println(var2);//long

     var var8 = 15.6;
     var8 = 18.5;
     System.out.println(var3);//float

     var var9 = 100;
     var9 = 120;
     System.out.println(var4);//int

  }
}