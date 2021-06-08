package Assignment10.Andreas.beverages;

public class Cola implements ISparkling, ICaffeine {

    private int ml;

    public Cola(int ml) {
        this.ml = ml;
    }

    @Override
    public float getCaffeinationAmount() {
        return (float) (this.ml*0.003);
    }

    @Override
    public void caffeinate() {
        System.out.println("You are feeling a certain spike of caffeine and sugar!");
    }

    @Override
    public int getSparklingFactor() {
        return 5;
    }

    @Override
    public void sparkle() {
        System.out.println("the can of cola is sparkling heavily");
    }
}
