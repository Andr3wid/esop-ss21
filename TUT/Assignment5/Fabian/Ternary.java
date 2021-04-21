package Assignment5.Fabian;

import java.util.Scanner;

/*********************************
 Created by Fabian Oraze on 21.04.21
 *********************************/

public class Ternary {

    public static void main(String[] args) {

        int number = 368;
        System.out.println(isDivider(number, 8));

        Scanner myScanner = new Scanner(System.in);
        int num = myScanner.nextInt();

        //check what the absolute value of the num is
        int abs = (num < 0) ? num * -1 : num;
        System.out.println(abs);
    }

    public static boolean isDivider(int number, int divider) {
        boolean isDivider;
        isDivider = (number % divider == 0) ? true : false;
        // isDivider = number % divider == 0; simpler solution without ternary operator
        return isDivider;
    }


}
