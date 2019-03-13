package edu.hboictse.group5c.Blocks;

import edu.hboictse.group5c.Objects.Key;

public class Tile extends Block {
    private Key key;

    public Tile(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    public Tile(int x, int y, int width, int height, Key key) {
        super(x, y, width, height);
        this.key = key;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }
}
