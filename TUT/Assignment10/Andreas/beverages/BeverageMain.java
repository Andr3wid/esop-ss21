package Assignment10.Andreas.beverages;

public class BeverageMain {
    public static void main(String[] args) {
        Cola cola = new Cola(330);
        Coffee coffee1 = new Coffee();
        Coffee coffee2 = new Coffee();
        Coffee coffee3 = new Coffee();
        Tea t = new Tea();

        ICaffeine[] caffeineBeverages = new ICaffeine[3];
        caffeineBeverages[0] = cola;
        caffeineBeverages[1] = coffee1;
        caffeineBeverages[2] = coffee3;

        for(int i = 0; i < caffeineBeverages.length; i++) {
            caffeineBeverages[i].caffeinate();
            System.out.println("Caffeine amount: " + caffeineBeverages[i].getCaffeinationAmount());
        }

    }
}
