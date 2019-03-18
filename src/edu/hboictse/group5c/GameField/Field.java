package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Assets.Blocks.*;
import edu.hboictse.group5c.Assets.Player;
import edu.hboictse.group5c.GameObject;

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

    private GameObject[][] objects = new GameObject[GRID_SIZE][GRID_SIZE];

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
        addPlayer();
        addEndTile(new EndTile(objects.length - 1, objects.length - 1, SIZE));
        addBlocks();
    }

    private void addPlayer() {
        this.objects[0][0] = new Player(0,0);
    }

    /**
     * Adds 2D Array objects with Tiles, Walls and Barricades to the JPanel
     */
    private void addBlocks() {
        for (int x = 0; x < this.objects.length; x++) {
            for (int y = 0; y < this.objects[x].length; y++) {
                add(this.objects[x][y]);
            }
        }
    }

    /**
     * Adds Tiles to the 2D array of Blocks
     */
    private void addLevel(Block[][] level) {
        for (int x = 0; x < level.length; x++) {
            for (int y = 0; y < level[x].length; y++) {
                add(level[x][y]);
            }
        }
    }

    public void createTiles() {
        for (int x = 0; x < this.objects.length; x++) {
            for (int y = 0; y < this.objects.length; y++) {
                if (this.objects[x][y] == null) {
                    this.objects[x][y] = new Tile(x, y, SIZE);
                }
            }
        }
    }

    /**
     * Adds Walls to the 2D array of Blocks
     */
    private void createWalls() {
        for (int i = 0; i < 4; i++) {
            this.addWall(new Wall(randomPos(), randomPos(), SIZE));
        }
    }

    /**
     * Adds Barricades to the 2D array of Blocks
     */
    private void createBarricades() {
        for (int i = 0; i < 12; i++) {
            this.addBarricade(new Barricade(randomPos(), randomPos(), SIZE));
        }
    }

    /**
     * Helper method for adding Walls to Blocks
     *
     * @param wall
     */
    private void addWall(Wall wall) {
        this.objects[wall.getPosY()][wall.getPosX()] = wall;
    }

    /**
     * Helper method for adding Barricades to Blocks
     *
     * @param barricade
     */
    private void addBarricade(Barricade barricade) {
        this.objects[barricade.getPosY()][barricade.getPosX()] = barricade;
    }

    /**
     * Adds EndTile to the 2D array of Blocks
     *
     * @param endTile
     */
    private void addEndTile(EndTile endTile) {
        this.objects[endTile.getPosY()][endTile.getPosX()] = endTile;
    }

    public GameObject getWall(int x, int y) {
        return this.objects[y][x];
    }

    public void clearBlock(int x, int y) {
        this.objects[y][x] = null;
    }

    public GameObject[][] getField() {
//        fillEmptyBlocks();
        return this.objects;
    }

    /**
     * Helper method for creating a random number
     *
     * @return a random Integer
     */
    private int randomPos() {
        return (int) (Math.random() * ((GRID_SIZE) - MIN_GRID_SIZE) + 2) - MIN_GRID_SIZE;
    }
}
