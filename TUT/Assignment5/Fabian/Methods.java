package Assignment5.Fabian;

import java.util.Arrays;

/*********************************
 Created by Fabian Oraze on 21.04.21
 *********************************/

public class Methods {

    public static void main(String[] args) {

        int[] numArr = {2, 3, 5, 6, 10, 30};
        int divider = 3;

        int[] dividers = getDividerArr(numArr, divider);
        System.out.println(Arrays.toString(dividers));
    }

    public static int[] getDividerArr(int[] numArr, int divider) {
        int arrNewLen = 0;
        if (numArr == null) return new int[0];

        for (int i = 0; i < numArr.length; i++) {
            arrNewLen += (numArr[i] % divider == 0) ? 0 : 1;
        }

        int[] dividerArr = new int[arrNewLen];
        int indexDividers = 0;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % divider != 0) {
                dividerArr[indexDividers] = numArr[i];
                indexDividers++;
            }
        }

        return dividerArr;
    }


}
