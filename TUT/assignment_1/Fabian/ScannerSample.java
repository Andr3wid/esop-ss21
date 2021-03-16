package Assignment1.Fabian;

import java.util.Scanner;

/*********************************
 Created by Fabian Oraze on 10.03.21
 *********************************/

public class ScannerSample {


    public static void main(String[] args) {


        int num1 = 123948;
        int divisor = 4;

        int moduloResult = num1 % divisor;
        System.out.println(moduloResult);

        System.out.println(100/5);
        System.out.println(100%5);


        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 1;
        arr[2] = 50;
        arr[3] = 10;
        arr[4] = 2;

        int[] arr2 = {1, 2, 3, 4};

        String[] myStringArr = new String[2];

        String welcomeMsg = "Welcome to the ESOP TUT!!";

        System.out.println(welcomeMsg.charAt(4));

        System.out.println(welcomeMsg);
        System.out.println(welcomeMsg);

        double dub = 123.324;
        float numFloat = 123.324f;

        byte numByte = 102;
        short numShort = 12;
        int numNum = 100;
        long numLong = 100L;

        char cara = 'c';

        boolean bool = false;

        System.out.println(dub - numNum);

        Scanner myScanner = new Scanner(System.in);

        String myName = myScanner.next();
        int myNum = myScanner.nextInt();

        System.out.println("My name is: " + myName + " and my number is: " + myNum);
        myScanner.close();

    }


}
