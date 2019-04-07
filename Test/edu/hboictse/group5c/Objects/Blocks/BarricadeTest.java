package edu.hboictse.group5c.Objects.Blocks;

import org.junit.Test;

import static org.junit.Assert.*;

public class BarricadeTest {
    @Test
    public void codeTest() {
        Barricade barricade = new Barricade(0,0,100);
        assertEquals(barricade.getCode(),100);

        barricade = new Barricade(0,0,200);
        assertEquals(barricade.getCode(),200);

        barricade = new Barricade(0,0,300);
        assertEquals(barricade.getCode(),300);
    }
}
