package FinalExam;

import FinalExam.ex05.Car;

import java.util.ArrayList;
import java.util.LinkedList;

public class ex07 {

    public static void main(String[] args) {
        // ArrayList
        ArrayList<Car> cars = new ArrayList<>();

        Car car1 = new Car("VW Golf", "Black", 6.234);
        Car car2 = new Car("VW Passat", "Black", 8.2351);
        Car car3 = new Car("Lambo", "Red", 22.5139);
        String car = "I am a car";

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
//        cars.add(car);
        System.out.println(cars);
        System.out.println("Car2: " + cars.get(1));

        cars.remove(0);
        System.out.println(cars);

        cars.remove(car3);
        System.out.println(cars);
        System.out.println();

        // LinkedList
        LinkedList<String> strings = new LinkedList<>();

        String helloWorld = "Hello World";
        String helloFabian = "Hello Fabian";
        String helloTimo = "Hello Timo";

        System.out.println("Is strings empty? " + strings.isEmpty());
        strings.add(helloFabian);
        strings.add(helloWorld);
        strings.add(helloFabian);
        strings.add(helloTimo);
        System.out.println(strings);
        System.out.println("Second string: " + strings.get(1));
        System.out.println("Is strings empty? " + strings.isEmpty());

        strings.removeFirstOccurrence(helloFabian);
        System.out.println(strings);
    }

}
