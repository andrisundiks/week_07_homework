import Abilities.Ability;
import Abilities.DoubleStrike;
import Monsters.Monster;
import Player.*;
import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

public class FighterClass {
    Fighter fighter1;
    Monster monster1;
    Sword sword1;
    Ability ability1;

    @Before
    public void before(){
        sword1 = new Sword("Longsowrd", 1,8,75);
        monster1 = new Monster("Troll", "Big and ugly", 20,1,6);
        ability1 = new DoubleStrike("Double Strike", "fighter", "Two hits of your weapon");
        fighter1 = new Fighter("Bob", "fighter", sword1, ability1);
    }

    @Test
    public void canAttack(){
        String result = fighter1.attack(monster1);
        System.out.println(result);
    }
}
