package Assignment8.Fabian;

public class Main {

    public static void main(String[] args) {

        Person p = new Person();
        p.setAge(18);
        p.setName("Test person");

        System.out.println(p.getAge());
        System.out.println(p.getName());

        Person test = new Person(21);

        Person p1 = new Person(22, "Peter");

        Person p2 = new Person(22, "Peter");

        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(new Object()));
        System.out.println(p1.equals("Peter"));
    }
}
