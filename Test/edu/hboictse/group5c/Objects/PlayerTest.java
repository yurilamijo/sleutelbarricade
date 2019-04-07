package edu.hboictse.group5c.Objects;

import edu.hboictse.group5c.Objects.Blocks.*;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void checkBarricadeValue_NoKey() {
        Player player = new Player(0,0);

        assertEquals(player.hasKey(), false);
        assertEquals(player.checkBarricadeValue(100),false);
        assertEquals(player.checkBarricadeValue(200),false);
        assertEquals(player.checkBarricadeValue(300),false);
    }

    @Test
    public void checkBarricadeValue_Key100() {
        Player player = new Player(0,0);
        Block tile = new Tile(0,1);
        Key key = new Key(100);

        tile.setGameObject(key);
        player.checkCollision(tile);

        assertEquals(player.hasKey(), true);
        assertEquals(player.checkBarricadeValue(100),true);
        assertEquals(player.checkBarricadeValue(200),false);
        assertEquals(player.checkBarricadeValue(300),false);
    }

    @Test
    public void checkBarricadeValue_Key200() {
        Player player = new Player(0,0);
        Block tile = new Tile(0,1);
        Key key = new Key(200);

        tile.setGameObject(key);
        player.checkCollision(tile);

        assertEquals(player.hasKey(), true);
        assertEquals(player.checkBarricadeValue(100),false);
        assertEquals(player.checkBarricadeValue(200),true);
        assertEquals(player.checkBarricadeValue(300),false);
    }

    @Test
    public void checkBarricadeValue_Key300() {
        Player player = new Player(0,0);
        Block tile = new Tile(0,1);
        Key key = new Key(300);

        tile.setGameObject(key);
        player.checkCollision(tile);

        assertEquals(player.hasKey(), true);
        assertEquals(player.checkBarricadeValue(100),false);
        assertEquals(player.checkBarricadeValue(200),false);
        assertEquals(player.checkBarricadeValue(300),true);
    }

    @Test
    public void pickUpKey() {
        Player player = new Player(0,0);
        Block tile = new Tile(0,1);
        Key key = new Key(100);

        tile.setGameObject(key);
        player.checkCollision(tile);

        assertEquals(player.hasKey(), true);
    }

    @Test
    public void checkCollisionWall() {
        Player player = new Player(0,0);
        Block nextBlock = new Wall(0,1);

        assertEquals(player.checkCollision(nextBlock), false);
    }

    @Test
    public void checkCollisionBarricade() {
        Player player = new Player(0,0);
        Block nextBlock = new Barricade(0,1,100);

        assertEquals(player.hasKey(), false);
        assertEquals(player.checkCollision(nextBlock), false);
    }

    @Test
    public void checkCollisionTile() {
        Player player = new Player(0,0);
        Block nextBlock = new Tile(1,0);

        assertEquals(player.checkCollision(nextBlock), true);
    }
}