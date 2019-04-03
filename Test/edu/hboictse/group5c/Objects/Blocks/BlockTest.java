package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.Key;
import edu.hboictse.group5c.Objects.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class BlockTest {
    @Test
    public void hasObjectTestNoObject() {
        Block block = new Block(0,0);
        assertEquals(block.hasGameObject(),false);
    }

    @Test
    public void hasObjectTestObject() {
        Block block = new Block(0,0);
        Key key = new Key(100);
        block.setGameObject(key);
        assertEquals(block.getGameObject(),key);

        Player player = new Player(0,0);
        block.setGameObject(player);
        assertEquals(block.getGameObject(),player);
    }
}
