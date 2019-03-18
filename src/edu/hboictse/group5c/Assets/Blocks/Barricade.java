package edu.hboictse.group5c.Assets.Blocks;

import java.awt.*;

public class Barricade extends Block {

    private int SIZE;
    private int value;
    private boolean visible;

    public  Barricade(int value) {
        super(0,0,70);
        this.value = value;
    }

    public Barricade(int x, int y, int SIZE) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.green);
        g.fillRect(0, 0, this.getBlockSize(), this.getBlockSize());
    }

    public int getValue() {
        return value;
    }

    public boolean isBlockVisible() {
        return visible;
    }

    public void setBlockVisible(boolean visible) {
        this.visible = visible;
    }
}
