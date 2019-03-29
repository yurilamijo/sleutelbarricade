package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.Key;
import javax.swing.*;
import java.awt.*;

public class Tile extends Block {
    private Key key;

    public Tile() {
        super(0,0);
        super.setImage(new ImageIcon("Images/Floor.png"));
    }

    public Tile(Key key) {
        super(0,0);
        this.key = key;
        super.setImage(new ImageIcon("Images/Floor.png"));
    }

    public Tile(int x, int y) {
        super(x, y);
        super.setImage(new ImageIcon("Images/Floor.png"));
    }

    public Tile(int x,int y, Key key) {
        super(x, y);
        this.key = key;
        super.setImage(new ImageIcon("Images/Floor.png"));
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
