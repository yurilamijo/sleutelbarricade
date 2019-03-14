package edu.hboictse.group5c.Assets.Blocks;

import java.awt.*;

public class Wall extends Block {

    private int SIZE;

    public Wall(int x, int y, int SIZE) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(0, 0, this.SIZE, this.SIZE);
    }
}
