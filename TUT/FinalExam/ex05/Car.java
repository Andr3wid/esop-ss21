package FinalExam.ex05;

public class Car {

    private String model;
    private String color;
    private double fuelConsumption;

    public Car(String model, String color, double fuelConsumption) {
        this.model = model;
        this.color = color;
        this.fuelConsumption = fuelConsumption;
    }

    public Car() {

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public String toString() {
        return String.format("%s | %s | %.2f", model, color, fuelConsumption);
    }

}
