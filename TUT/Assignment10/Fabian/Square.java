package Assignment10.Fabian;

public class Square implements Shape {

    private double siteLength;

    public Square(double siteLength) {
        this.siteLength = siteLength;
    }

    @Override
    public String shapeName() {
        return "I am a square";
    }

    @Override
    public double area() {
        return siteLength * siteLength;
    }
}
