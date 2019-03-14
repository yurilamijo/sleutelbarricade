package edu.hboictse.group5c.Assets.Blocks;

import edu.hboictse.group5c.Objects.Key;

import java.awt.*;

public class Tile extends Block {

    private int SIZE;
    private Key key;

    public Tile(int x, int y, int SIZE) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, this.SIZE, this.SIZE);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
