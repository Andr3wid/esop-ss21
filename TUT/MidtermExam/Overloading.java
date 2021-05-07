package MidtermExam;

import java.util.Arrays;

public class Overloading {
    public static void main(String[] args) {
        int[] numbers = new int[]{9, 45, 3, -5, 8, 2, -34, 5, 4, 6};
        System.out.println(Arrays.toString(numbers));
        sortArray(numbers);
        System.out.println(Arrays.toString(numbers));
        System.out.println();

        numbers = new int[]{9, 45, 3, -5, 8, 2, -34, 5, 4, 6};
        System.out.println(Arrays.toString(numbers));
        sortArray(numbers, true);
        System.out.println(Arrays.toString(numbers));
    }

    public static void sortArray(int[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        int temp;
        boolean swapped = true;
        while (swapped) {
            swapped = false;

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                    swapped = true;
                }
            }
        }
    }

    public static void sortArray(int[] array, boolean revert) {
        sortArray(array);

        if (revert) {
            int temp;
            for (int i = 0; i < array.length / 2; i++) {
                temp = array[i];
                array[i] = array[(array.length - 1) - i];
                array[(array.length - 1) - i] = temp;
            }
        }
    }
}
