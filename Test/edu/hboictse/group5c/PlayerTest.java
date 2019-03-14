package edu.hboictse.group5c;

import edu.hboictse.group5c.Assets.Player;
import org.junit.Test;

import static org.junit.Assert.*;

public class PlayerTest {
    Player player = new Player(2,3);

    @Test
    public void moveUp() {
        player.moveUp();
        assertEquals(4, player.getPositionY());
    }

    @Test
    public void moveDown() {
        player.moveDown();
        assertEquals(2, player.getPositionY());
    }

    @Test
    public void moveRight() {
        player.moveRight();
        assertEquals(3, player.getPositionX());
    }

    @Test
    public void moveLeft() {
        player.moveLeft();
        assertEquals(1, player.getPositionX());
    }
}