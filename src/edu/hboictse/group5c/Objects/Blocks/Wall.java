package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;

public class Wall extends Block {

    public Wall() {
        super(0,0);
        super.setImage(new ImageIcon("Images/Brickwall100-1.png.png"));
    }

    public Wall(int x, int y) {
        super(x, y);
        super.setImage(new ImageIcon("Images/Brickwall100-1.png.png"));
    }
}
