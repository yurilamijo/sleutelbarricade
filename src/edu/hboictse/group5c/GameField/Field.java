package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.Blocks.*;
import edu.hboictse.group5c.Objects.Player;
import edu.hboictse.group5c.Objects.GameObject;

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
        this.objects[0][0] = new Player(0,0,1);
    }

    /**
     * Adds 2D Array objects with Tiles, Walls and Barricades to the JPanel
     */
    private void addBlocks() {
        for (int x = 0; x < this.objects.length; x++) {
            for (int y = 0; y < this.objects[x].length; y++) {
                add(this.objects[x][y]);
                setIcon(this.objects[x][y]);
            }
        }
    }

    /**
     * Adds Tiles to the 2D array of Blocks
     */
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
            this.objects[randomPos()][randomPos()] = new Wall();

        }
    }

    /**
     * Adds Barricades to the 2D array of Blocks
     */
    private void createBarricades() {
        for (int i = 0; i < 12; i++) {
            this.objects[randomPos()][randomPos()] = new Barricade(100);
        }
    }

    /**
     * Adds EndTile to the 2D array of Blocks
     *
     * @param endTile
     */
    private void addEndTile(EndTile endTile) {
        this.objects[endTile.getPosY()][endTile.getPosX()] = endTile;
    }

    /**
     * Sets image of GameObject
     * @param gameObject
     */
    public static void setIcon(GameObject gameObject) {
        ImageIcon icon = gameObject.getImage();

        if (icon == null) {
            gameObject.setIcon(null);
            return;
        }

        Image image = icon.getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        gameObject.setIcon(new ImageIcon(image));
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
