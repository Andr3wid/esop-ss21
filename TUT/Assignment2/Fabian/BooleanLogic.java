package Assignment2.Fabian;

import java.util.Scanner;

/*********************************
 Created by Fabian Oraze on 17.03.21
 *********************************/

public class BooleanLogic {

    public static void main(String[] args) {

        int base = 100;
        int divisor = 20;
        int remain = base % divisor;
        boolean isRealDivisor = (remain == 0); // watch out for "==" ! not same as "="

        Scanner boolScanner = new Scanner(System.in);

        System.out.print("Is student inscribed: ");
        boolean inscribed = boolScanner.nextBoolean();

        System.out.print("\nIs student ready for test: ");
        boolean readyForTest = boolScanner.nextBoolean();

        // 50 points for pass
        System.out.print("\nReached points: ");
        int testPoints = boolScanner.nextInt();

        if (inscribed) {
            if (readyForTest) {
                if (testPoints == 100) {
                    System.out.println("Student was excellent!! 100 points!");
                } else if (testPoints >= 50) {
                    System.out.println("Student has passed the exam!");
                } else {
                    System.out.println("Student had less than 50 points! NO PASS!");
                }
            } else {
                System.out.println("Student was not ready!");
            }
        } else {
            System.out.println("Student is not even inscribed!!");
        }

        if (inscribed && readyForTest && testPoints >= 50) {
            System.out.println("Same as above");
        }

    }


}
