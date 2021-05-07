package MidtermExam;

public class Switch {
    public static void main(String[] args) {
        System.out.println(f(6));
        System.out.println();

        System.out.println(f(7));
        System.out.println();

        System.out.println(f(8));
    }

    public static int f(int n) {
        if (n < 0) return -1;

        n = n % 3;
        switch (n) {
            case 0:
                n++;
            case 1:
                n++;
                break;
            case 2:
                n = 0;
        }

        return n;
    }

    public static int fIfElse(int n) {
        return -1;
    }
}
