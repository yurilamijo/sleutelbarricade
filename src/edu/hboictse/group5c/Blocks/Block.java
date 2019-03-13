package edu.hboictse.group5c.Blocks;

import javax.swing.*;
import java.awt.*;

public class Block extends JComponent {

    private int x;
    private int y;
    private int width;
    private int height;

    public Block(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Block(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.fillRect(x * 70, y * 70, 70, 70);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
