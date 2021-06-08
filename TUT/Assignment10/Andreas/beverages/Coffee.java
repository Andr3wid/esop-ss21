package Assignment10.Andreas.beverages;

public class Coffee implements ICaffeine, IHot {
    @Override
    public float getCaffeinationAmount() {
        return 20f;
    }

    @Override
    public void caffeinate() {
        System.out.println("You feel a warm surge and increased attention span!");
    }

    @Override
    public float getDegreesCelsius() {
        return 50;
    }

    @Override
    public void burn() {
        System.out.println("The coffee is really hot!");
    }

    @Override
    public void cooldown(float coolDownFactor) {

    }

}
