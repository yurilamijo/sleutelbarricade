package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.Blocks.*;
import edu.hboictse.group5c.Objects.Key;
import edu.hboictse.group5c.Objects.Player;

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
    private Block[][] blocks = new Block[GRID_SIZE][GRID_SIZE];

    public Field() {
        this.player = new Player(0, 0, 1);

        createRandomField();
        addBlocks();
        setLayout(new GridLayout(GRID_SIZE, GRID_SIZE));
    }

    /**
     * Adds 2D Array objects with Tiles, Walls and Barricades to the JPanel
     */
    public void addBlocks() {
        for (Block[] blocks : this.blocks) {
            for (Block block : blocks) {
                add(block);
                setIcon(block);
            }
        }
    }

    /**
     * Creates random Field
     */
    public void createRandomField() {
        buildRandomField();
        addPlayer(this.player);
        addEndTile(new EndTile(blocks.length - 1, blocks.length - 1));
    }

    /**
     * Builds the game field with Tiles, Wall and Barricades
     */
    private void buildRandomField() {
        Random rand = new Random();

        //  Adds Tiles to 2D Array
        for (int y = 0; y < blocks.length; y++) {
            for (int x = 0; x < blocks[y].length; x++) {
                this.blocks[y][x] = new Tile();
            }
        }

        //  Adds Walls to 2D Array
        for (int i = 0; i < 4; i++) {
            this.blocks[rand.nextInt(GRID_SIZE)][rand.nextInt(GRID_SIZE)] = new Wall();
        }

        //  Adds Barricades to 2D Array
        for (int i = 0; i < 5; i++) {
            this.blocks[rand.nextInt(GRID_SIZE)][rand.nextInt(GRID_SIZE)] = new Barricade(100);
            this.blocks[rand.nextInt(GRID_SIZE)][rand.nextInt(GRID_SIZE)] = new Barricade(200);
            this.blocks[rand.nextInt(GRID_SIZE)][rand.nextInt(GRID_SIZE)] = new Barricade(300);
        }

        //  Adds Keys to 2D Array
        for (int i = 100; i <= 300; i += 100) {
            this.blocks[rand.nextInt(GRID_SIZE)][rand.nextInt(GRID_SIZE)].setGameObject(new Key(i));
        }
    }

    /**
     * Adds Player to 2D Array
     */
    public void addPlayer(Player player) {
        this.blocks[player.getPosY()][player.getPosX()].setGameObject(player);
    }

    /**
     * Adds EndTile to the 2D array of Blocks
     *
     * @param endTile
     */
    private void addEndTile(EndTile endTile) {
        this.blocks[endTile.getPosX()][endTile.getPosY()] = endTile;
    }

    /**
     * Moves the PLayer in the field
     * @param direction String with the direction
     */
    public void movePlayer(String direction) {
        final int speed = 1;
        int nextPos = 0;
        int oldPosX = player.getPosX();
        int oldPosY = player.getPosY();
        Block nextBlock = null;

        switch (direction) {
            case "NORTH":
                nextPos = player.getPosY() - speed;
                nextBlock = blocks[nextPos][player.getPosX()];
                if (player.checkMove(nextBlock)) {
                    player.setPosY(nextPos);
                }
                break;
            case "SOUTH":
                nextPos = player.getPosY() + speed;
                nextBlock = blocks[nextPos][player.getPosX()];
                if (player.checkMove(nextBlock)) {
                    player.setPosY(nextPos);
                }
                break;
            case "EAST":
                nextPos = player.getPosX() + speed;
                nextBlock = blocks[player.getPosY()][nextPos];
                if (player.checkMove(nextBlock)) {
                    player.setPosX(nextPos);
                }
                break;
            case "WEST":
                nextPos = player.getPosX() - speed;
                nextBlock = blocks[player.getPosY()][nextPos];
                if (player.checkMove(nextBlock)) {
                    player.setPosX(nextPos);
                }
                break;
        }

        this.blocks[oldPosY][oldPosX] = new Tile();
        this.addPlayer(player);

        this.updateField();
    }

    /**
     * Updates the field
     */
    private void updateField() {
        this.removeAll();
        this.addBlocks();
        this.revalidate();
        this.repaint();
    }

    /**
     * Sets the image of the Object
     * @param block Block to set the image
     */
    public static void setIcon(Block block) {
        final int imageSize = 70;
        Image image;

        if (block.getImage() == null) {
            block.setIcon(null);
            return;
        }

        if (block.hasGameObject()) {
            image = block.getGameObject().getImage().getImage().getScaledInstance(imageSize, imageSize, java.awt.Image.SCALE_SMOOTH);
        } else {
            image = block.getImage().getImage().getScaledInstance(imageSize, imageSize, java.awt.Image.SCALE_SMOOTH);
        }
        block.setIcon(new ImageIcon(image));
    }
}
