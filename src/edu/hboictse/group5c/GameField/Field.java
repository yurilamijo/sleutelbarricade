package edu.hboictse.group5c.GameField;

import edu.hboictse.group5c.Objects.Blocks.*;
import edu.hboictse.group5c.Objects.Key;
import edu.hboictse.group5c.Objects.Player;
import javax.swing.*;
import java.awt.*;

/**
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Field extends JPanel {

    private static final int SIZE = 70;
    private static final int GRID_SIZE = 900 / SIZE;

    private Level level;
    private Player player;
    private Block[][] blocks = new Block[10][10];

    private int levelNumber = 1;

    public Field() {
        this.player = new Player(0, 0);

        buildLevel(levelNumber);
        addBlocks();
        setLayout(new GridLayout(10, 10));
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
     * Builds the level of the game
     * @param levelNumber Integer with the level Number
     */
    private void buildLevel(int levelNumber) {
        this.level = new Level(levelNumber);
        for (int y = 0; y < level.getBlocks().length; y++) {
            for (int x = 0; x < level.getBlocks()[y].length; x++) {
                switch (level.getBlocks()[y][x]) {
                    case 0:
                        this.blocks[y][x] = new Tile();
                        break;
                    case 1:
                        this.blocks[y][x] = new Wall();
                        break;
                    case 2:
                        this.blocks[y][x] = new Barricade(100);
                        break;
                    case 3:
                        this.blocks[y][x] = new Barricade(200);
                        break;
                    case 4:
                        this.blocks[y][x] = new Barricade(300);
                        break;
                    case 5:
                        this.blocks[y][x] = new Tile();
                        this.blocks[y][x].setGameObject(new Key(100));
                        break;
                    case 6:
                        this.blocks[y][x] = new Tile();
                        this.blocks[y][x].setGameObject(new Key(200));
                        break;
                    case 7:
                        this.blocks[y][x] = new Tile();
                        this.blocks[y][x].setGameObject(new Key(300));
                        break;
                    case 8:
                        this.blocks[y][x] = new EndTile();
                        break;
                    case 9:
                        this.blocks[y][x] = new Tile();
                        addPlayer(this.player);
                        break;
                }
            }
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
     *
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
     *
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
