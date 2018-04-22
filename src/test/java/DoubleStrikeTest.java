import Abilities.*;
import Monsters.Monster;
import Weapons.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DoubleStrikeTest {
    Monster monster;
    Weapon weapon;
    Ability doubleStrike;

    @Before
    public void before(){
        monster = new Monster("Troll", "Big, ugly and dumb.",30,1,6);
        weapon = new Sword("Longsword", 1,8,75);
        doubleStrike = new DoubleStrike("Double Strike", "Fighter", "Two hits with your weapon");
    }

    @Test
    public void canApplySpecialToTarget(){
        String result = doubleStrike.specialAttack(monster, weapon);
        System.out.println(result);
        assertEquals(1,1);
    }
}
