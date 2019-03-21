package edu.hboictse.group5c.Objects.Blocks;

import edu.hboictse.group5c.Objects.GameObject;
import edu.hboictse.group5c.Objects.Blocks.*;

public class Block extends GameObject {

    private int SIZE;
    private int x;
    private int y;

    public Block(int x, int y, int SIZE) {
        super(x, y);
//        this.x = x;
//        this.y = y;
        this.SIZE = SIZE;
    }

    public int getBlockSize() {
        return this.SIZE;
    }

}
