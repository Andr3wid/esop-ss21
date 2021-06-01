package Assignment8.Andreas;

public class Main {
    public static void main(String[] args) {

        // Instantiate an object from a class
        Rechteck rec1 = new Rechteck(7, 4);

        // toString() gets called automatically by the println or print-Method
        System.out.println(rec1);

        Rechteck rec2 = new Rechteck(7,4);

        if(rec1.equals(rec2)) {
            System.out.println("Die Rechtecke sind gleich!");
        } else {
            System.out.println("Die Rechtecke sind NICHT gleich!");
        }

        // Access class variables
        System.out.println("Anzahl der angelegten Rechteck-Objekte: " + Rechteck.getRechteckeAngelegt());

    }
}
