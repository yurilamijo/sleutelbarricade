package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;

public class Tile extends Block {
    public Tile(int x, int y) {
        super(x, y);
        super.setImage(new ImageIcon("Images/Tile.png"));
    }
}
