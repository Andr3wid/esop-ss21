package Assignment8.Andreas;

public class Rechteck {

    // Kann direkt auf der "Klasse" aufgerufen werden (ohne Objekt)
    private static int rechteckeAngelegt = 0;

    // Attribute "Instanzvariablen" oder "Objektvariablen"
    private int laenge;
    private int breite;

    // Konstruktor - verwendet um das Objekt zu "konstruieren"
    // gleicher Name wie Klasse!
    public Rechteck(int initLaenge, int initBreite) {
        laenge = initLaenge;
        breite = initBreite;
        rechteckeAngelegt++;
    }

    public Rechteck() {}

    // Methoden
    int berechneFlaeche() {
        return laenge * breite;
    }

    void ausgabe() {
        System.out.println("Länge: " + laenge + " | " + "Breite: " + breite);
    }

    // override inherited method from java.lang.Object
    @Override
    public String toString() {
        return "Länge: " + laenge + " | " + "Breite: " + breite;
    }

    @Override
    public boolean equals(Object obj) {
        // cast the object into a "Rechteck"-object
        Rechteck toCompare = (Rechteck) obj;

        return laenge == toCompare.getLaenge() && breite == toCompare.getBreite();
    }

    // Getter- und Setter-Methoden
    // Getter: Read variable values without directly accessing
    public int getLaenge() {
        return laenge;
    }

    public void setLaenge(int newLaenge) {
        if(newLaenge >= 0) {
            laenge = newLaenge;
        } else {
            System.out.println("FEHLER: Länge kann nicht negativ sein");
        }
    }

    public int getBreite() {
        return breite;
    }

    public void setBreite(int newBreite) {
        if(newBreite >= 0) {
            breite = newBreite;
        } else {
            System.out.println("FEHLER: Breite kann nicht negativ sein");
        }
    }

    public static int getRechteckeAngelegt() {
        return rechteckeAngelegt;
    }

}
