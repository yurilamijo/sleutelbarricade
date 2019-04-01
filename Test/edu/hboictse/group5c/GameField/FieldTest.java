package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.Blocks.Block;
import edu.hboictse.group5c.Objects.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {
    @Test
    public void addPlayerTest() {
        Field field = new Field();
        Player player = new Player(3,3);

        field.addPlayer(player);
        Block[][] blocks = field.getBlocks();
        assertEquals(blocks[3][3].getGameObject(),player);
    }

    @Test
    public void playerAtEdgeNorth() {

    }
}
