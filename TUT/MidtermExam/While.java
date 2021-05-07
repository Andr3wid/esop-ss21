package MidtermExam;

public class While {
    public static void main(String[] args) {
        // a)
        int[] array = new int[]{1, 2, 3, 4, 5};

        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        // b)
        array = new int[]{1, 2, 3, 4, 5};

        int n = 4;
        int k = 1;
        int i = 1;
        do {
            k = k * i;
            i = i + 2;
        } while (i < n);
    }
}
