package edu.hboictse.group5c.Assets.Blocks;

import java.awt.*;

public class Wall extends Block {

    public Wall() {

    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.cyan);
        g.fillRect(0, 0, 50, 50);
    }
}
