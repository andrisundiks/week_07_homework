import Weapons.Sword;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SwordTest {
    Sword sword1;

    @Before
    public void before(){
        sword1 = new Sword("Long sword", 1,8,80);
    }

    @Test
    public void canCalculatedamage(){
        int damage = sword1.calculateDamage();
        assertEquals(true, damage > 0 && damage < 9);
    }
}
