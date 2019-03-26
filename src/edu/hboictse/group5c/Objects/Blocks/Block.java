package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.GameObject;

public class Block extends GameObject {

    private int SIZE;

    public Block(int x, int y, int SIZE) {
        super(x, y);
        this.SIZE = SIZE;
    }

    public int getBlockSize() {
        return this.SIZE;
    }
}
