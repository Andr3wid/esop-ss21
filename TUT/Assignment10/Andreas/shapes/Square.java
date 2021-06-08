package Assignment10.Andreas.shapes;

public class Square implements IShape {
    private double a;

    public Square(double a) {
        this.a = a;
    }

    @Override
    public double getArea() {
        return a*a;
    }

    @Override
    public double getPerimeter() {
        return 4*a;
    }

    // GETTER and SETTER section
    public void setA(double a) {
        this.a = a;
    }

    public double getA() {
        return this.a;
    }
}
