package MidtermExam;

import java.util.Arrays;

public class ArraysSimple {
    public static void main(String[] args) {
        double[] a = new double[]{1.5, 2.0, 3.5, 4.0};
        double[] b = new double[]{0.5, 1.5, 1.5, 3.0};

        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        System.out.println();
        System.out.println(Arrays.toString(vectorSubtraction(a,b)));
    }

    public static double[] vectorSubtraction(double[] a, double[] b) {
        if (a == null || b == null || a.length != b.length) {
            double[] error = new double[0];
            return error;
        }

        double[] diff = new double[a.length];
        for (int i = 0; i < a.length; i++) {
            diff[i] = a[i] - b[i];
        }

        return diff;
    }
}
