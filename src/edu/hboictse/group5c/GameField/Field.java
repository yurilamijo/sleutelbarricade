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

    private Player player;
    private GameObject[][] objects = new GameObject[GRID_SIZE][GRID_SIZE];

    public Field() {
        this.player = new Player(0,0,1);

        createRandomField();
        addBlocks();
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
    }

    /**
     * Adds 2D Array objects with Tiles, Walls and Barricades to the JPanel
     */
    public void addBlocks() {
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
    public void createRandomField() {
        buildRandomField();
        addPlayer(new Player(0,0,1));
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
    public void addPlayer(Player player) {
        this.objects[player.getPosY()][player.getPosX()] = player;
    }

    /**
     * Adds EndTile to the 2D array of Blocks
     * @param endTile
     */
    private void addEndTile(EndTile endTile) {
        this.objects[endTile.getPosX()][endTile.getPosY()] = endTile;
    }

    public void move(String direction) {
        int oldPosX = player.getPosX();
        int oldPosY = player.getPosY();

        switch (direction) {
            case "NORTH":
                player.setPosY(player.getPosY() - 1);
                break;
            case "SOUTH":
                player.setPosY(player.getPosY() + 1);
                break;
            case "EAST":
                player.setPosX(player.getPosX() + 1);
                break;
            case "WEST":
                player.setPosX(player.getPosX() - 1);
                break;
        }
        this.objects[oldPosY][oldPosX] = new Tile();
        addPlayer(player);
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
