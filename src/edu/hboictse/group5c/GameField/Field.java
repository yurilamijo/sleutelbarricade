package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Assets.Blocks.Block;
import edu.hboictse.group5c.Assets.Blocks.Tile;
import edu.hboictse.group5c.Assets.Blocks.Wall;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Field extends JPanel {

    private static final int SIZE = 70;
    private static final int GRID_SIZE = 1000 / 90;

    private Block[][] blocks = new Block[GRID_SIZE][GRID_SIZE];

    public Field() {
        createBlocks();
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
    }

    private void createBlocks() {
        for (int x = 0; x < blocks.length; x++) {
            for (int y = 0; y < blocks[x].length; y++) {
                if (x == 2) {
                    blocks[x][y] = new Wall();
                } else {
                    blocks[x][y] = new Tile();
                }
                add(blocks[x][y]);
            }
        }
    }

    public void addBlock(Block block) {
        blocks[block.getY()][block.getX()] = block;
    }

    public Block getBlock(int x, int y) {
        return blocks[y][x];
    }

    public void clearBlock(int x, int y) {
        blocks[y][x] = null;
    }

    public void fillEmptyBlocks() {
        for (int i = 0; i < blocks.length; i++) {
            for (int j = 0; j < blocks.length; j++) {
                if(blocks[i][j] == null) {
                    blocks[i][j] = new Tile();
                }
            }
        }
    }

    public Block[][] getField() {
        fillEmptyBlocks();
        return this.blocks;
    }
}
