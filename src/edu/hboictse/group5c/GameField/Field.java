package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Assets.Blocks.*;

import javax.swing.*;
import java.awt.*;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Field extends JPanel {

    private static final int SIZE = 70;
    private static final int GRID_SIZE = 900 / SIZE;
    private static final int MIN_GRID_SIZE = 2;

    private Block[][] blocks = new Block[GRID_SIZE][GRID_SIZE];

    public Field() {
        createField();
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
    }

    public Field(Block[][] level) {
        addLevel(level);
        setLayout(new GridLayout(level.length,level[0].length));
    }

    private void createField() {
        createTiles();
        createWalls();
        createBarricades();
        addEndTile(new EndTile(blocks.length - 1, blocks.length - 1, SIZE));
        addBlocks();
    }

    private void addBlocks() {
        for (int x = 0; x < this.blocks.length; x++) {
            for (int y = 0; y < this.blocks[x].length; y++) {
                add(this.blocks[x][y]);
            }
        }
    }

    private void addLevel(Block[][] level) {
        for (int x = 0; x < level.length; x++) {
            for (int y = 0; y < level[x].length; y++) {
                add(level[x][y]);
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
            this.addWall(new Wall(randomPosX(), randomPosY(), SIZE));
        }
    }

    private void createBarricades() {
        for (int i = 0; i < 12; i++) {
            this.addBarricade(new Barricade(randomPosX(), randomPosY(), SIZE));
        }
    }

    private void addWall(Wall wall) {
        this.blocks[wall.getPosY()][wall.getPosX()] = wall;
    }


    private void addBarricade(Barricade barricade) {
        this.blocks[barricade.getPosY()][barricade.getPosX()] = barricade;
    }

    private void addEndTile(EndTile endTile) {
        this.blocks[endTile.getPosY()][endTile.getPosX()] = endTile;
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

    private int randomPosX() {
        return (int) (Math.random() * ((GRID_SIZE) - MIN_GRID_SIZE) + 2) - MIN_GRID_SIZE;
    }

    private int randomPosY() {
        return (int) (Math.random() * ((GRID_SIZE) - MIN_GRID_SIZE) + 2) - MIN_GRID_SIZE;
    }
}
