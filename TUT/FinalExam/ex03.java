package FinalExam;

public class ex03 {

    public static void main(String[] args) {
        String pattern = "[,0-9;]*";

        System.out.println("8".matches(pattern));
        System.out.println("".matches(pattern));
        System.out.println("4-8".matches(pattern));
        System.out.println(",1-2;".matches(pattern));
        System.out.println(",.;:".matches(pattern));
        System.out.println(",12;".matches(pattern));
        System.out.println(";;;;;;".matches(pattern));
        System.out.println("AB".matches(pattern));
        System.out.println("493455".matches(pattern));
    }
}
