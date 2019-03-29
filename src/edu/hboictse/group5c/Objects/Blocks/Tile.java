package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.Key;
import javax.swing.*;

public class Tile extends Block {
    private Key key;

    public Tile() {
        super(0,0);
        super.setImage(new ImageIcon("Images/Tile.png"));
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
