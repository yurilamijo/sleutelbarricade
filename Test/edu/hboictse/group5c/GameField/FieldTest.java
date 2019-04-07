package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.Blocks.Block;
import edu.hboictse.group5c.Objects.Blocks.Tile;
import edu.hboictse.group5c.Objects.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class FieldTest {
    @Test
    public void addPlayerTest() {
        Field field = new Field();
        Player player = new Player(3, 3);

        field.addPlayer(player);
        Block[][] blocks = field.getBlocks();
        assertEquals(blocks[3][3].getGameObject(), player);
    }

    @Test
    public void playerAtEdgeNorth() {
        Field field = new Field();

        field.movePlayer("NORTH");

        assertEquals(field.checkEdge(-1, "NORTH"), true);
    }

    @Test
    public void playerAtEdgeEast() {
        Field field = new Field();

        field.movePlayer("EAST");

        assertEquals(field.checkEdge(field.getBlocks().length, "EAST"), true);
    }

    @Test
    public void playerAtEdgeSouth() {
        Field field = new Field();

        field.movePlayer("SOUTH");

        assertEquals(field.checkEdge(field.getBlocks().length, "SOUTH"), true);
    }

    @Test
    public void playerAtEdgeWest() {
        Field field = new Field();

        field.movePlayer("WEST");

        assertEquals(field.checkEdge(-1, "WEST"), true);
    }
}
