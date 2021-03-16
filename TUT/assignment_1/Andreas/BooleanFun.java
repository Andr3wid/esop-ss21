import java.util.Scanner;

public class BooleanFun {
    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        int alter;

        alter = scanner1.nextInt();

        // boolean-Variablen können nur den Wert "true" oder "false" besitzen
        boolean istUeber18 = alter >= 18;
        boolean istNichtNegativ = alter < 0;

        System.out.println("Der Benutzer ist über 18 Jahre alt: " + istUeber18);
        System.out.println("Der Benutzer hat ein negatives Alter angegeben: " + istNichtNegativ);
    }
}
