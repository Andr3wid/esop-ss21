package Assignment10.Fabian;

public class Main {

    public static void main(String[] args) {

        Shape myCircle = new Circle(4);
        Shape mySquare = new Square(4);

        System.out.println(mySquare.area());
        System.out.println(myCircle.area());
    }
}
