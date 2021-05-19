package Assignment8.Fabian;

public class StaticMainTest {

    public static void main(String[] args) {

        StaticObjectTest test1 = new StaticObjectTest("this is variable test 1!");
        StaticObjectTest test2 = new StaticObjectTest("this is variable test 2!");

        test1.printNames();
        test2.printNames();
        System.out.println();

        StaticObjectTest.staticTestName = "new value for static name";

        System.out.println();
        test1.printNames();
        test2.printNames();

    }

}
