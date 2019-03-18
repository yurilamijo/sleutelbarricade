package edu.hboictse.group5c.Assets.Blocks;

import javax.swing.*;

public class Block extends JComponent {

    private int SIZE;
    private int x;
    private int y;

    public Block(int x, int y, int SIZE) {
        this.x = x;
        this.y = y;
        this.SIZE = SIZE;
    }

    public int getBlockSize(){
        return this.SIZE;
    }

    public void setBlockSize(int SIZE) {
        this.SIZE = SIZE;
    }

    public int getPosX() {
        return this.x;
    }

    public void setPosX(int x) {
        this.x = x;
    }

    public int getPosY() {
        return this.y;
    }

    public void setPosY(int y) {
        this.y = y;
    }
}
