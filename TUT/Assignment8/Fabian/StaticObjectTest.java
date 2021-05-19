package Assignment8.Fabian;

public class StaticObjectTest {

    public String dynamicTestName;
    public static String staticTestName = "static name for this class";

    public StaticObjectTest(String dynamicTestName) {
        this.dynamicTestName = dynamicTestName;
    }

    public void printNames() {
        System.out.println("Dynamic name: " + this.dynamicTestName);
        System.out.println("Static name: " + StaticObjectTest.staticTestName);
    }
}
