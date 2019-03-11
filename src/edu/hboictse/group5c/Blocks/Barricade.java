package edu.hboictse.group5c.Blocks;

public class Barricade extends Block {
    private int value;
    private boolean visible;

    public Barricade(int x, int y, int value) {
        super(x, y);
        this.value = value;
        this.visible = true;
    }

    public int getValue() {
        return value;
    }

    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible) {
        this.visible = visible;
    }
}
