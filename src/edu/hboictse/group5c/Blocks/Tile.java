package edu.hboictse.group5c.Blocks;

import edu.hboictse.group5c.Objects.Key;

public class Tile extends Block{
    private Key key;

    public Tile(int x, int y) {
        super(x, y);
    }

    public Tile(int x, int y, Key key) {
        super(x,y);
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
