package FinalExam;

public class ex01 {

    public static void main(String[] args) {
        String result = reverse("I use Arch by the way");
        System.out.println(result);
    }

    public static String reverse(String s) {
        if (s.length() > 0) return reverse(s.substring(1)) + s.charAt(0);
        else return s;
    }

}
