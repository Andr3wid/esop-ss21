package Assignment11.Andreas.CustomDataStructure;

public class StackNode {
    private String value;
    private StackNode underlyingElement;

    public StackNode(String value, StackNode underlyingElement) {
        this.value = value;
        this.underlyingElement = underlyingElement;
    }

    public String getValue() {
        return value;
    }

    public StackNode getUnderlyingElement() {
        return underlyingElement;
    }

    public void setUnderlyingElement(StackNode node) {
        this.underlyingElement = node;
    }
}
