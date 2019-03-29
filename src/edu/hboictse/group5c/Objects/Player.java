package edu.hboictse.group5c.Objects;

import edu.hboictse.group5c.GameField.Levels;
import edu.hboictse.group5c.Objects.Blocks.*;
import javax.swing.*;

/**
 * Player Class
 *
 * @author Yuri Lamijo
 * @version 0.1
 */
public class Player extends GameObject {

    private Block[][] field;
    private Key key;
    private Object Wall;

    public Player(int level) {
        super(0, 0);
        Levels levels = new Levels(level);
        this.field = levels.getLevel();

        super.setImage(new ImageIcon("Images/Player.png"));
    }

    /**
     * Constructor of Player
     *
     * @param x Integer of the Player X position
     * @param y Integer of the Player Y position
     */
    public Player(int x, int y, int level) {
        super(x, y);
        Levels levels = new Levels(level);
        this.field = levels.getLevel();

        super.setImage(new ImageIcon("Images/Player.png"));
    }

    /**
     * Checks if Player will collide with a Tile, Barricade or Wall
     * @param nextBlock Block that is possible the nextBlock
     * @return A boolean if Player move is valid
     */
    public boolean checkMove(Block nextBlock) {
        if (nextBlock instanceof Barricade) {
            System.out.println("Barricade");
            int baricadeCode = ((Barricade) nextBlock).getCode();
            return checkBarricadeValue(baricadeCode);
        } else if (nextBlock instanceof Wall) {
            System.out.println("Wall");
            JOptionPane.showMessageDialog(null,"You shall not pass");
            return false;
        } else if (nextBlock instanceof Tile) {
            if (nextBlock.hasGameObject() && nextBlock.getGameObject() instanceof Key) {
                System.out.println("Key");
                JOptionPane.showMessageDialog(key,"You acquire the key!! you have the Key in your pocket now");
                this.pickUpKey((Key) nextBlock.getGameObject());
            }
            return true;
        }
        return false;
    }

    /**
     * Checks if the Key code and the Barricade code is the same
     * @param barricadeCode Integer of the barricade code
     * @return A boolean if Code of Key and Barricade is the same
     */
    public boolean checkBarricadeValue(int barricadeCode) {
        if (this.key == null) {
            JOptionPane.showMessageDialog(null,"To pass this barricade you need to acquire a key");
            System.out.println("NO KEY");
            return false;
        } else {
            if (barricadeCode == this.key.getCode()) {
                JOptionPane.showMessageDialog(key,"You have a key that's fit!! you can pass now");
                System.out.println("KEY !!!");
                return true;
            } else {
                System.out.println("WRONG KEY !!!");
                return false;
            }
        }
    }

    /**
     * Adds a Key to the Player pocket
     * @param key Key that the player picked up
     */
    public void pickUpKey(Key key) {
        this.key = key;
    }
}
