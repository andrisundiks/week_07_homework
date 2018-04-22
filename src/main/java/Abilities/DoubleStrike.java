package Abilities;

import Interfaces.IOffensive;
import Monsters.Monster;
import Weapons.Weapon;

public class DoubleStrike extends Ability implements IOffensive {

    public DoubleStrike(String name, String charClass, String description) {
        super(name, charClass, description);
    }

    @Override
    public String specialAttack(Monster target, Weapon weapon) {
        int hitOne = rand.nextInt(weapon.getMaxDamage() - weapon.getMinDamage()) + 1;
        int hitTwo = rand.nextInt(weapon.getMaxDamage() - weapon.getMinDamage()) + 1;

        int totalDamage = hitOne + hitTwo;
        target.takeDamage(totalDamage);

        return String.format("You swing your %s twice dealing %s to the %s!", weapon.getName(), totalDamage, target.getName());
    }


}
