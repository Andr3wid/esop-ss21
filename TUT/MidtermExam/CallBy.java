package MidtermExam;

import java.util.Arrays;

public class CallBy {
    public static void main(String[] args) {
        int[] array = new int[]{0, 1, 2, 3, 4};
        int value = 1;

        int[] error = new int[0];
        // char - primitiv -> call by value
        // String - Klasse -> Objekt -> call by reference
        addTo(error, value);

        System.out.println("Before: " + Arrays.toString(array));
        System.out.println("Before: " + value);
        addTo(array, value);
        System.out.println("After: " + Arrays.toString(array));
        System.out.println("After: " + value);
        System.out.println();

        System.out.println("Before: " + Arrays.toString(array));
        System.out.println("Before: " + value);
        addTo(array, value);
        System.out.println("After: " + Arrays.toString(array));
        System.out.println("After: " + value);
    }

    public static void addTo(int[] array, int value) {
        if (array == null || array.length == 0) {
            System.out.println("fehler");
        } else {
            for (int i = 0; i < array.length; i++) {
                array[i] += value;

                value *= 2;
            }
        }
    }
}
