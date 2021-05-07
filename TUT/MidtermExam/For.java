package MidtermExam;

public class For {
    public static void main(String[] args) {
        System.out.println(computation(0));
        System.out.println(computation(1));
        System.out.println(computation(2));
    }

    public static int computation(int n) {
        boolean firstIteration = true;
        int result = 0;
        for (int i = 0; i < n || firstIteration; i++) {
            result = i + 1;
            firstIteration = false;
        }

        return result;
    }
}
