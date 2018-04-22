package Abilities;

import Monsters.Monster;
import Weapons.Weapon;

public abstract class Ability {
    protected String name, charClass, description;
    protected int coolDown;

    public Ability(String name, String charClass, String description) {
        this.name = name;
        this.charClass = charClass;
        this.description = description;
        this.coolDown = 0;
    }

    public String getName() {
        return name;
    }

    public String getCharClass() {
        return charClass;
    }

    public String getDescription() {
        return description;
    }

    public int getCoolDown() {
        return coolDown;
    }

    public void setCoolDown(int coolDown) {
        this.coolDown = coolDown;
    }

    public void addCoolDown() {
        this.coolDown ++;

    }

    public abstract String specialAttack(Monster target, Weapon weapon);
}
