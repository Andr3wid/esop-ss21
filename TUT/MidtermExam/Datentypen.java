package MidtermExam;

public class Datentypen {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        char c = 'h';
        String d = "hello world 123";

        boolean b1 = (a > 3) && !(b > a) && c > 'a';
        boolean b2 = a < Integer.parseInt(d.substring(d.length() - 1));
        boolean b3 = c != d.substring(0).toCharArray()[0];
        boolean b4 = !!!!!!!!!b2 || b3;
        String s = d.replace(c, 'c');
        
        System.out.println("b1=" + b1 + " b2=" + b2 + " b3=" + b3 + " b4=" + b4);
        System.out.println(s);
    }
}
