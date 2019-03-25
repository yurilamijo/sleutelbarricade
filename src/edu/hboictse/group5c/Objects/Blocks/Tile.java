package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.Key;

import javax.swing.*;
import java.awt.*;

public class Tile extends Block {
    private int SIZE;
    private Key key;

    public Tile() {
        super(0,0,70);
        super.setImage(new ImageIcon("Images/Tile.png"));
    }

    public Tile(Key key) {
        super(0,0,70);
        this.key = key;
        super.setImage(new ImageIcon("Images/Tile.png"));
    }

    public Tile(int x, int y, int SIZE) {
        super(x, y, SIZE);
        super.setImage(new ImageIcon("Images/Tile.png"));
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
