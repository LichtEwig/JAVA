public class Clase02 {
    public static void main(String[] args) {
        // Comentarios de una sola sola linea
        // El usuario final no puede ver este comentario

        /*
         * Bloque
         * de
         * comentarios
         * El usuario final no puede ver este comentario
         */

        // TODO tarea pendiente

        /**
         * Comentario JAVA DOC.
         * El usuario final puede ver este comentario.
         * Este comentario, debe colocarse delante de la declaración
         * de método o clase.
         */

        // Lenguajes de tipado fuerte: C C++ C# java visualbasic typescript

        // Lenguajes de tipado debil: php javascript python

        /*
         * Memoria RAM: Volatil Costo alto Veloz
         * 
         * Disco Duro: Persistente Costo bajo Lento
         * 
         */

        int a; // Declaración de variable
        a = 2; // Asignación de valor//Declaración de variable
        System.out.println(a);

        int b = 4; // Declaración y asignación de valor
        System.out.println(b);

        int c = a + b; // 6
        System.out.println(c);

        // declaración y asignación multiple
        int d = 8, e = 65, f = 35, g = 46;

        // Una variable solo puede tener una declaración,
        // pero puede tener infinitas asignaciones de valor.

        // int a=5; //Error variable ya declarada
        a = 65;
        a = 72;
        a = 8;
        System.out.println(a);

        // Identificador: es el nombre de las cosas (Clase - Método - Variable o
        // Constante)
        // Un nombre de identificador puede tener letras, simbolos ($ _) números (0 al
        // 9)
        // Un nombre de identificador no puede iniciar con un número

        // identificadores validos
        int _num1 = 0;
        int _1num = 0;
        int $num1 = 0;
        int num$1 = 0;
        int valor_temperatura;

        // Variables en minusculas
        int temperatura = 40;
        int TEMPERATURA = 40; // patrón no valido

        // Constantes en mayusculas
        final int TEMP = 40; // patrón valido
        final int temp = 40; // patrón no valido

        temperatura++;
        temperatura = temperatura + 1;
        // TEMP++; //Error es una constante

        // Indetificadores con Camel Case (letra camello) (Valido)
        int valorTemperatura = 80;

        // identificadores no validos
        // int 1num;
        // int %num;
        // int &num;
        // int ++num;
        // int num++;
        // int num num;

        // Literal
        // 1000 literal que representa un número entero
        // 1000L literal que representa un número long
        // "Hola" String
        // "a" String
        // 'a' char
        // 3.45 double
        // 3.45d double
        // 4.45f float
        // true false boolean

        // Tipo de datos enteros

        // Tipo de datos boolean 1 byte
        boolean bo = true; // 1
        System.out.println(bo); // true
        bo = false; // 0
        System.out.println(bo);

        /*
         * boolean bo=true;
         * 
         * 10000000
         * --------
         */

        // Tipo de datos byte (signed) 1 byte
        byte by = 100;
        System.out.println(by); // 100

        /*
         * byte by=100;
         * 
         * 
         * |--------|--------|
         * -128 0 127
         * 
         * byteU by=100; //Java no tiene tipos primitivos unsigned
         * 
         * |-----------------|
         * 0 255
         * 
         */

        // Tipo de datos short 2 bytes
        short sh = 20000;
        System.out.println(sh);

        // Tipo de datos int 4 bytes
        int in = 2000000000;
        System.out.println(in);

        // Tipo de datos long 8 bytes
        long lo = 3000000000L;

        // Tipo de datos char 2 bytes (unicode) (unsigned)
        char ch = 70;
        System.out.println(ch);
        ch += 32;
        System.out.println(ch);
        ch = 'a';
        System.out.println(ch);
        ch -= 32;
        System.out.println(ch);

        // Tipo de datos de punto flotante

        // Tipo de datos float 32 bits
        float fl = 2.45f;
        System.out.println(fl);

        // Tipo de datos double 64 bits
        double dl = 2.45;
        double dl2 = 2.45d;
        double DL = 2.45; // mala práctica
        System.out.println(dl);

        fl = 1;
        dl = 1;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        fl = 10;
        dl = 10;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        fl = 100;
        dl = 100;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        fl = 1000;
        dl = 1000;

        System.out.println(fl / 3);
        System.out.println(dl / 3);

        // Clase String
        String st = "HOLA";
        System.out.println(st);
        /*
         * Java 9 o inferior final char[] value 8 bytes
         * Java 10 o superior final byte[] value 4 bytes
         */

        // Tipo de datos Var Java 9 o sup.
        var v1 = 2; // int
        v1 = 8;
        // v1="8"; //error tipo incorrecto
        var v2 = true; // boolean
        var v3 = '3'; // char
        var v4 = 2L; // long
        var v5 = "3"; // String
        var v6 = 4.25; // double
        var v7 = 4.25d; // double
        var v8 = 4.25f; // float

        x(1);
        x(true);
        x(1L);
        x('1');
        x("1");
        x(1.1);
        x(1.1d);
        x(1.1f);

        // Recorrido de un String
        String texto = "Esto es una cadena de texto!";
        System.out.println(texto);

        // Recorrido de vector de variable texto
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            // código indentado
        }
        System.out.println();

        // TODO Recorrer el vector en mayusculas

        // TODO Recorrer el vector en minusculas

        // Clase BigDecimal

        // TODO tema pendiente Vector args

    }// end main

    public static void x(int x) {
        System.out.println("int");
    }

    public static void x(boolean x) {
        System.out.println("boolean");
    }

    public static void x(float x) {
        System.out.println("float");
    }

    public static void x(double x) {
        System.out.println("double");
    }

    public static void x(char x) {
        System.out.println("char");
    }

    public static void x(long x) {
        System.out.println("long");
    }

    public static void x(String x) {
        System.out.println("String");
    }

}// end class