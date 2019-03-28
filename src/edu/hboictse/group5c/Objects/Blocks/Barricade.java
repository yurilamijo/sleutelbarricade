package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;
import java.awt.*;

public class Barricade extends Block {

    private int value;

    public  Barricade(int value) {
        super(0,0,70);
        this.value = value;
        super.setImage(new ImageIcon("Images/Brickwall300.png"));
    }

    public Barricade(int x, int y, int SIZE) {
        super(x, y, SIZE);
        super.setImage(new ImageIcon("Images/Brickwall300.png"));
    }

    public int getValue() {
        return value;
    }
}
