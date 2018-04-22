package Player;

import Abilities.Ability;
import Monsters.Monster;
import Weapons.Weapon;

public class Fighter extends Player {
    Ability ability;

    public Fighter(String name, String charClass, Weapon weapon, Ability ability) {
        super(name, charClass, weapon);
        this.ability = ability;
    }

    @Override
    public String attack(Monster target) {
        if(weapon.attackRoll()){
            int damage = weapon.calculateDamage();
            target.takeDamage(damage);
            return String.format("You swing your %s dealing %s points of damage to the %s!", weapon.getName(), damage, target.getName());
        } else {
            return "You miss your attack!";
        }
    }

    @Override
    public Ability getAbility() {
        return ability;
    }
}
