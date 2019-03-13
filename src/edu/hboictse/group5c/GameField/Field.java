package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Blocks.*;

public class Field {
    private Block[][] field;

    private int width;
    private int height;

    public Field(int width, int height) {
        this.width = width;
        this.height = height;
        this.field = new Block[height][width];
    }

    public void addBlock(Block block) {
        field[block.getY()][block.getX()] = block;
    }

    public Block getBlock(int x, int y) {
        return field[y][x];
    }

    public void clearBlock(int x, int y) {
        field[y][x] = null;
    }

    public void fillEmptyBlocks() {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if(field[i][j] == null) {
                    field[i][j] = new Tile(j,i);
                }
            }
        }
    }

    public Block[][] getField() {
        fillEmptyBlocks();
        return this.field;
    }
}
