package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.Blocks.*;
import edu.hboictse.group5c.Objects.Player;
import edu.hboictse.group5c.Objects.GameObject;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Field extends JPanel {

    private static final int SIZE = 70;
    private static final int GRID_SIZE = 900 / SIZE;

    private GameObject[][] objects = new GameObject[GRID_SIZE][GRID_SIZE];

    public Field() {
        createRandomField();
        addBlocks();
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
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
     * Create random Field
     */
    private void createRandomField() {
        buildRandomField();
        addPlayer();
        addEndTile(new EndTile(objects.length - 1, objects.length - 1, SIZE));
    }

    /**
     * Builds the game field with Tiles, Wall and Barricades
     */
    private void buildRandomField(){
        Random rand = new Random();

        //  Adds Tiles to 2D Array
        for (int x = 0; x < this.objects.length; x++) {
            for (int y = 0; y < this.objects.length; y++) {
                if (this.objects[x][y] == null) {
                    this.objects[x][y] = new Tile(x, y, SIZE);
                }
            }
        }

        //  Adds Walls to 2D Array
        for (int i = 0; i < 4; i++) {
            this.objects[rand.nextInt(GRID_SIZE)][rand.nextInt(GRID_SIZE)] = new Wall();
        }

        //  Adds Barricades to 2D Array
        for (int i = 0; i < 12; i++) {
            this.objects[rand.nextInt(GRID_SIZE)][rand.nextInt(GRID_SIZE)] = new Barricade(100);
        }
    }

    /**
     * Adds Player to 2D Array
     */
    private void addPlayer() {
        this.objects[0][0] = new Player(0,0,1);
    }

    /**
     * Adds EndTile to the 2D array of Blocks
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
        if (gameObject.getImage() == null) {
            gameObject.setIcon(null);
            return;
        }
        Image image = gameObject.getImage().getImage().getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
        gameObject.setIcon(new ImageIcon(image));
    }
}
