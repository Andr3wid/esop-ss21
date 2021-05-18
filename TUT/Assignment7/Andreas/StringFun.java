package Assignment7.Andreas;

import java.util.Scanner;

public class StringFun {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = "Andreas";
        String sentence = "I like pancakes, pizza and salami";

        System.out.println("Entered String: " + name);

        // get the length of a String
        int lengthOfString = name.length();
        System.out.println("Length: " + lengthOfString);

        // get character on a specific position
        char firstCharacter = name.charAt(0);

        char lastCharacter = name.charAt(name.length()-1); // dynamically calculate the last character index
        System.out.println("First character: " + firstCharacter + " | Last character: " + lastCharacter);

        // extract a subset of the String (namely the first 3 characters)
        // first parameter: start-index in the string (inclusive)
        // second parameter: end-index of the string (exclusive)
        // example name.substring(0,3) only extracts positions 0,1,2 because the 3 is exclusive
        String firstThreeChars = name.substring(0, 3);
        System.out.println("Extracted substring: " + firstThreeChars);

        // we can search for the index of a word in a String
        // when word found -> returns the index of the first letter of the word
        // when word not found -> returns -1
        System.out.println("Please enter a word to search: ");
        String wordToFind = scanner.nextLine();
        int foundIndex = sentence.indexOf(wordToFind); // search for the word entered by the user in the sentence-String

        // if the string has been found, the foundIndex cannot be -1
        if(foundIndex != -1) {
            System.out.println("Word found starting at position " + foundIndex);
        } else {
            System.out.println("The word '" + wordToFind + "' has not been found");
        }

        // StringBuilders are used to dynamically concatenate Strings
        // Strings in Java are immutable; therefore a String has to be "destroyed" and "rebuilt" when it's changed
        StringBuilder builder = new StringBuilder();

        builder.append("Hello");
        builder.append(" dear");
        builder.append(" fellow students!");

        System.out.println("Normal output of the StringBuilder: " + builder);
        System.out.println("Reversed output of the StringBuilder: " + builder.reverse());
    }
}
