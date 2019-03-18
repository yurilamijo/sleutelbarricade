package edu.hboictse.group5c.Assets.Blocks;

import java.awt.*;

public class EndTile extends Block {

    private int SIZE;

   public EndTile() {
       super(0,0,70);
   }

    public EndTile(int x, int y, int SIZE) {
        super(x, y, SIZE);
        this.SIZE = SIZE;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, this.getBlockSize(), this.getBlockSize());
    }
}
