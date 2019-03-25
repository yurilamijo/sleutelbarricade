package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;
import java.awt.*;

public class EndTile extends Block {

   public EndTile() {
       super(0,0,70);
       super.setImage(new ImageIcon("Images/EndTile.png"));
   }

    public EndTile(int x, int y, int SIZE) {
        super(x, y, SIZE);
        super.setImage(new ImageIcon("Images/EndTile.png"));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, this.getBlockSize(), this.getBlockSize());
    }
}
