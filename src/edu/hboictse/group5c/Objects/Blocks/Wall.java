package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;

public class Wall extends Block {

    public Wall(int x, int y) {
        super(x,y);
        super.setImage(new ImageIcon("Images/Wall.png"));
    }
}
