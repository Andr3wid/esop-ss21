package FinalExam;

import java.util.Arrays;

public class ex02 {

    public static void main(String[] args) {
        String input = "Andreas Kogler, Fabian Oraze, Timo Tabertshofer";
        System.out.println(Arrays.deepToString(stringSplit(input)));
    }

    private static String[][] stringSplit(String input) {
        String[] firstSplit = input.split(",");
        String[][] fullSplit = new String[firstSplit.length][];

        for (int i = 0; i < firstSplit.length; i++) {
            fullSplit[i] = firstSplit[i].trim().split(" ");
        }

        return fullSplit;
    }

}
