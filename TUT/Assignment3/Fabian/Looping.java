package Assignment3.Fabian;

import java.util.Scanner;

/*********************************
 Created by Fabian Oraze on 24.03.21
 *********************************/

public class Looping {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Put in the lower bound: ");
        int lower = myScanner.nextInt();

        System.out.println("Put in the upper bound: ");
        int upper = myScanner.nextInt();

        if (lower < upper) {
            for (int i = lower; i <= upper; i++) {
                System.out.print(i);
            }
        } else {
            System.out.println("Upper bound should be higher than lower bound");
        }

    }


}
