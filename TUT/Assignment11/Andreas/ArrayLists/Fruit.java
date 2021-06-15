package Assignment11.Andreas.ArrayLists;

public class Fruit {
    private String color;
    private Surface texture;
    private int weight;
    private String name;

    public Fruit(String color, Surface texture, int weight, String name) {
        this.color = color;
        this.texture = texture;
        this.weight = weight;
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Surface getTexture() {
        return texture;
    }

    public void setTexture(Surface texture) {
        this.texture = texture;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "This " + this.color + " " + this.name + " weighs " + this.weight + " grams.";
    }
}
