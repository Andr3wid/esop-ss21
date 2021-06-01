package Assignment9.Andreas;

public class PlayerMain {
    public static void main(String[] args) {

        Player p1 = new Player("Bob", "warrior");
        Player p2 = new Player("Joe", "warrior");

        p1.attack(p2);
        p1.attack(p2);

    }
}
