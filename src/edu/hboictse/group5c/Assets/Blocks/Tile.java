package edu.hboictse.group5c.Assets.Blocks;

import edu.hboictse.group5c.Objects.Key;

import java.awt.*;

public class Tile extends Block {
    private Key key;

    public Tile(){

    }

    public Tile(int x, int y, int width, int height, Key key) {
//        super(x, y);
        this.key = key;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.GRAY);
        g.fillRect(0,0,50,50);
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
