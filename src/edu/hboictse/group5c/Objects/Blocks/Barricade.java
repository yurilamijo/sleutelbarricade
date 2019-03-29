package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;
import java.awt.*;

public class Barricade extends Block {

    private int value;
    private int SIZE;

    public  Barricade(int value) {
        super(0,0,70);
        this.value = value;
        super.setImage(new ImageIcon("Images/Barricade.png"));
    }

    public Barricade(int x, int y, int SIZE) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
        super.setImage(new ImageIcon("Images/Barricade.png"));
    }

    public Barricade(int x, int y, int SIZE, int value) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
        this.value = value;
        super.setImage(new ImageIcon("Images/Barricade.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, this.getBlockSize(), this.getBlockSize());
        super.setImage(new ImageIcon("Images/Barricade.png"));
    }

    public int getValue() {
        return value;
    }
}
