package Assignment11.Andreas.ArrayLists;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitMain {
    public static void main(String[] args) {

        Fruit f1 = new Fruit("yellow", Surface.SMOOTH, 120, "banana");
        Fruit f2 = new Fruit("red", Surface.SMOOTH, 200, "apple");

        ArrayList<Fruit> fruitContainer = new ArrayList<>();
        fruitContainer.add(f1);
        fruitContainer.add(f2);

        addFruitToContainer(fruitContainer);

        System.out.println("Size of the container: " + fruitContainer.size());

        for(Fruit f : fruitContainer) {
            System.out.println(f.toString());
        }

    }

    private static void addFruitToContainer(ArrayList<Fruit> container) {
        Scanner scanner = new Scanner(System.in);

        String name;
        int weight;
        String color;

        System.out.println("-- Enter a new fruit: ");
        System.out.println("Name: ");
        name = scanner.nextLine();

        System.out.println("Weight: ");
        weight = scanner.nextInt();

        System.out.println("Color: ");
        color = scanner.nextLine();

        Fruit f = new Fruit(color, Surface.UNDEFINED, weight, name);
        container.add(f);
    }
}
