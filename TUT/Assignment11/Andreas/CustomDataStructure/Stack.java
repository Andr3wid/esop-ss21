package Assignment11.Andreas.CustomDataStructure;

public class Stack {

    private StackNode top;
    private int size;

    public Stack() {
        size = 0;
        top = null;
    }

    public void push(String val) {
        StackNode newTop = new StackNode(val, top);
        top = newTop;
        size++;
    }

    public String pop() {
        if(size == 0) {
            throw new IllegalStateException("The stack is empty");
        }

        StackNode poppedElement = top;
        top = top.getUnderlyingElement();
        size--;
        return poppedElement.getValue();
    }

    public int getSize() {
        return this.size;
    }

}
