package edu.hboictse.group5c.Objects.Blocks;

import javax.swing.*;

public class EndTile extends Block {

   public EndTile() {
       super(0,0);
       super.setImage(new ImageIcon("Images/EndTile.png"));
   }

    public EndTile(int x, int y) {
        super(x, y);
        super.setImage(new ImageIcon("Images/EndTile.png"));
    }
}
