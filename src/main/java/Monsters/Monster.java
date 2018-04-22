package Monsters;

import java.util.Random;

public class Monster {
    String name, description;
    int hitPoints, minDamage, maxDamage;
    Random rand = new Random();

    public Monster(String name, String description, int hitPoints, int minDamage, int maxDamage) {
        this.name = name;
        this.description = description;
        this.hitPoints = hitPoints;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public void takeDamage(int damage){
        hitPoints -= damage;
    }

    public Boolean rollAttack(){
        int roll = rand.nextInt(99) + 1;
        return (roll < 70);
    }

    public int rollDamage(){
        return rand.nextInt(maxDamage - minDamage) + 1;
    }
}
