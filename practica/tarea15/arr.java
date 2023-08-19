Package tarea15;
import java.util.Arrays;
public class arr {
    public static void main(String[] args) {
        // Crea dos arrays de 10 enteros, cada uno ordenado en orden ascendente.
        int[] array1 = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};
        int[] array2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        // Fusiona los dos arrays en un tercer array, ordenado en orden ascendente.
        int[] mergedArray = merge(array1, array2);
        // Imprime el array fusionado.
        System.out.println(Arrays.toString(mergedArray));
    }
    private static int[] merge(int[] array1, int[] array2) {
        // Crea un nuevo array para almacenar los resultados de la fusión.
        int[] mergedArray = new int[array1.length + array2.length];
        // Índices para los dos arrays de entrada y el array fusionado.
        int i = 0;
        int j = 0;
        int k = 0;
        // Itera a través de los dos arrays de entrada, comparando los elementos en cada índice.
        while (i < array1.length && j < array2.length) {
            if (array1[i] < array2[j]) {
                mergedArray[k] = array1[i];
                i++;
            } else {
                mergedArray[k] = array2[j];
                j++;
            }
            k++;
        }
        // Copia los elementos restantes del primer array de entrada, si los hay.
        while (i < array1.length) {
            mergedArray[k] = array1[i];
        }
    }
}