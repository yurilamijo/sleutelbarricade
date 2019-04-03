package edu.hboictse.group5c.Objects;

import org.junit.Test;

import static org.junit.Assert.*;

public class GameObjectTest {
    GameObject gameObject = new GameObject(10,10);

    @Test
    public void getPosXTest() {
        assertEquals(gameObject.getPosX(),10);
    }

    @Test
    public void setPosXTest() {
        gameObject.setPosX(5);
        assertEquals(gameObject.getPosX(),5);
    }

    @Test
    public void getPosYTest() {
        assertEquals(gameObject.getPosY(),10);
    }

    @Test
    public void setPosYTest() {
        gameObject.setPosY(5);
        assertEquals(gameObject.getPosY(),5);
    }
}
