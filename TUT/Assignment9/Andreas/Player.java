package Assignment9.Andreas;

public class Player {

    private String name;
    private String category;
    private int speed;
    private int defense;
    private int attackPower;
    private int healthPoints;

    public Player(String name, String category) {
        this.name = name;
        this.category = category;
        this.healthPoints = 10;
        initializeAttributesByCategory(this.category);
    }

    private void initializeAttributesByCategory(String category) {
        switch (category) {
            case "warrior":
                speed = 4;
                defense = 5;
                attackPower = 6;
                break;

            case "wizard":
                speed = 3;
                defense = 2;
                attackPower = 8;

            default:
                System.out.println("Unknown category, setting values to -1");
                speed = -1;
                defense = -1;
                attackPower = -1;
        }
    }

    public void attack(Player p) {
        System.out.println(this.name + " attacks " + p.getName());
        int damage = this.attackPower - p.getDefense();
        p.dealDamage(damage);

        System.out.println(this.name + " HP: " + this.healthPoints + " | " + p.getName() + " HP: " + p.getHealthPoints());
    }

    public void dealDamage(int damage) {
        this.healthPoints = this.healthPoints - damage;
    }

    // GETTER & SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDefense() {
        return defense;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getHealthPoints() {
        return this.healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

}
