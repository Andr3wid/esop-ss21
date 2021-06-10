package Assignment10.Fabian;

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String shapeName() {
        return "I am a circle!!";
    }

    @Override
    public double area() {
        return radius * radius * Math.PI;
    }
}
