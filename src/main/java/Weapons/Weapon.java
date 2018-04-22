package Weapons;

import java.util.Random;

public abstract class Weapon {
    protected String name;
    protected int minDamage, maxDamage, hitChance;
    private Random rand = new Random();

    public Weapon(String name, int minDamage, int maxDamage, int hitChance) {
        this.name = name;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.hitChance = hitChance;
    }

    public Boolean attackRoll(){
        int result = rand.nextInt(99) + 1;
        return (result < hitChance);
    }

    public int calculateDamage() {
        return rand.nextInt(maxDamage - minDamage) + 1;
    }

    public String getName() {
        return name;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getHitChance() {
        return hitChance;
    }
}
