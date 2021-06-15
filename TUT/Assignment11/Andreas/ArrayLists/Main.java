package Assignment11.Andreas.ArrayLists;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        int a = 100;
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 10;
        arr[2] = 10;
        arr[3] = 10;
        arr[4] = 100;

        // Creating and populating an ArrayList
        ArrayList<String> ourArrayList = new ArrayList();
        ourArrayList.add("Hello");
        ourArrayList.add("my");
        ourArrayList.add("Friends");

        // printing a single element
        System.out.println("First element: " + ourArrayList.get(0));

        // iterating over an ArrayList

        // possibility with a while-loop
        System.out.println("--- CLASSIC WHILE LOOP ---");
        int counter = 0;
        while(counter < ourArrayList.size()) {
            System.out.println(counter + ": " + ourArrayList.get(counter));
            counter++;
        }

        // possibility with a foreach-loop
        System.out.println("--- FOREACH LOOP ---");
        for(String currentString : ourArrayList) {
            System.out.println(currentString);
        }

        // delete element
        ourArrayList.remove(1);
        System.out.println("--- AFTER DELETING ---");
        for(String str : ourArrayList) {
            System.out.println(str);
        }

    }
}
