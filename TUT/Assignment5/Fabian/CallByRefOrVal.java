package Assignment5.Fabian;

import java.util.Arrays;

/*********************************
 Created by Fabian Oraze on 21.04.21
 *********************************/

public class CallByRefOrVal {

    public static void main(String[] args) {

        int value = 100;
        int[] arrValues = {10, -20, -30, 0, 40};

        System.out.println("----Call by Value-----");
        printDoubleValues(value);
        System.out.println(value);

        value = getDoubleValue(value);
        System.out.println(value);

        System.out.println("----Call by Reference-----");
        printDoubleValues(arrValues);
        System.out.println(Arrays.toString(arrValues));

        System.out.println("----Copied array into new one-----");
        int[] myNewDoubleValueArr = createHalfValues(arrValues);
        System.out.println(Arrays.toString(myNewDoubleValueArr));
        System.out.println(Arrays.toString(arrValues));
    }

    public static int getDoubleValue(int paramValue) {
        paramValue = paramValue * 2;
        return paramValue;
    }


    public static void printDoubleValues(int paramValue) {
        paramValue = paramValue * 2;
        System.out.println(paramValue);
    }

    public static void printDoubleValues(int[] paramValues) {
        for (int i = 0; i < paramValues.length; i++) {
            paramValues[i] = paramValues[i] * 2;
        }
        System.out.println(Arrays.toString(paramValues));
    }

    // only create double when num is not negative
    public static int[] createHalfValues(int[] paramValues) {
        int[] valuesDouble = new int[paramValues.length];
        for (int i = 0; i < paramValues.length; i++) {
            int indexValue = paramValues[i];
            if (indexValue > 0) {
                valuesDouble[i] = indexValue / 2;
            }
        }
        return valuesDouble;
    }

}
