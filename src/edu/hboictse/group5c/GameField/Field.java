package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Assets.Blocks.Barricade;
import edu.hboictse.group5c.Assets.Blocks.Block;
import edu.hboictse.group5c.Assets.Blocks.Tile;
import edu.hboictse.group5c.Assets.Blocks.Wall;
import edu.hboictse.group5c.Assets.Player;

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
        createTiles();
        createWalls();
        createBarricades();
        createBlocks();
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
    }

    private void createBlocks() {
        for (int x = 0; x < this.blocks.length; x++) {
            for (int y = 0; y < this.blocks[x].length; y++) {
                add(this.blocks[x][y]);
            }
        }
    }

    public void createTiles() {
        for (int x = 0; x < this.blocks.length; x++) {
            for (int y = 0; y < this.blocks.length; y++) {
                if (this.blocks[x][y] == null) {
                    this.blocks[x][y] = new Tile(x, y, SIZE);
                }
            }
        }
    }

    private void createWalls() {
        for (int i = 0; i < 4; i++) {
            int x = (int) (Math.random() * GRID_SIZE - 1);
            int y = (int) (Math.random() * GRID_SIZE - 1);
            this.addWall(new Wall(x, y, SIZE));
        }
    }

    private void createBarricades() {
        for (int i = 0; i < 12; i++) {
            int x = (int) (Math.random() * GRID_SIZE - 1);
            int y = (int) (Math.random() * GRID_SIZE - 1);
            this.addBarricade(new Barricade(x, y, SIZE));
        }
    }

    private void addWall(Wall wall) {
        this.blocks[wall.getPosY()][wall.getPosX()] = wall;
    }

    private void addBarricade(Barricade barricade) {
        this.blocks[barricade.getPosY()][barricade.getPosX()] = barricade;
    }

    public Block getWall(int x, int y) {
        return this.blocks[y][x];
    }

    public void clearBlock(int x, int y) {
        this.blocks[y][x] = null;
    }

    public Block[][] getField() {
//        fillEmptyBlocks();
        return this.blocks;
    }
}
