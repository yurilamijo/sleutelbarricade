package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;
import java.awt.*;

public class Wall extends Block {

    public Wall() {
        super(0,0,70);
        super.setImage(new ImageIcon("Images/Key300.png"));
    }

    public Wall(int x, int y, int SIZE) {
        super(x, y, SIZE);
        super.setImage(new ImageIcon("Images/Key300.png"));
    }
}
