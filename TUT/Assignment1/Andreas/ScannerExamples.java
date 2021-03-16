package Assignment1.Andreas;

import java.util.Scanner;

public class ScannerExamples {
    public static void main(String[] args) {
        String name;
        int alter;
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Bitte geben Sie ihren Namen ein: ");
        name = scanner1.nextLine();

        System.out.println("Bitte geben Sie ihren Namen ein: ");
        alter = scanner1.nextInt();

        System.out.println("Hallo " + name + " du bist " + alter + " Jahre alt.");
    }
}
