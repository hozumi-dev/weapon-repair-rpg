package character;

public class Weapon {
    private String name;
    private int durability;
    private int maxDurability;

    public Weapon(String name, int maxDurability) {
        this.name = name;
        this.maxDurability = maxDurability;
        this.durability = maxDurability / 2; //初期状態は半分壊れている
    }

    public void repairer(int amount) {
        durability += amount;
        if (durability > maxDurability) {
            durability = maxDurability;
        }
        System.out.println(name + "の耐久値は" + durability + "/" + maxDurability);
    }

    public String getName() {
        return name;
    }

    public int getDurability() {
        return durability;
    }
}
