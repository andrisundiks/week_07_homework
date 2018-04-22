import org.junit.Before;
import org.junit.Test;
import Room.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

public class RoomTest {
    private Room room1;

    @Before
    public void before(){
        room1 = new Room();
    }

    @Test
    public void roomStartsEmpty(){
        assertNull(room1.getMonster());
    }

    @Test
    public void canPopulateRoom(){
        room1.populate("Troll", "Big");
        assertNotNull(room1.getMonster());
    }
}
