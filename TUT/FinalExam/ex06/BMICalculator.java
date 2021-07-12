package FinalExam.ex06;

import java.util.Scanner;

public class BMICalculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double height = sc.nextDouble();
        double weight = sc.nextDouble();

        try {
            System.out.printf("%.2f\n", calculateBMI(height, weight));
        } catch (NoHumanSizeException e) {
            System.out.println(e);
        }
    }

    public static double calculateBMI(double height, double weight) throws NoHumanSizeException {
        if (height <= 0 || height >= 2.57) {
            throw new NoHumanSizeException("There is no human with this size.");
        } else if (weight <= 0 || weight >= 500) {
            throw new NoHumanSizeException("There is no human with this weight.");
        }

        return weight / (height * height);
    }

}
