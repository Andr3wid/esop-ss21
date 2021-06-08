package Assignment10.Andreas.exceptions;

/*
    Triggered when a beverage cools down below 0C
 */
public class BeverageTooColdException extends Exception {
    public BeverageTooColdException() {
        System.out.println("The beverage went too cold");
    }
}
