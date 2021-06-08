package Assignment10.Andreas.exceptions;

import Assignment10.Andreas.beverages.Tea;

import java.io.IOException;

public class ExceptionTests {
    public static void main(String[] args) {

        int a = 100;
        int b = 0;

        // "tries" to execute a code block and jumps into the catch-block if an exception occurs
        try {
            System.out.println(a/b);
        } catch(Exception e) {
            System.out.println("There was an error while trying to divide a and b. Details:");

            // prints detailed error information
            // e.printStackTrace();
        }

        System.out.println("I get printed after the calculation");

        int[] arr = new int[3];

        try {
            System.out.println("Index 5: " + arr[5]);
        } catch(Exception e) {
            System.out.println("Error while trying to access the array index");
        }

        Tea veryColdTea = new Tea();

        try {
            veryColdTea.cooldown(200);
        } catch(BeverageTooColdException e) {
            e.printStackTrace();
        }

    }
}
