package FinalExam.ex05;

public class CarTest {

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.setModel("Ford Fiesta");

        Car c2 = new Car("VW Passat", "Black", 8.2351);

        System.out.println(c2);
        System.out.println(c1);
    }

}
