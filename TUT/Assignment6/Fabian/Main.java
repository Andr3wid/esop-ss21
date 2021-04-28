package Assignment6.Fabian;

public class Main {

    public static void main(String[] args) {

        Auto mrc = new Mercedes("Mercedes");

        System.out.println(mrc.getModel());
        mrc.start();
        mrc.start();
        mrc.drive(30);
        mrc.drive(500);
        mrc.stop();
        System.out.println(mrc.tankCapacity());


        Auto amg = new AMG("M AMG");
        System.out.println(amg.getModel());

    }
}
