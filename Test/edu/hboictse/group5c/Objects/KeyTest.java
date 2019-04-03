package edu.hboictse.group5c.Objects;

import org.junit.Test;

import static org.junit.Assert.*;

public class KeyTest {
    @Test
    public void KeyValueTest100() {
        Key key = new Key(100);
        assertEquals(key.getCode(),100);
    }

    @Test
    public void KeyValueTest200() {
        Key key = new Key(200);
        assertEquals(key.getCode(),200);
    }

    @Test
    public void KeyValueTest300() {
        Key key = new Key(300);
        assertEquals(key.getCode(),300);
    }
}
