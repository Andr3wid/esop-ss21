package MidtermExam;

import java.util.Arrays;

public class While {
    public static void main(String[] args) {
        // a)
        int[] array = new int[5];

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        System.out.println(Arrays.toString(array));

        array = new int[5];

        int i = 0;
        while (i < array.length) {
            array[i] = i;

            i++;
        }
        System.out.println(Arrays.toString(array));

        // b)
        array = new int[]{1, 2, 3, 4, 5};

        int n = 4;
        int k = 1;
        i = 1;
        do {
            k = k * i;
            i = i + 2;
        } while (i < n);
        System.out.println("i: " + i + ", k: " + k);

        n = 4;
        k = 1;
        i = 1;
        boolean firstIteration = true;
        while (i < n || firstIteration) {
            k = k * i;
            i = i + 2;
            firstIteration = false;
        }
        System.out.println("i: " + i + ", k: " + k);
    }
}
