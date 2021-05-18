package Assignment7.Andreas;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexStuff {
    public static void main(String[] args) {
        /*
            Important regex chars:
            . --- matches any char
            [xyz] --- set definition, matches x or y or z
            [abc][12] --- matches a or b or c followed by 1 or 2
            hello --- matches the word hello
            ^ --- beginning of line
            $ --- end of line

            Meta characters:
            \d --- any digit
            \s --- any whitespace
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bitte geben Sie ihre Hausnummer ein: ");
        String searchString = scanner.nextLine();

        Pattern p = Pattern.compile("\\d+[abc]");
        Matcher m = p.matcher(searchString);

        System.out.println(m.find());
    }
}
