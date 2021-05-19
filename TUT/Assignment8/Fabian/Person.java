package Assignment8.Fabian;

public class Person {

    private int age;
    private String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Person(int age) {
        this.age = age;
        this.name = "default";
    }

    public Person() {
        this.age = 0;
        this.name = "";
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        if (o instanceof Person) {
            Person compare = (Person) o;
            if (compare.getAge() == this.age && compare.getName().equals(this.name)) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }


}
