package Player;

import Abilities.Ability;
import Monsters.Monster;
import Weapons.Weapon;

import java.util.ArrayList;

public abstract class Player {
    protected String name;
    protected String charClass;
    protected Weapon weapon;
    protected int hitPoints;

    public Player(String name, String charClass, Weapon weapon) {
        this.name = name;
        this.charClass = charClass;
        this.weapon = weapon;
        this.hitPoints = 40;
    }

    public String getName() {
        return name;
    }

    public String getCharClass() {
        return charClass;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void takeDamage(int amount){
        hitPoints -= amount;
    }

    public abstract Ability getAbility();

    public abstract String attack(Monster target);
}
