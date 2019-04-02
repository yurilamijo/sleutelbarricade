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

    private int levelNumber = 1;

    private Level level = new Level(levelNumber);
    private Player player;
    private Block[][] blocks = new Block[level.getBlocks().length][level.getBlocks().length];

    /**
     * Constructor of Field
     * Builds the level and sets the layout to a GridLayout
     */
    public Field() {
        this.player = new Player(0, 0);

        buildLevel(levelNumber);
        addBlocks();
        setLayout(new GridLayout(level.getBlocks().length, level.getBlocks().length));
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
     *
     * @param levelNumber Integer with the level Number
     */
    private void buildLevel(int levelNumber) {
        this.level = new Level(levelNumber);
        for (int y = 0; y < level.getBlocks().length; y++) {
            for (int x = 0; x < level.getBlocks()[y].length; x++) {
                switch (level.getBlocks()[y][x]) {
                    case 0:
                        this.blocks[y][x] = new Tile(x, y);
                        break;
                    case 1:
                        this.blocks[y][x] = new Wall(x, y);
                        break;
                    case 2:
                        this.blocks[y][x] = new Barricade(x, y, 100);
                        break;
                    case 3:
                        this.blocks[y][x] = new Barricade(x, y, 200);
                        break;
                    case 4:
                        this.blocks[y][x] = new Barricade(x, y, 300);
                        break;
                    case 5:
                        this.blocks[y][x] = new Tile(x, y);
                        this.blocks[y][x].setGameObject(new Key(100));
                        break;
                    case 6:
                        this.blocks[y][x] = new Tile(x, y);
                        this.blocks[y][x].setGameObject(new Key(200));
                        break;
                    case 7:
                        this.blocks[y][x] = new Tile(x, y);
                        this.blocks[y][x].setGameObject(new Key(300));
                        break;
                    case 8:
                        this.blocks[y][x] = new EndTile(x, y);
                        break;
                    case 9:
                        this.blocks[y][x] = new Tile(x, y);
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
     * Moves the PLayer in the field
     *
     * @param direction String with the direction
     */
    public void movePlayer(String direction) {
        final int speed = 1;
        int nextPos;
        int oldPosX = player.getPosX();
        int oldPosY = player.getPosY();

        switch (direction) {
            case "NORTH":
                nextPos = player.getPosY() - speed;
                this.checkMove(nextPos, direction);
                break;
            case "SOUTH":
                nextPos = player.getPosY() + speed;
                this.checkMove(nextPos, direction);
                break;
            case "EAST":
                nextPos = player.getPosX() + speed;
                this.checkMove(nextPos, direction);
                break;
            case "WEST":
                nextPos = player.getPosX() - speed;
                this.checkMove(nextPos, direction);
                break;
        }

        this.blocks[oldPosY][oldPosX] = new Tile(oldPosX, oldPosY);
        this.addPlayer(player);

        this.updateField();
    }

    /**
     * Check if player can move
     *
     * @param nextPos Integer with the next Y or X position
     * @param direction String of the direction of the Player
     */
    private void checkMove(int nextPos, String direction) {
        boolean checkNorthSouth = direction.equals("NORTH") || direction.equals("SOUTH");

        if (!this.checkEdge(nextPos, direction)) {
            Block nextBlock = checkNorthSouth ? blocks[nextPos][player.getPosX()] : blocks[player.getPosY()][nextPos];
            if (player.checkCollision(nextBlock)) {
                if (checkNorthSouth) {
                    player.setPosY(nextPos);
                } else {
                    player.setPosX(nextPos);
                }
            }
        }
    }

    /**
     * Checks if Player will move out of field
     *
     * @param nextPos Integer with the next Y or X position
     * @param direction String of the direction of the Player
     * @return A boolean if player is on the edge
     */
    private boolean checkEdge(int nextPos, String direction) {
        if (nextPos == -1 && direction.equals("NORTH") || nextPos == -1 && direction.equals("WEST") || nextPos >= blocks.length) {
            System.out.println("EDGE OF THE WORLD !!");
            return true;
        }
        return false;
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

    public Block[][] getBlocks() {
        return blocks;
    }
}
