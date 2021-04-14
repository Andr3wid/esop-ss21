import java.util.Scanner;

public class PatternPrinting {

    public static void main(String[] args) {

        /*
            ZIEL:
            a = 6; b = 3

            * * * * * *
            * * * * * *
            * * * * * *
         */

        Scanner input = new Scanner(System.in);

        int a, b;

        System.out.println("Geben Sie Seite a ein: ");
        a = input.nextInt();

        System.out.println("Geben Sie Seite b ein: ");
        b = input.nextInt();

        // Anzahl der Zeilen
        for(int i = 1; i <= b; i++) {

            // Anzahl der Sterne pro Zeile
            for(int j = 1; j <= a; j++) {
                System.out.print("* ");
            }

            // WICHTIG: Zeilenumbruch nach jeder Zeile
            System.out.print("\n");

        }

    }
}
