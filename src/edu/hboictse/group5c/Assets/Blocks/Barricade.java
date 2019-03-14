package edu.hboictse.group5c.Assets.Blocks;

import java.awt.*;

public class Barricade extends Block {
    private int value;
    private boolean visible;

    public Barricade(int value) {
        this.value = value;
    }

    public Barricade(int x, int y, int value) {
//        super(x, y);
        this.value = value;
        this.visible = true;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(0,0,50,50);
    }

    public int getValue() {
        return value;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
