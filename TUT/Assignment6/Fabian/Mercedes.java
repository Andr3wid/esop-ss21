package Assignment6.Fabian;

public class Mercedes implements Auto {

    private String modelName;
    private int tankCapacity;
    private boolean isIdle;

    public Mercedes(String modelName) {
        this.modelName = modelName;
        this.tankCapacity = 90;
        this.isIdle = true;
    }

    @Override
    public String getModel() {
        return this.modelName;
    }

    @Override
    public int tankCapacity() {
        return this.tankCapacity;
    }

    @Override
    public void start() {
        if (this.isIdle == false) {
            System.out.println("Car already started!");
        } else if (this.tankCapacity > 0) {
            System.out.println("Car is starting!");
            this.isIdle = false;
        }
    }

    @Override
    public void drive(int km) {
        // for every km 0.5 tankCapacity is used
        if (km * 0.5 < this.tankCapacity && this.isIdle == false) {
            System.out.println("Car is driving " + km + "km!");
            this.tankCapacity -= this.tankCapacity * 0.5;
        } else {
            System.out.println("Cannot drive!");
        }
    }

    @Override
    public void stop() {
        this.isIdle = true;
        System.out.println("Car has stopped!");
    }
}
