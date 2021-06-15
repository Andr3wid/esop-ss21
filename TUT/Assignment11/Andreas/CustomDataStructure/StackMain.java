package Assignment11.Andreas.CustomDataStructure;

public class StackMain {
    public static void main(String[] args) {
        Stack ourStack = new Stack();

        ourStack.push("hello");
        ourStack.push("data structure");
        ourStack.push("value 3");

        System.out.println("Stack size: " + ourStack.getSize());

        String poppedElement = ourStack.pop();
        System.out.println("Popped element: " + poppedElement);

        System.out.println("New stack size: " + ourStack.getSize());
    }
}
