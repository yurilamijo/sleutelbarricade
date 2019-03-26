package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.Key;

import java.awt.*;

public class Tile extends Block {
    private int SIZE;
    private Key key;

    public Tile() {
        super(0,0,70);
    }

    public Tile(Key key) {
        super(0,0,70);
        this.key = key;
    }

    public Tile(int x, int y, int SIZE) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
    }

    public Tile(int x,int y, int SIZE, Key key) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
        this.key = key;
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(Color.GRAY);
        g.fillRect(0, 0, this.getBlockSize(), this.getBlockSize());
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
