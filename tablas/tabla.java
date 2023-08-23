package tablas;

/*crear una tabla bidimmensional de tamaño 5x5 rellenarla de la siguiente forma: la posicion T[n,m] debe contener n+m despues se debe mostrar su contenido
*/

public class tabla {
    public static void main(String[] args) {
        int[][] tabla = new int[5][5];
        
        // Rellenar la tabla con la suma de las posiciones
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tabla[i][j] = i + j;
            }
        }
        
        // Mostrar el contenido de la tabla
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tabla[i][j] + " ");
            }
            System.out.println();
        }
    }
}