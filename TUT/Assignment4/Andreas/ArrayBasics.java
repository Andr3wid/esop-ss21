package Assignment4.Andreas;

import java.util.Scanner;

public class ArrayBasics {
    public static void main(String[] args) {

        // Erste Variante: Werte sind beim Anlegen des Arrays bereits bekannt
        int[] messwerte = {12, 35, 57, 112, 124, 1111};

        // Zugriff auf erstes Element
        System.out.println("Erstes Element aus 'messwerte': " + messwerte[0]);

        System.out.println("Länge des Arrays 'messwerte': " + messwerte.length);

        // Um auf das letzte Element zuzugreifen muss von messwerte.length - 1 gerechnet; ansonsten --> FEHLER
        System.out.println("Letztes Element aus 'messwerte': " + messwerte[messwerte.length - 1]);

        System.out.println("-------------------------------------");

        // Zweite Variante: Wir kennen nicht die Werte, aber die Anzahl der Werte / Länge des Arrays
        int[] messwerte2 = new int[5];

        Scanner input = new Scanner(System.in);

        // alle Indizes im Array befüllen
        for (int i = 0; i < messwerte2.length; i++) {
            System.out.println("Geben Sie einen Wert für Index " + i + " ein: ");
            messwerte2[i] = input.nextInt();
        }

        // alle Array-Einträge ausgeben
        for (int i = 0; i < messwerte2.length; i++) {
            System.out.println(i + ": " + messwerte2[i]);
        }

        // Summe aller Einträge ausrechnen
        int sum = 0;

        for (int i = 0; i < messwerte2.length; i++) {
            sum += messwerte2[i];
        }

        System.out.println("Summe des Arrays: " + sum);

    }
}
