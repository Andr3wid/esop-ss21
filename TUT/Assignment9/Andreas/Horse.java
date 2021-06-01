package Assignment9.Andreas;

public class Horse {
    /*
        private: inside the class and child-classes can access the variables
        public: everyone can access the variables
        protected: every class in the same package can access the variables
     */

    private String name;
    private String color;
    private int age;
    private int maxSpeed;
    private boolean isARaceHorse;

    public Horse(String name, String color, int age, int maxSpeed) {
        this.name = name;
        // this.color --> instance variable; color --> constructor parameter
        this.color = color;
        this.age = age;
        this.maxSpeed = maxSpeed;
    }

    public Horse(String name) {
        this.name = name;
    }

    /*
        Default constructor is a constructor without parameters that gets called implicitly (even if no constructor is specified)
        Default values are assigned to the variables:
            - for objects: null
            - for ints: 0
            - for booleans: false
     */
    public Horse() { }

    public void run(int km) {
        System.out.println(name + " is running " + km + " kilometers");
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", maxSpeed=" + maxSpeed +
                ", isARaceHorse=" + isARaceHorse +
                '}';
    }

    // GETTER & SETTER
    public boolean getIsARaceHorse() {
        return isARaceHorse;
    }

    public void setIsARaceHorse(boolean isARaceHorse) {
        if(this.maxSpeed >= 50) {
            System.out.println("Flagged " + this.name + " as a race horse.");
            this.isARaceHorse = isARaceHorse;
        } else {
            System.out.println(this.name + " is too slow to be a race horse.");
        }
    }

}
