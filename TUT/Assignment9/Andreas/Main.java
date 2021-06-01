package Assignment9.Andreas;

public class Main {
    public static void main(String[] args) {

        Horse h1 = new Horse("Bob", "brown", 10, 40);
        Horse h2 = new Horse("Susi", "white", 12, 32);
        Horse h3 = new Horse("Samantha");
        Horse h4 = new Horse();

        h1.setIsARaceHorse(true);

        System.out.println(h1.toString());

    }
}
