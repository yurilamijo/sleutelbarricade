package edu.hboictse.group5c;

import edu.hboictse.group5c.GameField.Level;
import org.junit.Test;

import static org.junit.Assert.*;

public class LevelTest {


    @Test
    public void getBlocksTestNull() {
        Level level = new Level(0);
        assertNull(level.getBlocks());
    }

    @Test
    public void getBlocksTestLevel1() {
        Level level = new Level(0);
        level.nextLevel();
        assertEquals(level.getLevelNumber(), 1);
        assertNotNull(level.getBlocks());
    }

    @Test
    public void getBlocksTestLevelOutOfBounce() {
        Level level = new Level(0);
        level.nextLevel();
        level.nextLevel();
        assertEquals(level.getLevelNumber(), 2);
        assertNull(level.getBlocks());
    }
}
