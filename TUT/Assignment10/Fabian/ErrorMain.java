package Assignment10.Fabian;

import java.util.Scanner;

public class ErrorMain {

    public static void main(String[] args) {
        saveFeverDataToDatabase();
    }

    public static void saveFeverDataToDatabase() {
        Scanner feverScanner = new Scanner(System.in);
        int feverPatient = feverScanner.nextInt();
        try {
            feverTest(feverPatient);
        } catch (IllegalFeverException | NoFeverAtAllException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saving data to database...");
    }

    public static void feverTest(int amountFever) throws IllegalFeverException, NoFeverAtAllException {
        //amountFever is allowed only between 35 and 44
        if (amountFever < 35 || amountFever > 44) {
            throw new IllegalFeverException("Fever with value = " + amountFever + " is not valid!");
        } else if (amountFever == 36) {
            //normal temperature
            throw new NoFeverAtAllException();
        } else {
            System.out.println("Patient has = " + amountFever + "° fever");
        }
    }
}
