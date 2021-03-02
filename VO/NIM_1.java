// NIM-Spiel: Minimalvariante

import java.util.Scanner;

public class NIM_1 {
    static Scanner in = new Scanner(System.in);
    public static void main (String[] args) {
        int number = 17;
        int maxTake = 3;

        System.out.println("Wir spielen mit " + number + " Hölzern – es müssen jeweils 1-" 
                           + maxTake + " weggenommen werden.");

        // Es wird "gewürfelt", wer beginnen darf:
        boolean computersTurn = Math.random() < 0.5; // 0 <= Math.random() < 1
        if (computersTurn)
            System.out.println("Ich beginne.");
        else // Mensch ist am Zug
            System.out.println("Sie beginnen.");

        
      while (number > 0) { // die einzelnen Spielrunden
            // Gibt number Stück Streichhölzer auf der Konsole aus
            for (int i=1; i<=number; i++) {
                System.out.print("|");
                if (i % 5 == 0)
                    System.out.print(" ");
            }
            System.out.println();

            if (number < maxTake)
                maxTake = number; // Man kann nicht mehr nehmen als da ist
            int take; // Anzahl der wegzunehmenden Hölzer
            if (computersTurn) {
                if (number <= maxTake) // es sind höchstens soviele Hölzer im Spiel wie man nehmen kann
                    take = number; // Computer nimmt alle (und gewinnt)!
                else { // Normalfall
                    take = number % (maxTake+1); // Bei max. 3 Hölzern pro Zug wird z.B. versucht, 
                           // dem menschlichen Spieler eine durch 4 teilbare Hölzerzahl zu hinterlassen
                    if (take == 0) // Leider wurde dem Computer selbst eine bereits durch maxTake+1 
                                   // teilbare Zahl präsentiert
                        take = (int) (Math.random() * maxTake) + 1; // Computer "würfelt"
                }
                System.out.println("Ich nehme " + take + " Hölzer.");
            } else { // Mensch ist am Zug
                System.out.print("Ihr Zug (1-" + maxTake + "): ");
                take = in.nextInt();
            }

            number -= take; // number = number - take;
            computersTurn = !computersTurn; // Wechsel des aktiven Spielers
        }
        if (computersTurn)
            System.out.print("Sie haben");
        else
            System.out.print("Ich habe");
        System.out.println(" gewonnen.");
    }
}
