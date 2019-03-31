package edu.hboictse.group5c;

import com.sun.org.apache.bcel.internal.generic.NEW;
import edu.hboictse.group5c.Objects.Key;
import edu.hboictse.group5c.Objects.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void checkBarricadeValue_NoKey() {
        Player player = new Player(0,0);
        assertEquals(player.checkBarricadeValue(100),false);
        assertEquals(player.checkBarricadeValue(200),false);
        assertEquals(player.checkBarricadeValue(300),false);
    }

    @Test
    public void checkBarricadeValue_Key100() {
        Player player = new Player(0,0);
        player.pickUpKey(new Key(100));
        assertEquals(player.checkBarricadeValue(100),true);
        assertEquals(player.checkBarricadeValue(200),false);
        assertEquals(player.checkBarricadeValue(300),false);
    }

    @Test
    public void checkBarricadeValue_Key200() {
        Player player = new Player(0,0);
        player.pickUpKey(new Key(200));
        assertEquals(player.checkBarricadeValue(100),false);
        assertEquals(player.checkBarricadeValue(200),true);
        assertEquals(player.checkBarricadeValue(300),false);
    }

    @Test
    public void checkBarricadeValue_Key300() {
        Player player = new Player(0,0);
        player.pickUpKey(new Key(300));
        assertEquals(player.checkBarricadeValue(100),false);
        assertEquals(player.checkBarricadeValue(200),false);
        assertEquals(player.checkBarricadeValue(300),true);
    }

    @Test
    public void keyTests() {
        Player player = new Player(0,0);
    }
}