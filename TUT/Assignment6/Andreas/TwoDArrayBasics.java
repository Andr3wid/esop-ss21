package Assignment6.Andreas;

import java.util.Arrays;
public class TwoDArrayBasics{
    public static void main(String[] args) {
        int[][] arr = {
                {1,2,3,4},
                {5,6,7,8,8},
                {-3,5,13}
        };

        System.out.println("Anzahl der Zeilen: " + arr.length);
        System.out.println("Anzahl Spalten / Elemente zweite Zeile: " + arr[1].length);

        int totalElements = 0;
        // iteriert über Zeilen
        for(int i = 0; i < arr.length; i++) {
            // iteriert über Spalten oder Elemente in einer Zeile
            for(int j = 0; j < arr[i].length; j++) {
                totalElements++;
            }
        }

        System.out.println("Gesamtanzahl an Elementen: " + totalElements);

        System.out.println("================================");
        int[] ourFirstColumn = getFirstColumn(arr);
        System.out.println("Erste Spalte: " + Arrays.toString(ourFirstColumn));

    }

    /**
     * Grabs the first column of a 2D array.
     * @param arr Input 2D array
     * @return first column as a 1D array
     */
    static int[] getFirstColumn(int[][] arr) {
        int[] result = new int[arr.length];

        int idxCounter = 0;
        for(int i = 0; i < arr.length; i++) {
            result[idxCounter] = arr[i][0];
            idxCounter++;
        }

        return result;
    }
}
